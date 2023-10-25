package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepositDiscountSumDTO {

    @ApiModelProperty("红利金额当前页面统计：人民币")
    private BigDecimal amountPageSumCNY;

    @ApiModelProperty("红利金额所有统计：人民币")
    private BigDecimal amountTotalSumCNY;

    @ApiModelProperty("红利金额当前页面统计：越南盾")
    private BigDecimal amountPageSumVND;

    @ApiModelProperty("红利金额所有统计：越南盾")
    private BigDecimal amountTotalSumVND;


    @ApiModelProperty("红利金额当前页面统计：泰铢")
    private BigDecimal amountPageSumTHR;

    @ApiModelProperty("红利金额所有统计：泰铢")
    private BigDecimal amountTotalSumTHR;


    @ApiModelProperty("红利金额当前页面统计：美金")
    private BigDecimal amountPageSumUSDT;

    @ApiModelProperty("红利金额所有统计：美金")
    private BigDecimal amountTotalSumUSDT;

}
