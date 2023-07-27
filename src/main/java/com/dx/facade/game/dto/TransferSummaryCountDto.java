package com.dx.facade.game.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class TransferSummaryCountDto {


    @ApiModelProperty("人民币小计")
    private BigDecimal subTotalCny = BigDecimal.ZERO;
    @ApiModelProperty("越南盾小计")
    private BigDecimal subTotalVnd = BigDecimal.ZERO;
    @ApiModelProperty("泰铢小计")
    private BigDecimal subTotalThb = BigDecimal.ZERO;

    private BigDecimal subTotalUsdt = BigDecimal.ZERO;

    @ApiModelProperty("人民币总计")
    private BigDecimal totalCny = BigDecimal.ZERO;
    @ApiModelProperty("越南盾总计")
    private BigDecimal totalVnd = BigDecimal.ZERO;
    @ApiModelProperty("泰铢总计")
    private BigDecimal totalThb = BigDecimal.ZERO;

    private BigDecimal totalUsdt = BigDecimal.ZERO;

}
