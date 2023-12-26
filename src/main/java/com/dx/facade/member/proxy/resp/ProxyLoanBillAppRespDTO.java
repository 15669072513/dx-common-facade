package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ProxyLoanBillAppRespDTO {

    @ApiModelProperty(value = "账单类型，0-未出，1-已出账单")
    private Integer billType;

    @ApiModelProperty(value = "账单开始日期")
    private LocalDateTime periodStDate;

    @ApiModelProperty(value = "账单结束日期")
    private LocalDateTime periodEndDate;

    @ApiModelProperty(value = "账单生成时间")
    private LocalDateTime billCreateTime;

    @ApiModelProperty(value = "账单Id,账单号")
    private String billNo;

    @ApiModelProperty("净资产")
    private BigDecimal netAssets;

    @ApiModelProperty("应还借款")
    private BigDecimal returnLoan;

    @ApiModelProperty("可提现额")
    private BigDecimal withdrawable;

    @ApiModelProperty("现金余额")
    private BigDecimal walletBalance;

    @ApiModelProperty("可用额度")
    private BigDecimal creditBalance;

    @ApiModelProperty("授信额度")
    private BigDecimal creditQuota;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("读取状态,0-未读,1-已读")
    private Integer readStatus;

    @ApiModelProperty("版本,0-旧版,1-1.34")
    private Integer version;

    @ApiModelProperty("账单用户名")
    private Integer userName;
}