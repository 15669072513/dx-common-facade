package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProxyLoanBillAppRespDTO {

    @ApiModelProperty(value = "账单结束日期")
    private String periodEndDate;

    @ApiModelProperty("净资产")
    private BigDecimal netAssets;

    @ApiModelProperty("应还借款")
    private BigDecimal returnLoan;

    @ApiModelProperty("可提现额")
    private BigDecimal withdrawable;

    @ApiModelProperty("中心钱包余额")
    private BigDecimal walletBalance;

    @ApiModelProperty("信用余额")
    private BigDecimal creditBalance;

    @ApiModelProperty("授信额度")
    private BigDecimal creditQuota;
}