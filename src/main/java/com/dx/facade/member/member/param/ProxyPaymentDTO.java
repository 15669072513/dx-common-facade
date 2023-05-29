package com.dx.facade.member.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import com.dx.facade.member.member.common.ProxyPaymentTypeEnum;

/**
 * @author string
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "代理支付对象", description = "代理支付对象")
public class ProxyPaymentDTO {

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "业务类型，详见ProxyPaymentTypeEnum", required = true)
    private ProxyPaymentTypeEnum bizTypeEnum;

    @ApiModelProperty(value = "转出代理ID")
    private Long transOutProxyId;

    @ApiModelProperty(value = "转入代理ID", required = true)
    private Long transInProxyId;

    @ApiModelProperty(value = "交易金额", required = true)
    private BigDecimal transAmount;

    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月", required = true)
    private Integer cycleType;

    @ApiModelProperty(value = "周期名称", required = true)
    private String cycleName;

    @ApiModelProperty(value = "交易发起账号（平台发起:admin,代理发起:{proxyName},后台代发:{operator}）", required = true)
    private String transAccount;

    @ApiModelProperty(value = "交易唯一ID")
    private String transUUID;
}