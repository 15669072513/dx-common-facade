package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyAndSum {
    @ApiModelProperty("人民币总和")
    private BigDecimal cnySum = new BigDecimal(0);

    @ApiModelProperty("泰铢总和")
    private BigDecimal thbSum = new BigDecimal(0);

    @ApiModelProperty("越南盾总和")
    private BigDecimal vndSum = new BigDecimal(0);

    @ApiModelProperty("USDT总和")
    private BigDecimal usdtSum = new BigDecimal(0);
}
