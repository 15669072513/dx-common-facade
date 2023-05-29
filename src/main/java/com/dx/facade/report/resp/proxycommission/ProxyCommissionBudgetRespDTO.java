package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * ProxyCommissionBudgetRespDto
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午2:15:48
 */
@Data
@ToString
public class ProxyCommissionBudgetRespDTO  extends ProxyContractItemDisplayFlagRespDTO{

    @ApiModelProperty(value = "代理ID", required = true, example = "1")
    private Long proxyId;

    @ApiModelProperty(value = "佣金测算开始时间", required = true, example = "2021-08-01")
    private String statisticsStartTime;

    @ApiModelProperty(value = "佣金测算结束时间", required = true, example = "2021-08-30")
    private String statisticsEndTime;

    @ApiModelProperty(value = "截至佣金截止日还有多少天", required = true, example = "7")
    private Integer statisticsRemainingDay;

    @ApiModelProperty(value = "代理账号", required = true, example = "soLong01")
    private String proxyAccount;

    @ApiModelProperty(value = "预计团队拥金", required = true, example = "10000.00")
    private BigDecimal totalCommissionAmount;

    @ApiModelProperty(value = "预计个人拥金", required = true, example = "10000.00")
    private BigDecimal totalPersonCommissionAmount;

    @ApiModelProperty(value = "预计下级代理拥金", required = true, example = "10000.00")
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
    private BigDecimal totalAcctadjustAmount;

    @ApiModelProperty(value = "代理总返点（有返点契约的代理才有该项）", required = false, example = "10000.00")
    private BigDecimal totalProxyRebateAmount;

    @ApiModelProperty(value = "代理净输赢", required = true, example = "10000.00")
    private BigDecimal totalNetwinAmount;

    @ApiModelProperty(value = "代理上月结余", required = true, example = "10000.00")
    private BigDecimal totalLastAmount;

    @ApiModelProperty(value = "代理冲正净输赢", required = true, example = "10000.00")
    private BigDecimal totalAdjustnetwinAmount;

    @ApiModelProperty(value = "返佣比例", required = true, example = "0.5")
    private BigDecimal commissionRate;

    @ApiModelProperty(value = "返佣金额", required = true, example = "10000.00")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "优惠比例", required = true, example = "0.4")
    private BigDecimal rewardRate;

    @ApiModelProperty(value = "优惠佣金", required = true, example = "10000.00")
    private BigDecimal rewardAmount;

    @ApiModelProperty(value = "优惠契约ID", required = true, example = "1")
    private Long contractId;

    @ApiModelProperty(value = "'佣金契约等级序号'", required = true, example = "1")
    private Integer commissionVipSerialnum;

    @ApiModelProperty(value = "VIP专享等级序号", required = true, example = "1")
    private Integer rewardSerialnum;

    @ApiModelProperty(value = "VIP专享等级", required = true, example = "1")
    private String rewardLevel;

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
