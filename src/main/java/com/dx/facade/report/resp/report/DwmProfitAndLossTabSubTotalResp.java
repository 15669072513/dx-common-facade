package com.dx.facade.report.resp.report;

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
@ApiModel(value = "DwmProfitAndLossTabSubTotalResp", description = "盈亏详情")
public class DwmProfitAndLossTabSubTotalResp {

    @ApiModelProperty("德州小计")
    private BigDecimal texasAmountSubTotal;

    @ApiModelProperty("真人小计")
    private BigDecimal actualAmountSubTotal;

    @ApiModelProperty("体育小计")
    private BigDecimal sportsAmountSubTotal;

    @ApiModelProperty("彩票小计")
    private BigDecimal lotteryAmountSubTotal;

    @ApiModelProperty("电竞小计")
    private BigDecimal esportsAmountSubTotal;

    @ApiModelProperty("棋牌小计")
    private BigDecimal chessAmountSubTotal;

    @ApiModelProperty("总计小计")
    private BigDecimal totalAmountSubTotal;

}
