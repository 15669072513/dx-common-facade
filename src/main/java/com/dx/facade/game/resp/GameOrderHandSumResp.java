package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderHandSumResp {
    @ApiModelProperty("手牌id")
    private Long handId;
    @ApiModelProperty("期初金额汇总")
    private BigDecimal beforeChip;
    @ApiModelProperty("中途带入金额汇总")
    private BigDecimal bringMidwayChip;
    @ApiModelProperty("期末余额汇总")
    private BigDecimal afterChip;
    @ApiModelProperty("有效底池")
    private BigDecimal effectivePool;
    @ApiModelProperty("打牌抽水")
    private BigDecimal pumpAmount;
    @ApiModelProperty("会员输赢汇总")
    private BigDecimal netAmount;
    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount;
    @ApiModelProperty("庄家位置")
    private Integer villageSeat;
    @ApiModelProperty("小盲位置")
    private Integer sbSeat;
    @ApiModelProperty("大盲位置")
    private Integer bbSeat;
}
