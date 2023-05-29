package com.dx.facade.game.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * MQ 转账上分输入请求
 * @author dereck
 * @version 1.0.0
 * @date 2022/10/08 17:22
 */
@Data
public class GameMqDepositDto extends GameDto {

    /**
     * 金额
     * 精确到2位小数点，大于0.
     */
    private BigDecimal amount;


    /**
     * 类型 1 普通转账 2 活动上分
     */
    private Integer type;

    /**
     * type 为 2时，需要传活动赠送金额
     */
    private BigDecimal bonusAmount = BigDecimal.ZERO;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 业务id，账变ID
     */
    private String eventId;

    /**
     * 时间发生时间
     */
    private LocalDateTime occurDt;


    public GameMqDepositDto() {
        super();
    }


}
