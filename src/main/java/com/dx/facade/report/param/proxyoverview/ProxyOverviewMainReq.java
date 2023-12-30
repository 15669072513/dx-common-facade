package com.dx.facade.report.param.proxyoverview;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
public class ProxyOverviewMainReq {

    @ApiModelProperty(value = "本期账单开始日期", example = "20231213")
    private Integer cycleStartDate;

    @ApiModelProperty(value = "本期账单结束日期", example = "20231221")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;
}
