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
@ApiModel(value = "充值记录列表统计", description = "充值记录列表统计")
public class DepositOrderSumDTO {

    @ApiModelProperty("充值金额当前页面统计：人民币")
    private BigDecimal orderAmountPageSumCNY;

    @ApiModelProperty("充值金额所有统计：人民币")
    private BigDecimal orderAmountTotalSumCNY;

    @ApiModelProperty("实到金额当前页面统计：人民币")
    private BigDecimal realAmountPageSumCNY;

    @ApiModelProperty("实到金额所有统计：人民币")
    private BigDecimal realAmountTotalSumCNY;

    @ApiModelProperty("充值金额当前页面统计：美元")
    private BigDecimal orderAmountPageSumUSDT;

    @ApiModelProperty("充值金额所有统计：美元")
    private BigDecimal orderAmountTotalSumUSDT;

    @ApiModelProperty("实到金额当前页面统计：美元")
    private BigDecimal realAmountPageSumUSDT;

    @ApiModelProperty("实到金额所有统计：美元")
    private BigDecimal realAmountTotalSumUSDT;

}
