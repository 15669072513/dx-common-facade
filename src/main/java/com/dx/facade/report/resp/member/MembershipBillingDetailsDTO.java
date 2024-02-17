package com.dx.facade.report.resp.member;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Rebuy
 */
@Setter
@Getter
@ApiModel("会员账单详情")
public class MembershipBillingDetailsDTO {
    @ApiModelProperty("账单日期")
    private Integer reportDate;
    @ApiModelProperty("账单日期时间")
    private Integer reportDateTime;
    @ApiModelProperty("账单开始日期")
    private Integer reportStDate;
    private Integer billType;
    @ApiModelProperty("bill_id")
    private String billId;
    @ApiModelProperty("商户id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long merchantId;
    @ApiModelProperty("用户ID")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;
    @ApiModelProperty("用户名称")
    private String userName;
    @ApiModelProperty("账号类型,1-一代,2-二代,99-会员")
    private Integer acctType;
    @ApiModelProperty("币种")
    private String currency;
    @ApiModelProperty("团队资产")
    private BigDecimal teamFunds;
    @ApiModelProperty("团队应还借款")
    private BigDecimal teamReturnLoan;
    @ApiModelProperty("团队可提现额")
    private BigDecimal teamWithdrawable;
    @ApiModelProperty("净资产")
    private BigDecimal netAssets;
    @ApiModelProperty("应还账款")
    private BigDecimal returnLoan;
    @ApiModelProperty("可提现额")
    private BigDecimal withdrawable;
    @ApiModelProperty("钱包余额")
    private BigDecimal walletBalance;
    @ApiModelProperty("信用余额")
    private BigDecimal creditBalance;
    @ApiModelProperty("授信额度")
    private BigDecimal creditQuota;
    @ApiModelProperty("报表生成时间")
    private LocalDateTime createdAt;


    @ApiModelProperty(value = "1： 实际账单，2参考计算账单")
    private Integer applyType;

    @ApiModelProperty(value = "团队授信额度")
    private BigDecimal teamCreditQuota;

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

    @ApiModelProperty(value = "全部会员注单量")
    private BigDecimal betCount;

    @ApiModelProperty(value = "直属会员注单量")
    private BigDecimal directlyMemberBetCount;

    @ApiModelProperty(value = "全部会员总输赢")
    private BigDecimal netAmount;

    @ApiModelProperty(value = "直属会员总输赢")
    private BigDecimal directlyMemberNetAmount;

    @ApiModelProperty(value = "会员总返水")
    private BigDecimal memberRebateAmount;

    @ApiModelProperty(value = "会员总存款")
    private BigDecimal memberDepositAmount;

    @ApiModelProperty(value = "会员总取款")
    private BigDecimal memberWithdrawAmount;

    @ApiModelProperty(value = "会员借款")
    private BigDecimal memberLoan;

    @ApiModelProperty(value = "会员还款")
    private BigDecimal memberRepayment;

    @ApiModelProperty(value = "外放额度")
    private BigDecimal outsideAmount;

    @ApiModelProperty(value = "授信总额")
    private BigDecimal totalCreditAmount;

    @ApiModelProperty(value = "应还借款")
    private BigDecimal shouldRepay;

    @ApiModelProperty(value = "团队授信总额")
    private BigDecimal teamCreditTotal;

    @ApiModelProperty(value = "直属会员总返水")
    private BigDecimal directlyMemberRebateAmount;

    @ApiModelProperty(value = "直属会员总存款")
    private BigDecimal directlyMemberDepositAmount;

    @ApiModelProperty(value = "直属会员总取款")
    private BigDecimal directlyMemberWithdrawAmount;

    @ApiModelProperty(value = "直属会员借款")
    private BigDecimal directlyMemberLoanAmount;

    @ApiModelProperty(value = "直属会员还款")
    private BigDecimal directlyMemberRepaymentAmount;

    @ApiModelProperty(value = "新注册用户")
    private Long newMemberNum;

    @ApiModelProperty(value = "活跃用户")
    private Long activeMemberNum;

    @ApiModelProperty(value = "直属新注册用户")
    private Long directlyNewMemberNum;

    @ApiModelProperty(value = "直属活跃用户")
    private Long directlyActiveMemberNum;

    @ApiModelProperty(value = "账单结束日期")
    private Integer reportEnDate;

    @ApiModelProperty(value = "版本")
    private Integer version;
    @ApiModelProperty("开始时间-格式化")
    private String reportStDateStr;
    @ApiModelProperty("开始时间-格式化")
    private String reportEdDateStr;
    @ApiModelProperty("开始时间-格式化时间戳")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long  reportStDateTimestamp;
    @ApiModelProperty("开始时间-格式化时间戳")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long reportEnDateTimestamp;
    @ApiModelProperty(value = "全部会员总有效投注")
    private BigDecimal validBetAmount;
    @ApiModelProperty(value = "直属会员总有效投注")
    private BigDecimal directlyMemberValidBetAmount;
    @ApiModelProperty(value = "净资产，现金余额+冻结金额-应还借款 ")
    private BigDecimal netAssetsNew;
}
