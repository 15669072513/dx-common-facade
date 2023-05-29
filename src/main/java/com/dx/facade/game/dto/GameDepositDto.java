package com.dx.facade.game.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 转账上分输入请求
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/23 17:47
 */
@Data
public class GameDepositDto extends GameDto {

    /**
     * 金额
     * 精确到2位小数点，大于0.
     */
    private BigDecimal amount;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 账变单号
     */
    private String eventId;

    /**
     * 时间发生时间
     */
    private LocalDateTime occurDt;


    public GameDepositDto() {
        super();
    }


}
