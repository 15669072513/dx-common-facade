package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModel;
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
@ApiModel(value = "账变记录列表统计", description = "账变记录列表统计")
public class WalletDetailSumDTO {

    @ApiModelProperty("账变金额当前页面统计：人民币")
    private BigDecimal amountPageSumCNY;
    @ApiModelProperty("账变金额所有统计：人民币")
    private BigDecimal amountTotalSumCNY;
    @ApiModelProperty("账变前金额当前页面统计：人民币")
    private BigDecimal changeBeforePageSumCNY;
    @ApiModelProperty("账变前金额所有统计：人民币")
    private BigDecimal changeBeforeTotalSumCNY;
    @ApiModelProperty("账变后金额当前页面统计：人民币")
    private BigDecimal changeAfterPageSumCNY;
    @ApiModelProperty("账变后金额总共统计：人民币")
    private BigDecimal changeAfterTotalSumCNY;

    @ApiModelProperty("账变金额当前页面统计：越南盾")
    private BigDecimal amountPageSumVND;
    @ApiModelProperty("账变金额所有统计：越南盾")
    private BigDecimal amountTotalSumVND;
    @ApiModelProperty("账变前金额当前页面统计：越南盾")
    private BigDecimal changeBeforePageSumVND;
    @ApiModelProperty("账变前金额所有统计：越南盾")
    private BigDecimal changeBeforeTotalSumVND;
    @ApiModelProperty("账变后金额当前页面统计：越南盾")
    private BigDecimal changeAfterPageSumVND;
    @ApiModelProperty("账变后金额总共统计：越南盾")
    private BigDecimal changeAfterTotalSumVND;

    @ApiModelProperty("账变金额当前页面统计：泰铢")
    private BigDecimal amountPageSumTHR;
    @ApiModelProperty("账变金额所有统计：泰铢")
    private BigDecimal amountTotalSumTHR;
    @ApiModelProperty("账变前金额当前页面统计：泰铢")
    private BigDecimal changeBeforePageSumTHR;
    @ApiModelProperty("账变前金额所有统计：泰铢")
    private BigDecimal changeBeforeTotalSumTHR;
    @ApiModelProperty("账变后金额当前页面统计：泰铢")
    private BigDecimal changeAfterPageSumTHR;
    @ApiModelProperty("账变后金额总共统计：泰铢")
    private BigDecimal changeAfterTotalSumTHR;

    @ApiModelProperty("账变金额当前页面统计: 默认美金")
    private BigDecimal amountPageSum;
    @ApiModelProperty("账变金额所有统计: 默认美金")
    private BigDecimal amountTotalSum;
    @ApiModelProperty("账变前金额当前页面统计: 默认美金")
    private BigDecimal changeBeforePageSum;
    @ApiModelProperty("账变前金额所有统计: 默认美金")
    private BigDecimal changeBeforeTotalSum;
    @ApiModelProperty("账变后金额当前页面统计: 默认美金")
    private BigDecimal changeAfterPageSum;
    @ApiModelProperty("账变后金额总共统计: 默认美金")
    private BigDecimal changeAfterTotalSum;

}
