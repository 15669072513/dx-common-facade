package com.dx.facade.game.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel("手牌列表汇总查询对象")
@Data
public class GameOrderHandSumReq {
    @ApiModelProperty("手牌编码")
    private List<String> handCodes;
}
