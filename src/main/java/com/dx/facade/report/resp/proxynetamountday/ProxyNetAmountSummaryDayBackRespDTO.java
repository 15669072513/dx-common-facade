package com.dx.facade.report.resp.proxynetamountday;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

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

    /** betAmount */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount;

    /** validBetAmount */
    @ApiModelProperty(value = "总有效投注", example = "1500.00")
    private BigDecimal validBetAmount;

    /** flowCorrection */
    @ApiModelProperty(value = "流水纠正", example = "1500.00")
    private BigDecimal flowCorrection;

    /** memberCount */
    @ApiModelProperty(value = "投注人数", example = "100")
    private Long memberCount;

    /** betCount */
    @ApiModelProperty(value = "注单量", example = "200")
    private Long betCount;

    /** netAmount */
    @ApiModelProperty(value = "会员总输赢", example = "1500.00")
    private BigDecimal netAmount;



    /** memberRebateAmount */
    @ApiModelProperty(value = "会员返水,0.2.1", example = "1500.00")
    private BigDecimal memberRebateAmount;


    /** memberRebateAmount */
    @ApiModelProperty(value = "会员其他调整 0.2.1", example = "1500.00")
    private BigDecimal memberArtificalPathAmount;



    /** memberRebateAmount */
    @ApiModelProperty(value = "会员净输赢 0.2.1", example = "1500.00")
    private BigDecimal memberNetWinAmount;
    /** venueFee */
    @ApiModelProperty(value = "场馆费", example = "1500.00")
    private BigDecimal venueFee;

    /** rebateAmount */
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal rebateAmount;

    /** discountAmount */
    @ApiModelProperty(value = "会员优惠", example = "1500.00")
    private BigDecimal discountAmount;

    /** proxyRebatePoint */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebatePoint;

    /** artificialPatchAmount */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal artificialPatchAmount;

    /** repairBetAmount */
    @ApiModelProperty(value = "补单输赢", example = "1500.00")
    private BigDecimal repairBetAmount;

    /** proxyNet */
    @ApiModelProperty(value = "代理商净输赢", example = "1500.00")
    private BigDecimal proxyNet;

    /** lastMonthBalance */
    @ApiModelProperty(value = "上月结余", example = "1500.00")
    private BigDecimal lastMonthBalance;

    /** rushNet */
    @ApiModelProperty(value = "冲正后输赢", example = "1500.00")
    private BigDecimal rushNet;

    /** directBetAmount */
    @ApiModelProperty(value = "直属会员总投注", example = "1500.00")
    private BigDecimal directBetAmount;

    /** directValidBetAmount */
    @ApiModelProperty(value = "直属会员有效投注", example = "1500.00")
    private BigDecimal directValidBetAmount;

    /** directNetAmount */
    @ApiModelProperty(value = "直属会员总输赢/投注盈亏", example = "1500.00")
    private BigDecimal directNetAmount;

    /** directPayAmount */
    @ApiModelProperty(value = "直属会员净输赢", example = "1500.00")
    private BigDecimal directProfitAmount;

    @ApiModelProperty(value = "其他调整金额")
    private BigDecimal adjustAmount;

    @ApiModelProperty("直属返水金额=会员返水")
    private BigDecimal directRebateAmount;

    @ApiModelProperty("直属其他调整=人工加减额中的其他调整额")
    private BigDecimal directArtificialPatchAmount;

    @ApiModelProperty("直属会员净盈亏 = 直属会员投注盈亏+  直属会员返水（新的）+直属会员其他调整")
    private BigDecimal directNetwinAmount;


}
