package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

import com.dx.facade.report.param.base.LocalDateRequest;

/**
 * ProxyCommissionPaymentReqDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午2:06:50
 */
@Data
public class ProxyCommissionPaymentReqDTO extends LocalDateRequest {

    /** proxyId */
    @ApiModelProperty(value = "代理ID", required = true, example = "1")
    @NotBlank(message = "代理ID不能为空")
    private Long proxyId;

    @ApiModelProperty(value = "商户ID", required = true, example = "44451211")
    Long merchantId;

    /** period */
    @ApiModelProperty(value = "查询的周期", required = true, example = "202107")
    @NotBlank(message = "查询周期不能为空")
    private Integer period;

    /** transStatus */
    @ApiModelProperty(value = "收支状态(0-上级转入 1-支付下级)", required = true, example = "0")
    private Integer transStatus;

    /** directProxyAccount */
    @ApiModelProperty(value = "直属下级代理账号", required = true, example = "selong01")
    private String directProxyAccount;
}
