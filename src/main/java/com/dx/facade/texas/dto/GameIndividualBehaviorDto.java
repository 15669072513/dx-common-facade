package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * <p>
 *
 * </p>
 * 个人行为数据dto
 * @author broadway
 * @since 2023-08-04
 */
@Data
public class GameIndividualBehaviorDto {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主动入池次数")
    private List<GameBringPoolDto> gameBringPoolDtoList;

    @ApiModelProperty("Walks手牌数")
    private List<GameWalksHandDto> gameWalksHandDtoList;

    @ApiModelProperty("翻牌前加注次数")
    private List<GamePreRaiseDto> gamePreRaiseDtoList;

    @ApiModelProperty("翻牌前的游戏手数")
    private List<GamePreHandDto> gamePreHandDtoList;

}
