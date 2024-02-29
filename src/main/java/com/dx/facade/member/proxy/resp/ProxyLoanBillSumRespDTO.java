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

    @ApiModelProperty("团队授信总额小计")
    private BigDecimal subTeamCreditTotal;
    @ApiModelProperty(value = "团队返点小计")
    private BigDecimal subRebateAmount;
    @ApiModelProperty(value = "代理个人返点小计")
    private BigDecimal subPersonRebateAmount;
    @ApiModelProperty(value = "代理个人取款小计")
    private BigDecimal subTotalWithdrawAmount;
    @ApiModelProperty(value = "全部会员总投注小计")
    private BigDecimal subBetAmount;
    @ApiModelProperty(value = "直属会员总投注小计")
    private BigDecimal subDirectlyMemberBetAmount;
    @ApiModelProperty(value = "全部会员总有效投注小计")
    private BigDecimal subValidBetAmount;
    @ApiModelProperty(value = "直属会员总有效投注小计")
    private BigDecimal subDirectlyMemberValidBetAmount;
    @ApiModelProperty(value = "全部会员注单量小计")
    private BigDecimal subBetCount;
    @ApiModelProperty(value = "直属会员注单量小计")
    private BigDecimal subDirectlyMemberBetCount;
    @ApiModelProperty(value = "全部会员总输赢小计")
    private BigDecimal subNetAmount;
    @ApiModelProperty(value = "直属会员总输赢小计")
    private BigDecimal subDirectlyMemberNetAmount;
    @ApiModelProperty(value = "会员总返水小计")
    private BigDecimal subMemberRebateAmount;
    @ApiModelProperty(value = "会员总存款小计")
    private BigDecimal subMemberDepositAmount;
    @ApiModelProperty(value = "会员总取款小计")
    private BigDecimal subMemberWithdrawAmount;
    @ApiModelProperty(value = "会员借款小计")
    private BigDecimal subMemberLoan;
    @ApiModelProperty(value = "会员还款小计")
    private BigDecimal subMemberRepayment;
    @ApiModelProperty(value = "外放额度小计")
    private BigDecimal subOutsideAmount;
    @ApiModelProperty(value = "授信总额小计")
    private BigDecimal subTotalCreditAmount;
    @ApiModelProperty("应还借款小计")
    private BigDecimal subShouldRepay;

    @ApiModelProperty(value = "德州-保险团队分成小计")
    private BigDecimal subInsuranceRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty(value = "德州-俱乐部服务费贡献团队返点小计")
    private BigDecimal subClubRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty(value ="综合返点小计")
    private BigDecimal subMultipleRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("团队授信总额总计")
    private BigDecimal totalTeamCreditTotal;
    @ApiModelProperty(value = "团队返点总计")
    private BigDecimal totalRebateAmount;
    @ApiModelProperty(value = "代理个人返点总计")
    private BigDecimal totalPersonRebateAmount;
    @ApiModelProperty(value = "代理个人取款总计")
    private BigDecimal totalTotalWithdrawAmount;
    @ApiModelProperty(value = "全部会员总投注总计")
    private BigDecimal totalBetAmount;
    @ApiModelProperty(value = "直属会员总投注总计")
    private BigDecimal totalDirectlyMemberBetAmount;
    @ApiModelProperty(value = "全部会员总有效投注总计")
    private BigDecimal totalValidBetAmount;
    @ApiModelProperty(value = "直属会员总有效投注总计")
    private BigDecimal totalDirectlyMemberValidBetAmount;
    @ApiModelProperty(value = "全部会员注单量总计")
    private BigDecimal totalBetCount;
    @ApiModelProperty(value = "直属会员注单量总计")
    private BigDecimal totalDirectlyMemberBetCount;
    @ApiModelProperty(value = "全部会员总输赢总计")
    private BigDecimal totalNetAmount;
    @ApiModelProperty(value = "直属会员总输赢总计")
    private BigDecimal totalDirectlyMemberNetAmount;
    @ApiModelProperty(value = "会员总返水总计")
    private BigDecimal totalMemberRebateAmount;
    @ApiModelProperty(value = "会员总存款总计")
    private BigDecimal totalMemberDepositAmount;
    @ApiModelProperty(value = "会员总取款总计")
    private BigDecimal totalMemberWithdrawAmount;
    @ApiModelProperty(value = "会员借款总计")
    private BigDecimal totalMemberLoan;
    @ApiModelProperty(value = "会员还款总计")
    private BigDecimal totalMemberRepayment;
    @ApiModelProperty(value = "外放额度总计")
    private BigDecimal totalOutsideAmount;
    @ApiModelProperty(value = "授信总额总计")
    private BigDecimal totalTotalCreditAmount;
    @ApiModelProperty("应还借款总计")
    private BigDecimal totalShouldRepay;

    @ApiModelProperty(value = "德州-保险团队分成总计")
    private BigDecimal totalInsuranceRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty(value = "德州-俱乐部服务费贡献团队返点总计")
    private BigDecimal totalClubRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty(value ="综合返点总计")
    private BigDecimal totalMultipleRebateAmount = BigDecimal.ZERO;

}
