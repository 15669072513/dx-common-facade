package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderTableSumResp {
    @ApiModelProperty("牌桌id")
    private Long tableId;
    @ApiModelProperty("参与手牌数")
    private Long handCount=0L;
    @ApiModelProperty("带入次数")
    private Long bringCount=0L;
    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount=BigDecimal.ZERO;
    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount=BigDecimal.ZERO;
    @ApiModelProperty("首次带入")
    private BigDecimal firstBringChip=BigDecimal.ZERO;
    @ApiModelProperty("中途带入")
    private BigDecimal bringMidwayChip=BigDecimal.ZERO;
    @ApiModelProperty("总带出")
    private BigDecimal afterChip=BigDecimal.ZERO;
    @ApiModelProperty("进入牌桌的初始带入")
    private BigDecimal enterTableChip=BigDecimal.ZERO;
}
