package com.dx.facade.report.resp.accessamountday;

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
public class AccessAmountDaySummaryRespDTO {

    @ApiModelProperty("三方入款CNY")
    private BigDecimal depositAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("三方入款VND")
    private BigDecimal depositAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("三方入款THB")
    private BigDecimal depositAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("人工入款CNY")
    private BigDecimal backDepositAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("人工入款VND")
    private BigDecimal backDepositAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("人工入款THB")
    private BigDecimal backDepositAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("三方出款CNY")
    private BigDecimal withdrawalAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("三方出款VND")
    private BigDecimal withdrawalAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("三方出款THB")
    private BigDecimal withdrawalAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("人工出款CNY")
    private BigDecimal backWithdrawalAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("人工出款VND")
    private BigDecimal backWithdrawalAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("人工出款THB")
    private BigDecimal backWithdrawalAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("总入款CNY")
    private BigDecimal depositAmountTotalCNY = BigDecimal.ZERO;
    @ApiModelProperty("总入款VND")
    private BigDecimal depositAmountTotalVND = BigDecimal.ZERO;
    @ApiModelProperty("总入款THB")
    private BigDecimal depositAmountTotalTHB = BigDecimal.ZERO;

    @ApiModelProperty("总出款CNY")
    private BigDecimal withdrawalAmountTotalCNY = BigDecimal.ZERO;
    @ApiModelProperty("总出款VND")
    private BigDecimal withdrawalAmountTotalVND = BigDecimal.ZERO;
    @ApiModelProperty("总出款THB")
    private BigDecimal withdrawalAmountTotalTHB = BigDecimal.ZERO;

    @ApiModelProperty("存取差CNY")
    private BigDecimal accessAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("存取差VND")
    private BigDecimal accessAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("存取差THB")
    private BigDecimal accessAmountTHB = BigDecimal.ZERO;
}
