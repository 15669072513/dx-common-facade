package com.dx.facade.report.resp;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameNetAmountSummaryRespDTO {

    @ApiModelProperty(value = "总投注人数")
    protected Long memberCount = 0L;

    @ApiModelProperty(value = "总注单量")
    protected Long betCount = 0L;

    @ApiModelProperty("投注金额")
    protected BigDecimal betAmount = BigDecimal.ZERO;

    @ApiModelProperty("投注金额")
    protected BigDecimal validBetAmount= BigDecimal.ZERO;

    @ApiModelProperty("投注金额")
    protected BigDecimal netAmount = BigDecimal.ZERO;

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
}
