package com.dx.facade.report.resp.proxy;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-ProxyDayReportSummaryDTO", description = "会员报表总计对象")
public class ProxyDayReportSummaryDTO {

    @ApiModelProperty("代理层级路径")
    private String proxyPathUsername;

    @ApiModelProperty("标签,0总代,1非总代,2最底层代理")
    private Integer flag;


    @ApiModelProperty(value = "累计个人已收返点金额(累计返点)")
    private BigDecimal totalReceiveRebate;

    @ApiModelProperty(value = "累计收益")
    private BigDecimal totalIncomeAmount=BigDecimal.ZERO;


    //  上下分


    @ApiModelProperty("给会员上下分差值")
    @TableField("proxy_to_mem_differ_amount")
    private BigDecimal proxyToMemDifferAmount;

    @ApiModelProperty("给会员上下分次数")
    @TableField("proxy_to_mem_times")
    private Long proxyToMemTimes;

    @ApiModelProperty("给会员上下分人数")
    @TableField("proxy_to_mem_num")
    private Long proxyToMemNum;

    @ApiModelProperty("给代理上下分差值")
    @TableField("proxy_to_child_differ_amount")
    private BigDecimal proxyToChildDifferAmount;

    @ApiModelProperty("给代理上下分次数")
    @TableField("proxy_to_child_times")
    private Long proxyToChildTimes;

    @ApiModelProperty("给代理上下分人数")
    @TableField("proxy_to_child_num")
    private Long proxyToChildNum;

    @ApiModelProperty("被代理上下分差值")
    @TableField("proxy_be_differ_amount")
    private BigDecimal proxyBeDifferAmount;

    @ApiModelProperty("被代理上下分差次数")
    @TableField("proxy_be_differ_times")
    private Long proxyBeDifferTimes;


    @ApiModelProperty(value = "转入现金钱包次数")
    private Integer transferCenterWalletTimes;

    @ApiModelProperty(value = "转入现金钱包总额", required = true, example = "2343")
    private BigDecimal transferCenterWalletAmount;

    @ApiModelProperty(value = "佣金转额度钱包总额")
    private BigDecimal transferQuotaWalletAmount ;
    @ApiModelProperty(value = "转入现金钱包次数")
    private Integer transferQuotaWalletTimes;



    // TODO dwm_proxy_report_d
    @ApiModelProperty(value = "返点调整")
    private BigDecimal rebateAdjustAmount;



    @ApiModelProperty(value = "佣金钱包余额")
    private BigDecimal rebateBalance;

    @ApiModelProperty(value = "额度钱包余额")
    private BigDecimal availableBalance;


    @ApiModelProperty(value = "全部代理人数")
    private Integer underProxyNum;

    @ApiModelProperty(value = "直属代理人数")
    private Integer directlyUnderProxyNum;

    @ApiModelProperty(value = "全部会员人数")
    private Integer underMemberNum;

    @ApiModelProperty(value = "直属会员人数")
    private Integer directlyUnderMemberNum;

    @ApiModelProperty(value = "转入会员数")
    private Integer transferInNum;

    @ApiModelProperty(value = "转出会员数")
    private Integer transferOutNum;

    @ApiModelProperty(value = "返点金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "钱包余额")
    private BigDecimal walletBalance;

    @ApiModelProperty(value = "可用额度")
    private BigDecimal creditBalance;

    @ApiModelProperty(value = "授信额度")
    private BigDecimal creditQuota;

    @ApiModelProperty(value = "应还借款")
    private BigDecimal returnLoan;

    @ApiModelProperty("官方给代理充值上分")
    @TableField("officer_proxy_cash_up_amount")
    private BigDecimal officerProxyCashUpAmount;

    @ApiModelProperty("官方给代理充值上分次数")
    @TableField("officer_proxy_cash_up_times")
    private Long officerProxyCashUpTimes;

    @ApiModelProperty("代理被上级充值上分")
    @TableField("proxy_be_cash_up_amount")
    private BigDecimal proxyBeCashUpAmount;

    @ApiModelProperty("代理被上级充值上分次数")
    @TableField("proxy_be_cash_up_times")
    private Long proxyBeCashUpTimes;

    @ApiModelProperty("代理给下级充值上分")
    @TableField("proxy_to_child_cash_up_amount")
    private BigDecimal proxyToChildCashUpAmount;

    @ApiModelProperty("代理给下级充值上分次数")
    @TableField("proxy_to_child_cash_up_times")
    private Long proxyToChildCashUpTimes;


    @ApiModelProperty("代理给会员充值上分")
    @TableField("proxy_to_mem_cash_up_amount")
    private BigDecimal proxyToMemCashUpAmount;

    @ApiModelProperty("代理给会员充值上分次数")
    @TableField("proxy_to_mem_cash_up_times")
    private Long proxyToMemCashUpTimes;


    @ApiModelProperty("官方给代理提现下分")
    @TableField("officer_proxy_cash_down_amount")
    private BigDecimal officerProxyCashDownAmount;

    @ApiModelProperty("官方给代理提现下分次数")
    @TableField("officer_proxy_cash_down_times")
    private Long officerProxyCashDownTimes;

    @ApiModelProperty("代理被上级提现下分")
    @TableField("proxy_be_cash_down_amount")
    private BigDecimal proxyBeCashDownAmount;

    @ApiModelProperty("代理被上级提现下分次数")
    @TableField("proxy_be_cash_down_times")
    private Long proxyBeCashDownTimes;

    @ApiModelProperty("代理给下级提现下分")
    @TableField("proxy_to_child_cash_down_amount")
    private BigDecimal proxyToChildCashDownAmount;

    @ApiModelProperty("代理给下级提现下分次数")
    @TableField("proxy_to_child_cash_down_times")
    private Long proxyToChildCashDownTimes;

    @ApiModelProperty("代理给会员提现下分")
    @TableField("proxy_to_mem_cash_down_amount")
    private BigDecimal proxyToMemCashDownAmount;

    @ApiModelProperty("代理给会员提现下分次数")
    @TableField("proxy_to_mem_cash_down_times")
    private Long proxyToMemCashDownTimes;

    @ApiModelProperty("官方给代理授信上分")
    @TableField("officer_proxy_credit_up_amount")
    private BigDecimal officerProxyCreditUpAmount;

    @ApiModelProperty("官方给代理授信上分次数")
    @TableField("officer_proxy_credit_up_times")
    private Long officerProxyCreditUpTimes;

    @ApiModelProperty("代理被上级授信上分")
    @TableField("proxy_be_credit_up_amount")
    private BigDecimal proxyBeCreditUpAmount;

    @ApiModelProperty("代理被上级授信上分次数")
    @TableField("proxy_be_credit_up_times")
    private Long proxyBeCreditUpTimes;

    @ApiModelProperty("代理给下级授信上分")
    @TableField("proxy_to_child_credit_up_amount")
    private BigDecimal proxyToChildCreditUpAmount;

    @ApiModelProperty("代理给下级授信上分次数")
    @TableField("proxy_to_child_credit_up_times")
    private Long proxyToChildCreditUpTimes;

    @ApiModelProperty("代理给会员授信上分")
    @TableField("proxy_to_mem_credit_up_amount")
    private BigDecimal proxyToMemCreditUpAmount;

    @ApiModelProperty("代理给会员授信上分次数")
    @TableField("proxy_to_mem_credit_up_times")
    private Long proxyToMemCreditUpTimes;

    @ApiModelProperty("官方给代理授信下分")
    @TableField("officer_proxy_credit_down_amount")
    private BigDecimal officerProxyCreditDownAmount;

    @ApiModelProperty("官方给代理授信下分次数")
    @TableField("officer_proxy_credit_down_times")
    private Long officerProxyCreditDownTimes;

    @ApiModelProperty("代理被上级授信下分")
    @TableField("proxy_be_credit_down_amount")
    private BigDecimal proxyBeCreditDownAmount;

    @ApiModelProperty("代理被上级授信下分次数")
    @TableField("proxy_be_credit_down_times")
    private Long proxyBeCreditDownTimes;

    @ApiModelProperty("代理给下级授信下分")
    @TableField("proxy_to_child_credit_down_amount")
    private BigDecimal proxyToChildCreditDownAmount;

    @ApiModelProperty("代理给下级授信下分次数")
    @TableField("proxy_to_child_credit_down_times")
    private Long proxyToChildCreditDownTimes;

    @ApiModelProperty("代理给会员授信下分")
    @TableField("proxy_to_mem_credit_down_amount")
    private BigDecimal proxyToMemCreditDownAmount;

    @ApiModelProperty("代理给会员授信下分次数")
    @TableField("proxy_to_mem_credit_down_times")
    private Long proxyToMemCreditDownTimes;

    @ApiModelProperty(value = "其他调整")
    @TableField("other_adjust_amount")
    private BigDecimal otherAdjustAmount;


    @ApiModelProperty(value = "返佣金额")
    @TableField("commission_amount")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "返佣其他调整")
    @TableField("commission_adjust_amount")
    private BigDecimal commissionAdjustAmount;

    @ApiModelProperty(value = "首存金额")
    @TableField("first_deposit")
    private BigDecimal firstDeposit;

    @ApiModelProperty(value = "首存时间")
    @TableField("first_deposit_datetime")
    private String firstDepositDatetime;


    @ApiModelProperty(value = "总存款/会员总存款")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "存款次数/会员存款次数")
    private Long depositTimes;

    @ApiModelProperty(value = "总取款/会员总取款")
    private BigDecimal withdrawAmount;

    @ApiModelProperty(value = "取款次数/会员取款次数")
    private Long withdrawTimes;

    @ApiModelProperty(value = "存取差/会员存取差")
    private BigDecimal depositWithdrawDifferAmount;

    @ApiModelProperty("官方帮代理信用还款总额")
    @TableField("official_help_proxy_credit_repay_amount")
    private BigDecimal officialHelpProxyCreditRepayAmount;
    @ApiModelProperty("官方帮代理信用还款次数")
    @TableField("official_help_proxy_credit_repay_times")
    private Long officialHelpProxyCreditRepayTimes;

    @ApiModelProperty("上级帮代理信用还款总额")
    @TableField("parent_proxy_help_proxy_credit_repay_amount")
    private BigDecimal parentProxyHelpProxyCreditRepayAmount;
    @ApiModelProperty("上级帮代理信用还款次数")
    @TableField("parent_proxy_help_proxy_credit_repay_times")
    private Long parentProxyHelpProxyCreditRepayTimes;

    @ApiModelProperty("代理帮下级信用还款总额")
    @TableField("proxy_help_sub_proxy_credit_repay_amount")
    private BigDecimal proxyHelpSubProxyCreditRepayAmount;
    @ApiModelProperty("代理帮下级信用还款次数")
    @TableField("proxy_help_sub_proxy_credit_repay_times")
    private Long proxyHelpSubProxyCreditRepayTimes;

    @ApiModelProperty("代理帮会员信用还款总额")
    @TableField("proxy_help_sub_member_credit_repay_amount")
    private BigDecimal proxyHelpSubMemberCreditRepayAmount;
    @ApiModelProperty("代理帮会员信用还款次数")
    @TableField("proxy_help_sub_member_credit_repay_times")
    private Long proxyHelpSubMemberCreditRepayTimes;


    @ApiModelProperty("平台充值上分")
    @TableField("deposit_back_amount")
    private BigDecimal depositBackAmount;


    @ApiModelProperty("平台提现下分")
    @TableField("withdraw_back_amount")
    private BigDecimal withdrawBackAmount;

}
