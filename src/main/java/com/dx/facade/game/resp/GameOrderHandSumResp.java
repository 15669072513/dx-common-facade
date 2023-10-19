package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderHandSumResp {
    @ApiModelProperty("手牌id")
    private String handId;
    @ApiModelProperty("期初金额汇总")
    private BigDecimal beforeChip=BigDecimal.ZERO;
    @ApiModelProperty("中途带入金额汇总")
    private BigDecimal bringMidwayChip=BigDecimal.ZERO;
    @ApiModelProperty("期末余额汇总")
    private BigDecimal afterChip=BigDecimal.ZERO;
    @ApiModelProperty("有效底池")
    private BigDecimal effectivePool=BigDecimal.ZERO;
    @ApiModelProperty("打牌抽水")
    private BigDecimal pumpAmount=BigDecimal.ZERO;
    @ApiModelProperty("会员输赢汇总")
    private BigDecimal netAmount=BigDecimal.ZERO;
    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount=BigDecimal.ZERO;
    @ApiModelProperty("庄家位置")
    private Integer villageSeat;
    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore=BigDecimal.ZERO;
    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore=BigDecimal.ZERO;
    @ApiModelProperty("小盲位置")
    private Integer sbSeat;
    @ApiModelProperty("大盲位置")
    private Integer bbSeat;
}
