package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DwmProfitAndLossTabRespDTO", description = "盈亏详情")
public class DwmProfitAndLossTabRespDTO {

    @ApiModelProperty("盈亏数据")
    private List<DwmProfitAndLossTabResp> profitLossData;

    @ApiModelProperty("盈亏小计")
    private DwmProfitAndLossTabSubTotalResp subTotalAmount;

}
