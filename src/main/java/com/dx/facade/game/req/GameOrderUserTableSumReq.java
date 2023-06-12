package com.dx.facade.game.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 玩家牌桌查询对象
 */
@ApiModel("玩家牌桌查询对象")
@Data
public class GameOrderUserTableSumReq extends LocalDatePageRequest {
    /**
     * 玩家id
     */
    @ApiModelProperty("玩家id")
    private Long userId;
    /**
     * 游戏类型 （GameTypeEnum）
     */
    @ApiModelProperty("游戏类型 2001 德州游戏 2002 德州短牌局")
    private Integer gameType;

}
