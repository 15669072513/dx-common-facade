package com.dx.facade.report.resp.venuenetamountday;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueNetAmountDayDetailRespDTO {

    @ApiModelProperty("日期")
    private String staticsDate;

    @ApiModelProperty("注单量")
    private Long betCount;

    @ApiModelProperty("投注人数")
    private Long memberCount;

    @ApiModelProperty("投注金额CNY")
    private BigDecimal betAmountCNY;
    @ApiModelProperty("投注金额VND")
    private BigDecimal betAmountVND;
    @ApiModelProperty("投注金额THB")
    private BigDecimal betAmountTHB;

    @ApiModelProperty("有效投注CNY")
    private BigDecimal validBetAmountCNY;
    @ApiModelProperty("有效投注VND")
    private BigDecimal validBetAmountVND;
    @ApiModelProperty("有效投注THB")
    private BigDecimal validBetAmountTHB;

    @ApiModelProperty("投注盈亏CNY")
    private BigDecimal netAmountCNY;
    @ApiModelProperty("投注盈亏VND")
    private BigDecimal netAmountVND;
    @ApiModelProperty("投注盈亏THB")
    private BigDecimal netAmountTHB;
}
