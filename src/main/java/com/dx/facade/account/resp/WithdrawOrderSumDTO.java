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
    @ApiModelProperty("提款记录当前页面统计：USDT")
    private BigDecimal realAmountPageUSDT;
    @ApiModelProperty("提款记录总计：USDT")
    private BigDecimal realAmountTotalUSDT;
    @ApiModelProperty("提现手续费小计：USDT")
    private BigDecimal withdrawFeePageUSDT;
    @ApiModelProperty("提现手续费总计：USDT")
    private BigDecimal withdrawFeeTotalUSDT;
}
