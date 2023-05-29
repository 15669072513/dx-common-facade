package com.dx.facade.game.dto;

import lombok.Data;

/**
 * 余额输出
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/22 20:07
 */
@Data
public class GameQueryBalanceDto extends GameDto {
    
    /**
     * 会员ID
     */
    private Long memberId;


}
