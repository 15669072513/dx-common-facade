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
@ApiModel(value = "AppProfitAndLossDetailDTO", description = "信用盘APP-个人中心-盈亏详情")
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
    private String texasAmount;

    @ApiModelProperty("真人")
    private String actualAmount;

    @ApiModelProperty("体育")
    private String sportsAmount;

    @ApiModelProperty("彩票")
    private String lotteryTicketAmount;

    @ApiModelProperty("电竞")
    private String esportsAmount;

    @ApiModelProperty("棋牌")
    private String chessAmount;

}
