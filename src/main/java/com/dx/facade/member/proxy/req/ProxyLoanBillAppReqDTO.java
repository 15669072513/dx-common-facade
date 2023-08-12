package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyLoanBillAppReqDTO {

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "会员id-如果当前用户是会员则填充该值")
    private Long memberId;

    @ApiModelProperty(value = "代理id-如果当前用户是代理则填充该值")
    private Long proxyId;
}
