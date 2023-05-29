package com.dx.facade.report.param.proxydayreport;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyDayReportSummaryReqDTO  {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;


    @ApiModelProperty(value = "开始时间")
    private Long startTime;

    @ApiModelProperty(value = "结束时间")
    private Long endTime;

    @ApiModelProperty(value = "会员代理集合")
    private List<Long> proxyIdList;
}
