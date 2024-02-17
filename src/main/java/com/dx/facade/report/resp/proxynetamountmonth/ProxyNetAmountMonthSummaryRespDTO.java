package com.dx.facade.report.resp.proxynetamountmonth;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyNetAmountMonthSummaryRespDTO
 * 合计/小计
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:35:48
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountMonthSummaryRespDTO {

    /**
     * betAmount
     */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount;

    /**
     * validBetAmount
     */
    @ApiModelProperty(value = "总有效投注", example = "1500.00")
    private BigDecimal validBetAmount;

    /**
     * memberCount
     */
    @ApiModelProperty(value = "投注人数", example = "100")
    private Long memberCount;

    /**
     * betCount
     */
    @ApiModelProperty(value = "注单量", example = "200")
    private Long betCount;

    /**
     * netAmount
     */
    @ApiModelProperty(value = "会员总输赢", example = "1500.00")
    private BigDecimal netAmount;

    /**
     * proxyRebatePoint
     */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebatePoint;

    /**
     * proxyRebatePoint
     */
    @ApiModelProperty(value = "代理返点其他调整", example = "1500.00")
    private BigDecimal proxyArtificialPatchAmount;
    @Deprecated
    /** rebateAmount */
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal memberRebateAmount;

    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;

    /**
     * artificialPatchAmount
     */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal memberArtificialPatchAmount;

    @ApiModelProperty(value = "场馆费用", example = "1500.00")
    private BigDecimal venueFee;

    @ApiModelProperty(value = "代理净输赢", example = "1500.00")
    private BigDecimal proxyNetwinAmount;

    @ApiModelProperty(value = "上期结余", example = "1500.00")
    private BigDecimal lastMonthBalance;


    @ApiModelProperty(value = "代理冲正输赢", example = "1500.00")
    private BigDecimal proxyRushNet;


    @ApiModelProperty(value = "直属会员总投注", example = "1500.00")
    private BigDecimal directBetAmount;

    @ApiModelProperty(value = "直属会员有效投注", example = "1500.00")
    private BigDecimal directValidBetAmount;

    @ApiModelProperty(value = "直属会员总输赢/投注盈亏", example = "1500.00")
    private BigDecimal directNetAmount;

    @Deprecated
    @ApiModelProperty("直属返水金额=会员返水")
    private BigDecimal directRebateAmount;

    @ApiModelProperty("直属会员代理发放会员返水")
    private BigDecimal directMemberRebateAmountByProxy;


    @ApiModelProperty("直属会员平台发放会员返水")
    private BigDecimal directMemberRebateAmountByPlat;
    @ApiModelProperty("直属其他调整=人工加减额中的其他调整额")
    private BigDecimal directArtificialPatchAmount;

    @ApiModelProperty("直属会员净盈亏 = 直属会员投注盈亏+  直属会员返水（新的）+直属会员其他调整")
    private BigDecimal directNetwinAmount;

    @ApiModelProperty("服务费-局抽")
    private BigDecimal serviceChargeRound;
}
