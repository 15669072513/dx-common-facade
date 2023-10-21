package com.dx.facade.account.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "充值记录列表查询参数", description = "充值记录列表查询参数")
public class DepositOrderParamDTO {

    @ApiModelProperty("所属商户，支持多个")
    private List<Long> merchantIds;

    @ApiModelProperty("用户类型（0=会员/1=代理）")
    private Integer userType;

    @ApiModelProperty("申请时间开始")
    private LocalDateTime eventTimeStart;

    @ApiModelProperty("申请时间结束")
    private LocalDateTime eventTimeEnd;

    @ApiModelProperty("到账时间开始")
    private LocalDateTime payTimeStart;

    @ApiModelProperty("到账时间结束")
    private LocalDateTime payTimeEnd;

    @ApiModelProperty("订单来源")
    private Integer appType;

    @ApiModelProperty("订单状态,DepositOrderStatus")
    private Integer orderStatus;

    @ApiModelProperty("订单状态,DepositOrderStatus")
    private List<Integer> orderStatusList;

    @ApiModelProperty("支付方式")
    private Integer payType;

    @ApiModelProperty("子支付方式枚举，ThirdPaymentChannelEnum")
    private Integer subPayType;

    @ApiModelProperty("vip最小等级")
    private Integer vipLevelMin;

    @ApiModelProperty("vip最大等级")
    private Integer vipLevelMax;

    @ApiModelProperty("存款ip")
    private String ip;

    @ApiModelProperty("订单号")
    private String eventId;

    @ApiModelProperty("会员/代理账号")
    private String userName;
    @ApiModelProperty("会员/代理id")
    private String userId;
    @ApiModelProperty("存款类型，会员中心钱包=1，代理佣金余额=6,代理额度余额=7")
    private List<Integer> bizTypes;

    @ApiModelProperty("存款人姓名")
    private String realName;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty(value = "支付厂商")
    private String payMerchantName;

    @ApiModelProperty(
            value = "排序列名，eventTime或者payTime",
            example = "eventTime"
    )
    private String orderKey;
    @ApiModelProperty(
            value = "排序方式(1)：desc-降序 asc-升序",
            example = "asc"
    )
    private String sortType;

    public void check(){
        //Assert.notEmpty(bizTypes, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("bizTypes"));
    }


}
