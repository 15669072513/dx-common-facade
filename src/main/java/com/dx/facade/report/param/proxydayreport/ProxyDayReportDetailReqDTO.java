package com.dx.facade.report.param.proxydayreport;

import com.dx.facade.report.param.base.LocalDateRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyDayReportDetailReqDTO extends LocalDateRequest {

    @ApiModelProperty(value = "代理ID", example = "100001", required = true)
    private Long proxyId;
}
