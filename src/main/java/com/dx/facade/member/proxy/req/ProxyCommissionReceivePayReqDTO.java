package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * ProxyCommissionReceivePayReqDTO
 *
 * @author kygo
 * @version 1.0.0
 * @since 2022.04.16
 */
@Data
public class ProxyCommissionReceivePayReqDTO {

    @ApiModelProperty(value = "代理ID", required = true, example = "1")
    @NotBlank(message = "代理ID不能为空")
    private String proxyId;

    @ApiModelProperty(value = "代理ID", required = true, example = "1")
    @NotBlank(message = "代理name不能为空")
    private String proxyName;

    @ApiModelProperty(value = "商户ID", required = true, example = "44451211")
    private Long merchantId;

    @ApiModelProperty(value = "收付账号",example = "san")
    private String transferProxyName;

    @ApiModelProperty(value = "佣金月份", required = true, example = "202107")
    @NotBlank(message = "佣金月份")
    private String reportYm;

    @ApiModelProperty(value = "收支状态(0-上级转入(收入) 1-支付下级(支出))",example = "0")
    private Integer transStatus;

    @ApiModelProperty(value = "是否底层(0-非底层代理的下级代理),1-底层代理自己",example = "1")
    @NotBlank(message = "是否底层不能为空")
    private Integer isSelf;

    @ApiModelProperty(value = "收付金额排序,排序方式(1-收付金额排序)",example ="1")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式(asc-正序 desc-逆序)",example = "desc")
    private String orderType;

}
