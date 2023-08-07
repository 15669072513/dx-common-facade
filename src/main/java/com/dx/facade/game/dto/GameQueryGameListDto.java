package com.dx.facade.game.dto;

import lombok.Data;

@Data
public class GameQueryGameListDto extends GameDto {

    /**
     * 会员ID
     */
    private Long memberId;

}
