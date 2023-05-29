package com.dx.facade.report.resp.proxynetamountmonth;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


/**
 * ProxyMonthNetAmountSummaryResp
 *
 * @author focus
 * @version 1.0.0
 * @since 2022年4月12日 下午8:34:03
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyMonthNetAmountSummaryRespDTO {

    /** betAmount */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount;

    /** validBetAmount */
    @ApiModelProperty(value = "有效投注", example = "1500.00")
    private BigDecimal validBetAmount;

    /** netAmount */
    @ApiModelProperty(value = "游戏盈亏", example = "1500.00")
    private BigDecimal netAmount;

    /** rebateAmount */
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal rebateAmount;

    /** discountAmount */
    @ApiModelProperty(value = "会员优惠", example = "1500.00")
    private BigDecimal discountAmount;

    /** artificialPatchAmount */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal artificialPatchAmount;

    /** proxyNet */
    @ApiModelProperty(value = "场馆费", example = "1500.00")
    private BigDecimal venueFee;

    /**
     * proxyRebatePoint
     */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebatePoint;

    /** proxyNet */
    @ApiModelProperty(value = "代净输赢", example = "1500.00")
    private BigDecimal proxyNet;

    /** lastMonthBalance */
    @ApiModelProperty(value = "上月结余", example = "1500.00")
    private BigDecimal lastMonthBalance;

    /** rushNet */
    @ApiModelProperty(value = "冲正后净输赢", example = "1500.00")
    private BigDecimal rushNet;
}
