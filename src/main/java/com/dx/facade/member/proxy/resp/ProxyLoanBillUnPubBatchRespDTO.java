package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ProxyLoanBillUnPubBatchRespDTO {

    @ApiModelProperty(value = "账单开始日期")
    private LocalDateTime periodStDate;

    @ApiModelProperty(value = "账单结束日期")
    private LocalDateTime periodEndDate;

    @ApiModelProperty(value = "账单生成时间")
    private LocalDateTime billCreateTime;

    @ApiModelProperty("账号类型,1-一代,2-二代,99-会员")
    private Integer acctType;

    @ApiModelProperty("用户id")
    private Long userId;

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
}