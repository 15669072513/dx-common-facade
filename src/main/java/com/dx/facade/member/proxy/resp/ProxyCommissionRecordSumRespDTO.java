package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyCommissionRecordSumRespDTO implements Serializable {

    @ApiModelProperty(value = "个人佣金CNY")
    private BigDecimal totalPersonCommissionAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "个人佣金VND")
    private BigDecimal totalPersonCommissionAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "个人佣金THB")
    private BigDecimal totalPersonCommissionAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "佣金加减CNY")
    private BigDecimal adjustCommissionAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "佣金加减VND")
    private BigDecimal adjustCommissionAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "佣金加减THB")
    private BigDecimal adjustCommissionAmountTHB = BigDecimal.ZERO;

}