package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProxyLoanBillAppRespDTO {

    @ApiModelProperty(value = "账单结束日期")
    private String periodEndDate;

    @ApiModelProperty("中心钱包余额")
    private BigDecimal walletBalance;

    @ApiModelProperty("应还借款")
    private BigDecimal returnLoan;
}