package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("俱乐部贡献-返回对象")
@Data
public class GameOrderClubSumResp {
    @ApiModelProperty("俱乐部id")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;

    @ApiModelProperty("参数手牌数")
    private Long handCount;

    @ApiModelProperty("累计俱乐部游戏盈利")
    private BigDecimal netAmount;

    @ApiModelProperty("累计保险盈利")
    private BigDecimal insuranceNetAmount;

    @ApiModelProperty("累计俱乐部游戏有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("累计保险有效投注")
    private BigDecimal insuranceValidBetAmount;

    @ApiModelProperty("累计抽水总额")
    private BigDecimal pumpingAmount;

    @ApiModelProperty("累计抽水贡献")
    private BigDecimal pumpContribution;
}
