package com.dx.facade.game.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel("牌桌列表汇总查询对象")
@Data
public class GameOrderTableSumReq {
    @ApiModelProperty("牌桌id")
    private List<String> tableIds;
}
