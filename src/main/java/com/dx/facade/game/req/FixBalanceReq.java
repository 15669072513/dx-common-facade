package com.dx.facade.game.req;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class FixBalanceReq {
    private Long userId;
    private Long tableId;
    private BigDecimal balance;
    private String token;
}
