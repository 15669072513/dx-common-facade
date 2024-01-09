package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("德州-数据日报-数据日报参数")
public class DxReportDReqDTO {
    @ApiModelProperty("日报期数")
    private Integer report;
    @ApiModelProperty("商户ID")
    private Long merchantId;
    @ApiModelProperty("日报期数-开始时间")
    private Integer startDate;
    @ApiModelProperty("日报期数")
    private Integer endTime;
}
