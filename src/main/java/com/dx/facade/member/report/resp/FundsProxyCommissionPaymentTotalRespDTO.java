package com.dx.facade.member.report.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 @title 佣金收付总计接口响应数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月27日 22:44:00
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("佣金收付总计接口响应数据传输对象")
public class FundsProxyCommissionPaymentTotalRespDTO implements Serializable {

    @ApiModelProperty(value = "总计支付佣金CNY")
    private BigDecimal totalCommissionPaymentCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总计支付佣金VND")
    private BigDecimal totalCommissionPaymentVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总计支付佣金THB")
    private BigDecimal totalCommissionPaymentTHB= BigDecimal.ZERO;

    @ApiModelProperty(value = "小计支付佣金CNY")
    private BigDecimal subtotalCommissionPaymentCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "小计支付佣金VND")
    private BigDecimal subtotalCommissionPaymentVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "小计支付佣金THB")
    private BigDecimal subtotalCommissionPaymentTHB= BigDecimal.ZERO;
}
