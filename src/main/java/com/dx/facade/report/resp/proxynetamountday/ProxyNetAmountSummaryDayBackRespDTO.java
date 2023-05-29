package com.dx.facade.report.resp.proxynetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyNetAmountMonthSummaryBackRespDTO
 * 中控后台-代理盈亏日-合计/小计
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:35:48
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountSummaryDayBackRespDTO {

    /**
     * betCountTotal
     */
    @ApiModelProperty(value = "注单量", example = "200")
    private Long betCount = 0L;

    /**
     * memberCountTotal
     */
    @ApiModelProperty(value = "投注人数", example = "100")
    private Long memberCount = 0L;

    /**
     * betAmountTotal
     */
    @ApiModelProperty(value = "总投注CNY", example = "1500.00")
    private BigDecimal betAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总投注VND", example = "1500.00")
    private BigDecimal betAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总投注THB", example = "1500.00")
    private BigDecimal betAmountTHB = BigDecimal.ZERO;

    /**
     * validBetAmountTotal
     */
    @ApiModelProperty(value = "总有效投注CNY", example = "1500.00")
    private BigDecimal validBetAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总有效投注VND", example = "1500.00")
    private BigDecimal validBetAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总有效投注合计THB", example = "1500.00")
    private BigDecimal validBetAmountTHB = BigDecimal.ZERO;

    /**
     * netAmountTotal
     */
    @ApiModelProperty(value = "投注盈亏CNY", example = "1500.00")
    private BigDecimal netAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "投注盈亏VND", example = "1500.00")
    private BigDecimal netAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "投注盈亏THB", example = "1500.00")
    private BigDecimal netAmountTHB = BigDecimal.ZERO;

    /**
     * venueFeeTotal
     */
    @ApiModelProperty(value = "场馆费CNY", example = "1500.00")
    private BigDecimal venueFeeCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "场馆费VND", example = "1500.00")
    private BigDecimal venueFeeVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "场馆费THB", example = "1500.00")
    private BigDecimal venueFeeTHB = BigDecimal.ZERO;

    /**
     * rebateAmountTotal
     */
    @ApiModelProperty(value = "总返水CNY", example = "1500.00")
    private BigDecimal rebateAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总返水VND", example = "1500.00")
    private BigDecimal rebateAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总返水THB", example = "1500.00")
    private BigDecimal rebateAmountTHB = BigDecimal.ZERO;

    /**
     * discountAmountTotal
     */
    @ApiModelProperty(value = "总优惠CNY", example = "1500.00")
    private BigDecimal discountAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总优惠VND", example = "1500.00")
    private BigDecimal discountAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总优惠THB", example = "1500.00")
    private BigDecimal discountAmountTHB = BigDecimal.ZERO;

    /**
     * proxyRebatePointTotal
     */
    @ApiModelProperty(value = "总返点CNY", example = "1500.00")
    private BigDecimal proxyRebatePointCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总返点VND", example = "1500.00")
    private BigDecimal proxyRebatePointVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总返点THB", example = "1500.00")
    private BigDecimal proxyRebatePointTHB = BigDecimal.ZERO;

    /**
     * artificialPatchAmountTotal
     */
    @ApiModelProperty(value = "其他调整CNY", example = "1500.00")
    private BigDecimal artificialPatchAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "其他调整VND", example = "1500.00")
    private BigDecimal artificialPatchAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "其他调整THB", example = "1500.00")
    private BigDecimal artificialPatchAmountTHB = BigDecimal.ZERO;

    /**
     * repairBetAmountTotal
     */
    @ApiModelProperty(value = "补单输赢合计", example = "1500.00")
    private BigDecimal repairBetAmount = BigDecimal.ZERO;

    /**
     * proxyNetTotal
     */
    @ApiModelProperty(value = "代理净输赢CNY", example = "1500.00")
    private BigDecimal proxyNetCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "代理净输赢VND", example = "1500.00")
    private BigDecimal proxyNetVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "代理净输赢THB", example = "1500.00")
    private BigDecimal proxyNetTHB = BigDecimal.ZERO;

    /**
     * lastMonthBalanceTotal
     */
    @ApiModelProperty(value = "上月结余CNY", example = "1500.00")
    private BigDecimal lastMonthBalanceCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "上月结余VND", example = "1500.00")
    private BigDecimal lastMonthBalanceVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "上月结余THB", example = "1500.00")
    private BigDecimal lastMonthBalanceTHB = BigDecimal.ZERO;

    /**
     * rushNetTotal
     */
    @ApiModelProperty(value = "冲正净输赢CNY", example = "1500.00")
    private BigDecimal rushNetCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "冲正净输赢VND", example = "1500.00")
    private BigDecimal rushNetVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "冲正净输赢THB", example = "1500.00")
    private BigDecimal rushNetTHB = BigDecimal.ZERO;

    /**
     * directBetAmountTotal
     */
    @ApiModelProperty(value = "直属会员总投注CNY", example = "1500.00")
    private BigDecimal directBetAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "直属会员总投注VND", example = "1500.00")
    private BigDecimal directBetAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "直属会员总投注THB", example = "1500.00")
    private BigDecimal directBetAmountTHB = BigDecimal.ZERO;

    /**
     * directValidBetAmountTotal
     */
    @ApiModelProperty(value = "直属会员有效投注CNY", example = "1500.00")
    private BigDecimal directValidBetAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "直属会员有效投注VND", example = "1500.00")
    private BigDecimal directValidBetAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "直属会员有效投注THB", example = "1500.00")
    private BigDecimal directValidBetAmountTHB = BigDecimal.ZERO;

    /**
     * directNetAmountTotal
     */
    @ApiModelProperty(value = "直属会员投注盈亏CNY", example = "1500.00")
    private BigDecimal directNetAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "直属会员投注盈亏VND", example = "1500.00")
    private BigDecimal directNetAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "直属会员投注盈亏THB", example = "1500.00")
    private BigDecimal directNetAmountTHB = BigDecimal.ZERO;

    /**
     * directPayAmountTotal
     */
    @ApiModelProperty(value = "直属会员净盈亏CNY", example = "1500.00")
    private BigDecimal directProfitAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "直属会员净盈亏VND", example = "1500.00")
    private BigDecimal directProfitAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "直属会员净盈亏THB", example = "1500.00")
    private BigDecimal directProfitAmountTHB = BigDecimal.ZERO;

}
