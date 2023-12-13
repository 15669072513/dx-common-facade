package com.dx.facade.game.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 游戏注单牌局扩展属性字段
 */

@ApiModel("游戏注单牌局扩展属性字段")
@Data
public class ExtendPropertyDto {

    /**
     * 自主亮牌选择点亮的牌张
     */
    private String lightCard;
}
