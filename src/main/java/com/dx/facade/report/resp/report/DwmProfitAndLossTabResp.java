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
@ApiModel(value = "DwmProfitAndLossTabResp", description = "盈亏详情")
public class DwmProfitAndLossTabResp {

    @ApiModelProperty("报表日期")
    private Integer reportDate;

    @ApiModelProperty("德州")
    private BigDecimal texasAmount;

    @ApiModelProperty("真人")
    private BigDecimal actualAmount;

    @ApiModelProperty("体育")
    private BigDecimal sportsAmount;

    @ApiModelProperty("彩票")
    private BigDecimal lotteryTicketAmount;

    @ApiModelProperty("电竞")
    private BigDecimal esportsAmount;

    @ApiModelProperty("棋牌")
    private BigDecimal chessAmount;

    @ApiModelProperty("总计")
    private BigDecimal totalAmount;

}
