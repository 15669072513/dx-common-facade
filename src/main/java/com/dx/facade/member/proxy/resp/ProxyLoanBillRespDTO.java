package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ProxyLoanBillRespDTO {

    @ApiModelProperty(value = "账单类型", notes = "0-未出账单,1-已出账单")
    private Integer billType;

    @ApiModelProperty("版本,0-旧版,1-1.34")
    private Integer version;

    @ApiModelProperty(value = "账单开始日期")
    private Integer stDate;

    @ApiModelProperty(value = "账单结束日期")
    private Integer endDate;


    @ApiModelProperty("账单ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("账单号, 账单ID")
    private String billNo;

    @ApiModelProperty("账单日期")
    private String applyTime;

    @ApiModelProperty("生成时间")
    private LocalDateTime createTime;

    @ApiModelProperty("账号")
    private String acctName;

    @ApiModelProperty("账号类型,0-总代,1-一代,2-二代,99-会员")
    private Integer acctType;

    @ApiModelProperty("账户状态,0-正常 1-锁定")
    private Integer acctStatus;

    @ApiModelProperty("所属商户")
    private String topMerchantName;

    @ApiModelProperty("上级代理")
    private String parentProxyName;

    @ApiModelProperty("所属总代")
    private String topProxyName;

    @ApiModelProperty("代理用户名层级路径")
    private String proxyPathUserName;

    @ApiModelProperty("风控层级")
    private String windControlName;

    @ApiModelProperty("团队账单净资产")
    private BigDecimal teamFunds;

    @ApiModelProperty("团队应还账款")
    private BigDecimal teamReturnLoan;

    @ApiModelProperty("团队可提现额")
    private BigDecimal teamWithdrawable;

    @ApiModelProperty("账单净资产")
    private BigDecimal netAssets;

    @ApiModelProperty("应还账款")
    private BigDecimal returnLoan;

    @ApiModelProperty("可提现额")
    private BigDecimal withdrawable;

    @ApiModelProperty("现金余额")
    private BigDecimal walletBalance;

    @ApiModelProperty("信用钱包余额")
    private BigDecimal creditBalance;

    @ApiModelProperty("授信额度")
    private BigDecimal creditQuota;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("是否有下级,0-否,1-有")
    private Integer hasNext;

    private Long userId;

    @ApiModelProperty("0-实际账单，1-参考计算账单")
    private Integer applyType;

    @ApiModelProperty("团队授信总额")
    private BigDecimal teamCreditTotal;
    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount;
    @ApiModelProperty(value = "代理个人返点")
    private BigDecimal personRebateAmount;
    @ApiModelProperty(value = "代理个人取款")
    private BigDecimal totalWithdrawAmount;
    @ApiModelProperty(value = "全部会员总投注")
    private BigDecimal betAmount;
    @ApiModelProperty(value = "直属会员总投注")
    private BigDecimal directlyMemberBetAmount;
    @ApiModelProperty(value = "全部会员总有效投注")
    private BigDecimal validBetAmount;
    @ApiModelProperty(value = "直属会员总有效投注")
    private BigDecimal directlyMemberValidBetAmount;
    @ApiModelProperty(value = "全部会员注单量")
    private BigDecimal betCount;
    @ApiModelProperty(value = "直属会员注单量")
    private BigDecimal directlyMemberBetCount;
    @ApiModelProperty(value = "全部会员总输赢")
    private BigDecimal netAmount;
    @ApiModelProperty(value = "直属会员总输赢")
    private BigDecimal directlyMemberNetAmount;
    @ApiModelProperty(value = "全部会员总返水")
    private BigDecimal memberRebateAmount;
    @ApiModelProperty(value = "全部会员总存款")
    private BigDecimal memberDepositAmount;
    @ApiModelProperty(value = "全部会员总取款")
    private BigDecimal memberWithdrawAmount;
    @ApiModelProperty(value = "全部会员借款")
    private BigDecimal memberLoan;
    @ApiModelProperty(value = "全部会员还款")
    private BigDecimal memberRepayment;
    @ApiModelProperty(value = "外放额度")
    private BigDecimal outsideAmount;
    @ApiModelProperty(value = "授信总额")
    private BigDecimal totalCreditAmount;
    @ApiModelProperty("应还借款")
    private BigDecimal shouldRepay;
    @ApiModelProperty(value = "德州-保险团队分成")
    private BigDecimal insuranceRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty(value = "德州-俱乐部服务费贡献团队返点")
    private BigDecimal clubRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty(value ="综合返点")
    private BigDecimal multipleRebateAmount = BigDecimal.ZERO;

}