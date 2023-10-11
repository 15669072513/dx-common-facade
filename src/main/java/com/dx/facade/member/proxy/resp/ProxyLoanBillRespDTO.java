package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ProxyLoanBillRespDTO {


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

    @ApiModelProperty("中心钱包余额")
    private BigDecimal walletBalance;

    @ApiModelProperty("信用钱包余额")
    private BigDecimal creditBalance;

    @ApiModelProperty("授信额度")
    private BigDecimal creditQuota;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("是否有下级,0-否,1-有")
    private Integer hasNext;
}