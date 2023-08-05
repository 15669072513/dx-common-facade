package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ProxyLoanBillAppRespDTO {

    @ApiModelProperty(value = "账单类型，0-未出，1-已出账单")
    private Integer billType;

    @ApiModelProperty(value = "账单结束日期")
    private LocalDateTime periodEndDate;

    @ApiModelProperty(value = "账单生成时间")
    private LocalDateTime billCreateTime;

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