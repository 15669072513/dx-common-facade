package com.dx.facade.game.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Setter
@Getter
public class DxWalletDetailBringInOutDto {
    private Long userId;
    private Long tableId;
    private BigDecimal bringInAmount;
    private Integer bringInCount;
    private BigDecimal bringOutAmount;
    private Integer bringOutCount;

    public BigDecimal getBringInAmount() {
        return Objects.isNull(bringInAmount) ? BigDecimal.ZERO : bringInAmount;
    }

    public BigDecimal getBringOutAmount() {
        return Objects.isNull(bringOutAmount) ? BigDecimal.ZERO : bringOutAmount;
    }

    public Integer getBringInCount() {
        return Objects.isNull(bringInCount) ? 0 : bringInCount;
    }

    public Integer getBringOutCount() {
        return Objects.isNull(bringOutCount) ? 0 : bringOutCount;
    }
}
