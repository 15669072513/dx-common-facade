package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 * 翻牌前的游戏手数
 * @author broadway
 * @since 2023-08-04
 */
@Data
public class GamePreHandDto {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌code")
    private Long userId;

    @ApiModelProperty("牌桌类型")
    private Long tableType;

    @ApiModelProperty("翻牌前的游戏手数")
    private Long preHandCount;
}
