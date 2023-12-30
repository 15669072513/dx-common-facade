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
@ApiModel(value = "DwmProfitAndLossAllSubTotalResp", description = "盈亏详情")
public class DwmProfitAndLossAllSubTotalResp {

    @ApiModelProperty("盈亏")
    private BigDecimal totalNetAmountSubTotal;

    @ApiModelProperty("返水")
    private BigDecimal rebateAmountSubTotal;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmountSubTotal;

    @ApiModelProperty("注单")
    private BigDecimal betCountSubTotal;

    @ApiModelProperty("输赢")
    private BigDecimal netAmountSubTotal;
}
