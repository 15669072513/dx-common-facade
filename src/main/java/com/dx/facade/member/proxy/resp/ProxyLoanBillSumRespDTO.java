package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 */
@Data
public class ProxyLoanBillSumRespDTO {

    @ApiModelProperty("团队账单净资产小计")
    private BigDecimal subTeamFunds;

    @ApiModelProperty("团队应还账款小计")
    private BigDecimal subTeamReturnLoan;

    @ApiModelProperty("团队可提现额小计")
    private BigDecimal subTeamWithdrawable;

    @ApiModelProperty("账单净资产小计")
    private BigDecimal subNetAssets;

    @ApiModelProperty("应还账款小计")
    private BigDecimal subReturnLoan;

    @ApiModelProperty("可提现额小计")
    private BigDecimal subWithdrawable;

    @ApiModelProperty("现金余额小计")
    private BigDecimal subWalletBalance;

    @ApiModelProperty("信用钱包余额小计")
    private BigDecimal subCreditBalance;

    @ApiModelProperty("授信额度小计")
    private BigDecimal subCreditQuota;

    @ApiModelProperty("团队账单净资产总计")
    private BigDecimal totalTeamFunds;

    @ApiModelProperty("团队应还账款总计")
    private BigDecimal totalTeamReturnLoan;

    @ApiModelProperty("团队可提现额总计")
    private BigDecimal totalTeamWithdrawable;

    @ApiModelProperty("账单净资产总计")
    private BigDecimal totalNetAssets;

    @ApiModelProperty("应还账款总计")
    private BigDecimal totalReturnLoan;

    @ApiModelProperty("可提现额总计")
    private BigDecimal totalWithdrawable;

    @ApiModelProperty("现金余额总计")
    private BigDecimal totalWalletBalance;

    @ApiModelProperty("信用钱包余额总计")
    private BigDecimal totalCreditBalance;

    @ApiModelProperty("授信额度总计")
    private BigDecimal totalCreditQuota;
}
