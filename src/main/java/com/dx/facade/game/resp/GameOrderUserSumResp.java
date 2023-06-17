package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderUserSumResp {
    @ApiModelProperty("总投注")
    private BigDecimal netAmountSum;
    @ApiModelProperty("总有效投注")
    private BigDecimal validBetAmountSum;
    @ApiModelProperty("总牌桌抽水")
    private BigDecimal pumpAmount;
}
