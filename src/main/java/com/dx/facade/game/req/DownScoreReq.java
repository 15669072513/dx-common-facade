package com.dx.facade.game.req;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class DownScoreReq {
    private Long tableId;
    private Long userId;
    private BigDecimal amount;
    private String eventId;
    private Long eventTime;
    private BigDecimal freezeAmount;
}
