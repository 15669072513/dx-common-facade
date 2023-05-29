package com.dx.facade.report.resp.proxycommission;


import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProxyCommissionRecordRespNewDTO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "上级代理id")
    private Long parentProxyId;

    private String parentProxyName;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "代理层级ID")
    private Long proxyLevelId;

    private String proxyLevelName;

    private String proxyName;

    private String proxyPath;

    @ApiModelProperty(value = "代理线层级上限")
    private Integer maxLevels;

    private String orderNo;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "当前锁单时间")
    private LocalDateTime lockTime;

    private String lockAccount;

    @ApiModelProperty(value = "结算年月")
    private Integer reportYm;

    @ApiModelProperty(value = "报表日期，每月一条")
    private Integer reportDate;

    @ApiModelProperty(value = "会员游戏亏损金额")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "场馆费")
    private BigDecimal totalPlatformAmount;

    @ApiModelProperty(value = "会员总优惠")
    private BigDecimal totalDiscountAmount;

    @ApiModelProperty(value = "返水")
    private BigDecimal totalRebateAmount;

    @ApiModelProperty(value = "账号调整")
    private BigDecimal totalAdjustAmount;

    @ApiModelProperty(value = "补单输赢")
    private BigDecimal totalPatchNetAmount;

    @ApiModelProperty(value = "净输赢")
    private BigDecimal totalPureAmount;

    @ApiModelProperty(value = "上月结余")
    private BigDecimal totalLastAmount;

    @ApiModelProperty(value = "冲正后净输赢")
    private BigDecimal totalRushAmount;

    @ApiModelProperty(value = "本月活跃用户")
    private Integer monthActiveNum;

    @ApiModelProperty(value = "本月活跃用户")
    private Integer monthActiveNumNew;

    @ApiModelProperty(value = "本月有效活跃用户数")
    private Integer monthEffecactiveNum;

    @ApiModelProperty(value = "本月新增有效活跃用户数")
    private Integer monthEffecactiveNumNew;

    @ApiModelProperty(value = "流水纠正金额")
    private BigDecimal betAdjustAmount;

    @ApiModelProperty(value = "会员游戏流水金额")
    private BigDecimal totalBetAmount;

    @ApiModelProperty(value = "会员有效游戏流水金额")
    private BigDecimal totalValidBetAmount;

    @ApiModelProperty(value = "会员游戏注单量")
    private Integer totalBetNum;

    @ApiModelProperty(value = "会员游戏人数")
    private Integer totalBetMemberNum;

    @ApiModelProperty(value = "总返点金额")
    private BigDecimal totalProxyRebateAmount;

    @ApiModelProperty(value = "佣金比例")
    private BigDecimal commissionRate;

    @ApiModelProperty(value = "代理佣金")
    private BigDecimal commissionOnlyAmount;

    @ApiModelProperty(value = "等级专享")
    private BigDecimal rewardAmount;

    @ApiModelProperty(value = "团队拥金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "佣金调整金额")
    private BigDecimal commissionAdjustAmount;

    @ApiModelProperty(value = "佣金后台调整加额")
    private BigDecimal commissionAdjustBackAddAmount;

    @ApiModelProperty(value = "佣金后台调整减额")
    private BigDecimal commissionAdjustBackSubAmount;

    private String recordDesc;

    @ApiModelProperty(value = "佣金契约ID")
    private Long contractId;

    @ApiModelProperty(value = "佣金契约等级序号")
    private Integer contractLevel;

    @ApiModelProperty(value = "代理VIP等级专享层级ID")
    private Integer proxyVipLevel;

    private String proxyVipLevelName;

    @ApiModelProperty(value = "代理VIP等级专享层级比例")
    private BigDecimal proxyVipLevelRate;

    @ApiModelProperty(value = "代理VIP等级专享层级最大")
    private BigDecimal proxyVipLevelMax;

    @ApiModelProperty(value = "个人佣金")
    private BigDecimal totalPersonCommissionAmount;

    @ApiModelProperty(value = "下级代理佣金")
    private BigDecimal totalChildCommissionAmount;

    @ApiModelProperty(value = "剩余未收金额")
    private BigDecimal notRecviedAmount;

    @ApiModelProperty(value = "剩余未付金额")
    private BigDecimal notPayAmount;

    @ApiModelProperty(value = "实际收益金额")
    private BigDecimal realPersonCommissionAmount;

    @ApiModelProperty(value = "报表创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "客户端状态(0-已取消 1-收付款未结清 2-收款未结清，付款已结清 3-收已结清，付款未结清(已发放) 4-收付款都已结清(已发放) 5-无佣金 )")
    private Integer payoutStatus;

    @ApiModelProperty(value = "非总代佣金取消标志 0-未取消 1-已取消")
    private Integer cancelFlag;

    @ApiModelProperty(value = "派发时间")
    private LocalDateTime payoutTime;

    private String audit1Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime audit1Time;

    @ApiModelProperty(value = "审核备注1")
    private String audit1Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit1Cost;

    private String audit2Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit2Result;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "审核备注2")
    private String audit2Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @TableField(exist = false)
    private Integer  accountLockStatus;

    @TableField(exist = false)
    private Integer loginLockStatus;

    @TableField(exist = false)
    private String windControlName;

    @TableField(exist = false)
    private Integer contractRebate;
}
