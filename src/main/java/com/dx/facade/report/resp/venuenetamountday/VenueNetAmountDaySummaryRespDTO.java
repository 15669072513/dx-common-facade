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
    private Long memberCount = 0L;

    @ApiModelProperty("注单量")
    private Long betCount = 0L;

    @ApiModelProperty("投注金额CNY")
    private BigDecimal betAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("投注金额VND")
    private BigDecimal betAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("投注金额THB")
    private BigDecimal betAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("有效投注CNY")
    private BigDecimal validBetAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("有效投注VND")
    private BigDecimal validBetAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("有效投注THB")
    private BigDecimal validBetAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏CNY")
    private BigDecimal netAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏VND")
    private BigDecimal netAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏THB")
    private BigDecimal netAmountTHB = BigDecimal.ZERO;
}
