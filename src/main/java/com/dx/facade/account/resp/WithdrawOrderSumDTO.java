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
@ApiModel(value = "提款记录列表统计", description = "提款记录列表统计")
public class WithdrawOrderSumDTO {
    @ApiModelProperty("提款记录当前页面统计：人民币")
    private BigDecimal realAmountPageCNY;
    @ApiModelProperty("提款记录总计：人民币")
    private BigDecimal realAmountTotalCNY;
    @ApiModelProperty("提款记录当前页面统计：越南盾")
    private BigDecimal realAmountPageVND;
    @ApiModelProperty("提款记录总计：越南盾")
    private BigDecimal realAmountTotalVND;
    @ApiModelProperty("提款记录当前页面统计：泰铢")
    private BigDecimal realAmountPageTHR;
    @ApiModelProperty("提款记录总计：泰铢")
    private BigDecimal realAmountTotalTHR;

}
