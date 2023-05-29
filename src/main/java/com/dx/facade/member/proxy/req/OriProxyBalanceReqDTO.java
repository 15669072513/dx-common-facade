package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 查询代理余额
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OriProxyBalanceReqDTO implements Serializable {

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

}
