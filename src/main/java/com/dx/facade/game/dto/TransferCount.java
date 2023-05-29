package com.dx.facade.game.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

import com.dx.facade.enums.BwCurrencyEnum;

@Data
public class TransferCount {

    @ApiModelProperty("币种")
    private BwCurrencyEnum currencyEnum;

    @ApiModelProperty("金额")
    private BigDecimal amount;

}
