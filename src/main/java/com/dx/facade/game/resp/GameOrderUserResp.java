package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class GameOrderUserResp {
    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("投注金额")
    private String netAmountSum;
    @ApiModelProperty("有效投注")
    private LocalDateTime validBetAmountSum;
    @ApiModelProperty("抽水比例")
    private LocalDateTime rakeProportion;
    @ApiModelProperty("牌桌抽水")
    private BigDecimal test;
}
