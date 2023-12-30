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
@ApiModel(value = "DwmProfitAndLossDetailRespDTO", description = "盈亏详情")
public class DwmProfitAndLossDetailRespDTO {

    @ApiModelProperty("报表日期")
    private Integer reportDate;

    @ApiModelProperty("盈亏")
    private BigDecimal totalNetAmount;

    @ApiModelProperty("返水")
    private BigDecimal rebateAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("注单")
    private BigDecimal betCount;

    @ApiModelProperty("输赢")
    private BigDecimal netAmount;

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

}
