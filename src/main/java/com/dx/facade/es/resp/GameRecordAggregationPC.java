package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameRecordAggregationPC {
    @ApiModelProperty("总订单数")
    private Long totalCount = 0L;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount = new BigDecimal(0);

    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmount = new BigDecimal(0);

    @ApiModelProperty("输赢金额")
    private BigDecimal netAmount = new BigDecimal(0);
}
