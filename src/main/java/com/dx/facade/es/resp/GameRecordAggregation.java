package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameRecordAggregation {
    @ApiModelProperty("已结算")
    private Long settledCount;

    @ApiModelProperty("未结算")
    private Long unSettledCount;

    @ApiModelProperty("不结算")
    private Long noSettledCount;

    @ApiModelProperty("投注金额")
    private CurrencyAndSum betAmount = new CurrencyAndSum();

    @ApiModelProperty("有效投注金额")
    private CurrencyAndSum validBetAmount = new CurrencyAndSum();

    @ApiModelProperty("输赢金额")
    private CurrencyAndSum netAmount = new CurrencyAndSum();
}
