package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderTableSumResp {
    @ApiModelProperty("牌桌id")
    private Long tableId;
    @ApiModelProperty("参数手牌数")
    private Long handCount;
    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount;
    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount;
}
