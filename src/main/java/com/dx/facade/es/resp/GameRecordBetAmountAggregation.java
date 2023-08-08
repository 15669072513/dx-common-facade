package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameRecordBetAmountAggregation {

    @ApiModelProperty("投注金额")
    private BigDecimal betAmountSum = new BigDecimal(0);

    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmountSum = new BigDecimal(0);

    @ApiModelProperty("输赢金额")
    private BigDecimal netAmountSum = new BigDecimal(0);

}
