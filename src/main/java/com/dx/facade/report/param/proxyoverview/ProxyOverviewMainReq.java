package com.dx.facade.report.param.proxyoverview;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("统计源代理明细下钻接口请求数据传输对象")
public class ProxyOverviewMainReq {

    @ApiModelProperty(value = "本期账单开始日期")
    private Integer cycleStartDate;

    @ApiModelProperty(value = "本期账单结束日期")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;
}
