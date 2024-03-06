package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

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

    @ApiModelProperty("手牌服务费")
    private CurrencyAndSum pumpContributionAmount = new CurrencyAndSum();

    @ApiModelProperty("本页投注金额合计")
    private BigDecimal currPageBetAmount;

    @ApiModelProperty("本页有效投注金额合计")
    private BigDecimal currPageValidBetAmount;

    @ApiModelProperty("本页输赢金额合计")
    private BigDecimal currPageNetAmount;

    @ApiModelProperty("本页手牌服务费合计")
    private BigDecimal currPagePumpContributionAmount;
}
