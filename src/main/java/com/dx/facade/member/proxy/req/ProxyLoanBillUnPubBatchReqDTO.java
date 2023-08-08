package com.dx.facade.member.proxy.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProxyLoanBillUnPubBatchReqDTO {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private List<Long> memberId;

    @ApiModelProperty(value = "代理id")
    private List<Long> proxyId;
}
