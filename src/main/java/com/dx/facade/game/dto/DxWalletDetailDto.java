package com.dx.facade.game.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class DxWalletDetailDto {
    private Long userId;
    private BigDecimal bringInAmount;
    private Integer bringInCount;
}
