package com.dx.facade.report.resp.venuenetamountday;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VenueNetAmountDaySummaryRespDTO {

    @ApiModelProperty("投注人数")
    protected Long memberCount = 0L;

    @ApiModelProperty("注单量")
    protected Long betCount = 0L;

    @ApiModelProperty("投注金额")
    protected BigDecimal betAmount = BigDecimal.ZERO;
    @ApiModelProperty("有效投注")
    protected BigDecimal validBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏")
    protected BigDecimal netAmount = BigDecimal.ZERO;

    @ApiModelProperty("盈利率(使用时直接加%即可)")
    private BigDecimal netRate = BigDecimal.ZERO;


    @ApiModelProperty("投注金额CNY")
    protected BigDecimal betAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("投注金额VND")
    protected BigDecimal betAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("投注金额THB")
    protected BigDecimal betAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("有效投注CNY")
    protected BigDecimal validBetAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("有效投注VND")
    protected BigDecimal validBetAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("有效投注THB")
    protected BigDecimal validBetAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏CNY")
    protected BigDecimal netAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏VND")
    protected BigDecimal netAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏THB")
    protected BigDecimal netAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("会员抽水分成")
    protected BigDecimal memberPumpPercentageAmount = BigDecimal.ZERO;

    @ApiModelProperty("代理抽水分成（返点+返佣）")
    protected BigDecimal proxyPumpPercentageAmount = BigDecimal.ZERO;

    @ApiModelProperty("代理抽水分成（返点）")
    protected BigDecimal dxProxyPumpPercentageAmountRebate = BigDecimal.ZERO;

    @ApiModelProperty("代理抽水分成（返佣）")
    protected BigDecimal dxProxyPumpPercentageAmountCommission = BigDecimal.ZERO;

    @ApiModelProperty("公司抽水分成")
    protected BigDecimal companyPumpPercentageAmount = BigDecimal.ZERO;

    @ApiModelProperty("会员保险盈亏")
    private BigDecimal memberInsuredNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("代理保险盈亏")
    private BigDecimal proxyInsuredNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("公司保险盈亏")
    private BigDecimal companyInsuredNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("德州俱乐部投注额")
    private BigDecimal pumpBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("德州保险投注额")
    private BigDecimal insuredBetAmount = BigDecimal.ZERO;


}
