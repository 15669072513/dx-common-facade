package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员vip奖励发放记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberVipRewardFlinkReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long userId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "VIP等级名称")
    private String vipName;

    @ApiModelProperty(value = "vip等级序号")
    private Integer vipSerialNum;

    @ApiModelProperty(value = "账号类型（1-试玩,2-商务,3-正式,4-测试,5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "标签名称")
    private String labelName;

    @ApiModelProperty(value = "记录日期")
    private Long reportDate;

    @ApiModelProperty(value = "上级代理id")
    private Long parentProxyId;

    @ApiModelProperty(value = "福利类型 1-会员VIP奖励 2-好友邀请")
    private Integer rewardType;

    @ApiModelProperty(value = "发放类型 福利类型 1-会员VIP奖励时，1-升级礼金;2-生日礼金;3-上半月红包;4-下半月红包 福利类型 2-好友邀请时，1-邀请任务 2-存款任务 3-投注任务")
    private Integer provideType;

    @ApiModelProperty(value = "好友邀请角色类型：0-无效 1-邀请人 2-被邀请人")
    private Integer inviteRuleType;

    @ApiModelProperty(value = "被邀请人账号")
    private String inviteesUserName;

    @ApiModelProperty(value = "发放金额")
    private BigDecimal provideAmount;

    @ApiModelProperty(value = "红利发放类型: 1-系统发放")
    private Integer sendType;

    @ApiModelProperty(value = "红利发送位置: 1-现金钱包 2-红利中心")
    private Integer sendPosition;

    @ApiModelProperty(value = "发放状态（0待发放/1-已发放/2-发放失败）")
    private Integer provideStatus;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "业务ID")
    private String bizId;

    @ApiModelProperty(value = "领取时间")
    private LocalDateTime provideAt;

    @ApiModelProperty(value = "父级代理名称")
    private String parentProxyName;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDt;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "发送状态（0-待发送/1-已发送/2-发送失败）")
    private Integer sendStatus;

    @ApiModelProperty(value = "发送时间")
    private LocalDateTime sendTime;
}