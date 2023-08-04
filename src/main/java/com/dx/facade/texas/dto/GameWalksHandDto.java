package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 * 游戏Walks手牌数
 * @author broadway
 * @since 2023-08-04
 */
@Data
public class GameWalksHandDto {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌code")
    private Long userId;

    @ApiModelProperty("牌桌类型")
    private Long tableType;

    @ApiModelProperty("Walks手牌数")
    private Long walksCount;
}
