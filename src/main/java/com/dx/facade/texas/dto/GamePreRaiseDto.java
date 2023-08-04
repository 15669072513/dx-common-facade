package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 * 游戏翻牌前加注次数
 * @author broadway
 * @since 2023-08-04
 */
@Data
public class GamePreRaiseDto {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌code")
    private Long userId;

    @ApiModelProperty("牌桌类型")
    private Long tableType;

    @ApiModelProperty("翻牌前加注次数")
    private Long preRaiseCount;
}
