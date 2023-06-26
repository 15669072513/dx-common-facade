package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 * 游戏解散
 * @author broadway
 * @since 2023-06-08
 */
@Data
public class GameDissolveDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌id")
    private Long tableId;
}
