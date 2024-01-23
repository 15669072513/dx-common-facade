package com.dx.facade.game.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 手续费相关信息
 */
@Setter
@Getter
public class DxWalletDetailFeeInfoDto {
    private Long userId;
    private Long tableId;
    private BigDecimal tableFee;

    public BigDecimal getTableFee() {
        return Objects.isNull(tableFee) ? BigDecimal.ZERO : tableFee;
    }
}
