package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DwmProfitAndLossPersonalCenterDetailRespDTO", description = "个人中心-盈亏详情")
public class DwmProfitAndLossPersonalCenterDetailRespDTO {

    @ApiModelProperty("今日盈亏")
    private DwmProfitAndLossPersonalCenterDetailResp today;

    @ApiModelProperty("本账期盈亏")
    private DwmProfitAndLossPersonalCenterDetailResp accountPeriod;

}
