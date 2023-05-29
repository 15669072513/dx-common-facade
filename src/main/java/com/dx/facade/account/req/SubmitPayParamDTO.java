package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.account.exception.ErrorCode;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmitPayParamDTO {

    @ApiModelProperty("会员专用:会员对象")
    private MemberInfoRespDTO memberBO;

    @ApiModelProperty("用户类型，0:会员;1:代理")
    private Integer userType;

    @ApiModelProperty("所属商户id")
    private Long merchantId;
    @ApiModelProperty("充值金额")
    private Integer orderAmount;
    @ApiModelProperty("支付通道配置id,从支付通道列表接口中返回的数据获取")
    private Long paymentChannelId;
    @ApiModelProperty("银行id")
    private Long bankId;
    @ApiModelProperty("虚拟币协议")
    private String virtualProtocol;
    @ApiModelProperty("订单编号")
    private String eventId;
    @ApiModelProperty("设备id")
    private String deviceId;
    @ApiModelProperty("设备类型")
    private Integer deviceType;
    @ApiModelProperty("登陆ip")
    private String loginIp;

    @ApiModelProperty("代理专用:业务类型 6:代理佣金充值，7:代理额度充值")
    private Integer bizType;

    @ApiModelProperty("存款人姓名")
    private String realName;

    @ApiModelProperty("是否在游戏内充值, 1=美播百家乐游戏内充值, 2=游戏外充值")
    private Integer inGameDeposit;

    @ApiModelProperty("代理专用:代理信息")
    private ProxyInfoRespDTO proxyBO;


    public void check() {
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(orderAmount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("orderAmount"));
        Assert.notNull(paymentChannelId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("paymentChannelId"));
        Assert.hasText(eventId,ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));
        Assert.hasText(deviceId,ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("deviceId"));
        Assert.hasText(loginIp,ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("loginIp"));
        Assert.notNull(deviceType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("deviceType"));
        if (userType.intValue() == 0){
            Assert.notNull(memberBO, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("memberBO"));
        } else if (userType.intValue() == 1) {
            Assert.notNull(proxyBO, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyBO"));
            Assert.isTrue(bizType.intValue() == 6 || bizType.intValue() ==7, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("bizType"));
        }
    }

}
