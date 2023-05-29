package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * ProxyCommissionHistoryRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午2:15:48
 */
@Data
@ToString
public class ProxyCommissionHistoryRespDTO  extends ProxyContractItemDisplayFlagRespDTO{

    @ApiModelProperty(value = "代理ID", required = true, example = "1")
    private Long proxyId;

    @ApiModelProperty(value = "代理线层级上限", required = true, example = "1")
    private Integer maxLevels;

    @ApiModelProperty(value = "代理层级ID", required = true, example = "1")
    private Long proxyLevelId;

    @ApiModelProperty(value = "代理账号", required = true, example = "soLong01")
    private String proxyAccount;

    @ApiModelProperty(value = "佣金状态(0-已取消 1-未结清 2-已结清(已发放) 3-无佣金)，总代角色下已结清就是已发放", required = true, example = "0")
    private Integer payoutStatus;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 5-二审通过", required = true, example = "0")
    private Integer orderStatus;

    @ApiModelProperty(value = "结算周期", required = true, example = "202109")
    private Integer reportYm;

    @ApiModelProperty(value = "团队拥金", required = true, example = "10000.00")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "个人拥金", required = true, example = "10000.00")
    private BigDecimal totalPersonCommissionAmount;

    @ApiModelProperty(value = "下级代理拥金", required = true, example = "10000.00")
    private BigDecimal totalChildCommissionAmount;

    @ApiModelProperty(value = "会员总盈亏", required = true, example = "10000.00")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "会员总优惠", required = true, example = "10000.00")
    private BigDecimal totalDiscountAmount;

    @ApiModelProperty(value = "会员总返水", required = true, example = "10000.00")
    private BigDecimal totalRebateAmount;

    @ApiModelProperty(value = "总场馆费", required = true, example = "10000.00")
    private BigDecimal totalPlatformAmount;

    @ApiModelProperty(value = "会员账户调整", required = true, example = "10000.00")
    private BigDecimal totalAdjustAmount;

    @ApiModelProperty(value = "代理总返点（有返点契约的代理才有该项）", required = false, example = "10000.00")
    private BigDecimal totalProxyRebateAmount;

    @ApiModelProperty(value = "代理净输赢", required = true, example = "10000.00")
    private BigDecimal totalPureAmount;

    @ApiModelProperty(value = "代理上月结余", required = true, example = "10000.00")
    private BigDecimal totalLastAmount;

    @ApiModelProperty(value = "代理冲正净输赢", required = true, example = "10000.00")
    private BigDecimal totalRushAmount;

    @ApiModelProperty(value = "返佣比例", required = true, example = "0.5")
    private BigDecimal commissionRate;

    @ApiModelProperty(value = "返佣金额", required = true, example = "10000.00")
    private BigDecimal commissionOnlyAmount;

    @ApiModelProperty(value = "优惠比例", required = true, example = "0.4")
    private BigDecimal proxyVipLevelRate;

    @ApiModelProperty(value = "优惠佣金", required = true, example = "10000.00")
    private BigDecimal rewardAmount;

    @ApiModelProperty(value = "优惠契约ID", required = true, example = "1")
    private Long contractId;

    @ApiModelProperty(value = "佣金契约等级序号")
    private Integer contractLevel;

    @ApiModelProperty(value = "'VIP专享等级序号", required = true, example = "1")
    private String proxyVipLevelName;

    @ApiModelProperty(value = "VIP专享等级", required = true, example = "1")
    private Integer proxyVipLevel;

    @ApiModelProperty(value = "剩余未付金额")
    private BigDecimal notPayAmount;

    @ApiModelProperty(value = "返点契约:0：无契约，1：有契约", required = true, example = "1")
    private Integer contractRebate;

    @ApiModelProperty(value = "本月活跃用户")
    private Integer monthActiveNum;

    @ApiModelProperty(value = "本月新增有效活跃用户数")
    private Integer monthEffecactiveNumNew;

    @ApiModelProperty(value = "预计佣金加减金额")
    private BigDecimal adjustCommissionAmount;

    @ApiModelProperty(value = "会员游戏流水金额")
    private BigDecimal totalBetAmount;

    @ApiModelProperty(value = "会员游戏有效流水金额")
    private BigDecimal totalValidBetAmount;

    @ApiModelProperty(value = "本月有效活跃用户数")
    private Integer monthEffecactiveNum;
}
