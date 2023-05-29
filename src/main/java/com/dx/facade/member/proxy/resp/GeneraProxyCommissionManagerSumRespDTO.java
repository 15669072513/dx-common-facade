package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class GeneraProxyCommissionManagerSumRespDTO implements Serializable {
    @ApiModelProperty(value = "实际收益CNY")
    private BigDecimal realPersonCommissionAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "实际收益VND")
    private BigDecimal realPersonCommissionAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "实际收益THB")
    private BigDecimal realPersonCommissionAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "应付佣金CNY")
    private BigDecimal totalChildCommissionAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "应付佣金VND")
    private BigDecimal totalChildCommissionAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "应付佣金THB")
    private BigDecimal totalChildCommissionAmountTHB = BigDecimal.ZERO;


    @ApiModelProperty(value = "实付佣金CNY")
    private BigDecimal realPayAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "实付佣金VND")
    private BigDecimal realPayAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "实付佣金THB")
    private BigDecimal realPayAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "剩余欠款CNY")
    private BigDecimal notPayAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "剩余欠款VND")
    private BigDecimal notPayAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "剩余欠款THB")
    private BigDecimal notPayAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "应收佣金CNY")
    private BigDecimal commissionAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "应收佣金VND")
    private BigDecimal commissionAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "应收佣金THB")
    private BigDecimal commissionAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "实收佣金CNY")
    private BigDecimal realReceiveAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "实收佣金VND")
    private BigDecimal realReceiveAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "实收佣金THB")
    private BigDecimal realReceiveAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "剩余未收CNY")
    private BigDecimal notRecviedAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "剩余未收VND")
    private BigDecimal notRecviedAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "剩余未收THB")
    private BigDecimal notRecviedAmountTHB = BigDecimal.ZERO;
}