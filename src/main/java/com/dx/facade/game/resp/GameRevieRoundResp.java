package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameRevieRoundResp {
    @ApiModelProperty("手牌id")
    private Long id;
    @ApiModelProperty("手牌时间")
    private String handEndDateStr;
}
