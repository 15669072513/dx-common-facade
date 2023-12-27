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
@ApiModel(value = "DwmProfitAndLossTotalResp", description = "盈亏详情")
public class DwmProfitAndLossTotalResp {

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
}
