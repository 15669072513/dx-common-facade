package com.dx.facade.member.report.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * TODO 不知是否可以理解为待收
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 下午17:01:21
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("未收完明细下钻接口响应数据传输对象")
public class ReportProxyReceivableRespDTO implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "ID")
    private Long id;

    /**
     * 帐单月份
     */
    @ApiModelProperty(value = "帐单月份", required = true, example = "2021-09")
    private String billMonth;

    /**
     * 应收上级帐号，在会计中属于借方方帐户
     */
    @ApiModelProperty(value = "应收上级帐号", required = true, example = "-")
    private String proxyName;

    /**
     * 应收金额
     */
    @ApiModelProperty(value = "应收金额", required = true, example = "500.00")
    private BigDecimal payable;

    /**
     * 实收金额
     */
    @ApiModelProperty(value = "实收金额", required = true, example = "300.00")
    private BigDecimal payment;

    /**
     * 未收金额
     */
    @ApiModelProperty(value = "未收金额", required = true, example = "0.00")
    private BigDecimal unpaid;

    @ApiModelProperty(value = "当前代理币种", example = "CNY")
    private String currency;
}
