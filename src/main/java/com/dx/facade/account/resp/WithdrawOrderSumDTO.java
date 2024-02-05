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
    @ApiModelProperty("订单金额当前页面小计：USDT")
    private BigDecimal orderAmountPageUSDT;
    @ApiModelProperty("订单金额总计：USDT")
    private BigDecimal orderAmountTotalUSDT;
    @ApiModelProperty("提款记录当前页面统计：人民币")
    private BigDecimal realAmountPageCNY = BigDecimal.ZERO;
    @ApiModelProperty("提款记录总计：人民币")
    private BigDecimal realAmountTotalCNY = BigDecimal.ZERO;
    @ApiModelProperty("提款记录当前页面统计：USDT")
    private BigDecimal realAmountPageUSDT = BigDecimal.ZERO;
    @ApiModelProperty("提款记录总计：USDT")
    private BigDecimal realAmountTotalUSDT = BigDecimal.ZERO;
    @ApiModelProperty("提现手续费小计：USDT")
    private BigDecimal withdrawFeePageUSDT = BigDecimal.ZERO;
    @ApiModelProperty("提现手续费总计：USDT")
    private BigDecimal withdrawFeeTotalUSDT = BigDecimal.ZERO;
}
