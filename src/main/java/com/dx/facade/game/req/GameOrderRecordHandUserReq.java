package com.dx.facade.game.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameOrderRecordHandUserReq {
    @ApiModelProperty("手牌id")
    private Long handId;
}
