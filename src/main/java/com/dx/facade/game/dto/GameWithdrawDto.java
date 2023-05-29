package com.dx.facade.game.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 转账下分请求类
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/23 17:49
 */
@Data
public class GameWithdrawDto extends GameDto {

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 金额
     */
    private BigDecimal amount;


    public GameWithdrawDto() {
    }

}
