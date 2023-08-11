package com.dx.facade.member.proxy.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProxyLoanBillAppReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long memberId;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;
}
