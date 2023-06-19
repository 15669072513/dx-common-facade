package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameRevieRoundResp {
    @ApiModelProperty("手牌编码")
    private String id;
    @ApiModelProperty("手牌时间")
    private String handEndDateStr;
}
