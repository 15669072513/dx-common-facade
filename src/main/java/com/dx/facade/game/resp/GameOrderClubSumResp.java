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
    private Long handCount = 0L;

    @ApiModelProperty("累计手牌盈利")
    private BigDecimal netAmount = new BigDecimal(0);

    @ApiModelProperty("有效金额")
    private BigDecimal insuranceNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("累计俱乐部游戏有效投注")
    private BigDecimal validBetAmount = new BigDecimal(0);
    ;

    @ApiModelProperty("累计保险有效投注")
    private BigDecimal insuranceValidBetAmount = BigDecimal.ZERO;

    @ApiModelProperty("累计抽水总额")
    private BigDecimal pumpingAmount = new BigDecimal(0);

    @ApiModelProperty("累计抽水贡献")
    private BigDecimal pumpContribution = BigDecimal.ZERO;

    @ApiModelProperty("累计局服务费贡献")
    private BigDecimal tableFeeContribution = BigDecimal.ZERO;

}
