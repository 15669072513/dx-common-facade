package com.dx.facade.game.dto;

import lombok.Data;

/**
 * 下分所有B端余额请求类
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022-09-22 16:40:23
 */
@Data
public class GameWithdrawAllDto extends GameDto {

    /**
     * 会员ID
     */
    private Long memberId;

}
