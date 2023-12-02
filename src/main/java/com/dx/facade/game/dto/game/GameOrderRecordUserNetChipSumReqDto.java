package com.dx.facade.game.dto.game;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class GameOrderRecordUserNetChipSumReqDto implements Serializable {
    private BigDecimal netAmount;
    public GameOrderRecordUserNetChipSumReqDto(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }
}
