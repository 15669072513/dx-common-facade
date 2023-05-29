package com.dx.facade.report.param.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import java.time.LocalDate;

@Data
@ToString
@ApiModel(description = "时间查询对象（共用、基本上每个查询都包含了开始时间和结束时间）")
public class LocalDateRequest {

    @ApiModelProperty(value = "开始时间", required = true)
    private LocalDate startTime;

    @ApiModelProperty(value = "结束时间", required = true)
    private LocalDate endTime;
}
