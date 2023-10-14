package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderUserResp {
    @ApiModelProperty("会员id")
    private String userId;
    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("投注金额")
    private BigDecimal netAmount=BigDecimal.ZERO;
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount=BigDecimal.ZERO;
    @ApiModelProperty("抽水比例")
    private BigDecimal rakeProportion=BigDecimal.ZERO;
    @ApiModelProperty("牌桌抽水")
    private BigDecimal pumpAmount=BigDecimal.ZERO;
}
