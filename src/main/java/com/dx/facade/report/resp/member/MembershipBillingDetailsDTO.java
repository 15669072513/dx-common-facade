package com.dx.facade.report.resp.member;

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
    private Long merchantId;
    @ApiModelProperty("用户ID")
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
}
