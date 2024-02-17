package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("平台运营状况概述返回")
public class DwmPlatformOperationRspDTO extends DwmPlatformOperationSummaryRspDTO{

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("报表日期")
    private Long reportDate;
}
