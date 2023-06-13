package com.dx.facade.report.param.report.business;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;

public class BusinessBasicReportReqDTO extends LocalDatePageRequest {
    /**
     * 商户
     */
    @ApiModelProperty(value = "商户")
    private Long merchantName;
    
    /**
     * 代理id
     */
    @ApiModelProperty(value = "代理账号")
    private Long proxyName;

}
