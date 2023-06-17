package com.dx.facade.game.resp;

import com.dx.facade.es.resp.CurrencyAndSum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderRecordVenueAggregationResp {
    @ApiModelProperty("已结算")
    private Long settledCount;

    @ApiModelProperty("未结算")
    private Long unSettledCount;

    @ApiModelProperty("不结算")
    private Long noSettledCount;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("输赢金额")
    private BigDecimal netAmount;
}
