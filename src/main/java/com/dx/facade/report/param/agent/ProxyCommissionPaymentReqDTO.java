package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionPaymentReqDTO {
    @ApiModelProperty(value = "代理账号",example = "132325346545")
    private String proxyId;

    @ApiModelProperty(value = "月份",example = "202204")
    private String reportYm;

    @ApiModelProperty(value = "收付账号",example = "san")
    private String transferProxyName;
}
