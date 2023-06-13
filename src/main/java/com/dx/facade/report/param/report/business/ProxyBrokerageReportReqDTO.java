package com.dx.facade.report.param.report.business;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;

public class ProxyBrokerageReportReqDTO extends BusinessBasicReportReqDTO {

    @ApiModelProperty(value = "总代账号")
    private Long topProxyName;
}
