package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class UserValiBetAmountResp {
    @ApiModelProperty("会员id")
    private Long userId;
    @ApiModelProperty("游戏投注金额")
    private BigDecimal validBetAmountSum;
}
