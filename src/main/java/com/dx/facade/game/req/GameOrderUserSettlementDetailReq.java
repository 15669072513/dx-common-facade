package com.dx.facade.game.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("结算详情查询对象")
@Data
public class GameOrderUserSettlementDetailReq {
    @ApiModelProperty("牌桌id")
    private Long tableId;
}
