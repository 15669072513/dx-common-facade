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
    @ApiModelProperty("累计手牌盈利")
    private BigDecimal netAmount;
    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount;
}
