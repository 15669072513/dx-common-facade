package com.dx.facade.game.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserTableAggReq {

    @ApiModelProperty("会员id")
    private Long userId;

    @ApiModelProperty("牌桌id")
    private Long tableId;

}
