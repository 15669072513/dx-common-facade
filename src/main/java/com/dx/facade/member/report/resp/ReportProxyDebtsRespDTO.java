package com.dx.facade.member.report.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TODO 不知是否可以理解为欠款
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 下午17:00:31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("未付清明细下钻接口响应数据传输对象")
public class ReportProxyDebtsRespDTO implements Serializable {

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
     * 应付下级帐号，在会计中属于贷方帐户
     */
    @ApiModelProperty(value = "应付下级帐号", required = true, example = "zale111")
    private String proxyName;

    /**
     * 应付金额
     */
    @ApiModelProperty(value = "应付金额", required = true, example = "500.00")
    private BigDecimal payable;

    /**
     * 实付金额
     */
    @ApiModelProperty(value = "实付金额", required = true, example = "300.00")
    private BigDecimal payment;

    /**
     * 欠款金额，其实可以用未付，欠款并不恰当
     */
    @ApiModelProperty(value = "欠款金额", required = true, example = "200.00")
    private BigDecimal unpay;

    @ApiModelProperty(value = "当前代理币种", example = "CNY")
    private String currency;
}
