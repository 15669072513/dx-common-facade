package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 代理表财务信息表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyAccumulateRpcReqDTO implements Serializable {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("代理ID")
    private Long proxyId;

    @ApiModelProperty("商户id")
    private Long merchantId;

    @ApiModelProperty("给会员充值上分")
    private BigDecimal rebate;

    @ApiModelProperty("中心钱包转信用钱包")
    private BigDecimal cashToCredit;

    @ApiModelProperty("中心钱包转信用钱包次数")
    private Integer cashToCreditTimes;

    @ApiModelProperty("信用钱包转中心钱包")
    private BigDecimal creditToCash;

    @ApiModelProperty("信用钱包转中心钱包次数")
    private Integer creditToCashTimes;

    @ApiModelProperty("给会员充值上分")
    private BigDecimal activeDepositToMember;

    @ApiModelProperty("给会员充值上分次数")
    private Integer activeDepositToMemberTimes;

    @ApiModelProperty("给代理充值上分")
    private BigDecimal activeDepositToProxy;

    @ApiModelProperty("给代理充值上分次数")
    private Integer activeDepositToProxyTimes;

    @ApiModelProperty("被代理充值上分")
    private BigDecimal passiveDepositByProxy;

    @ApiModelProperty("被代理充值上分次数")
    private Integer passiveDepositByProxyTimes;

    @ApiModelProperty("被官方充值上分")
    private BigDecimal passiveDepositByPlatform;

    @ApiModelProperty("被官方充值上分次数")
    private Integer passiveDepositByPlatformTimes;

    @ApiModelProperty("给会员提现下分")
    private BigDecimal activeWithdrawToMember;

    @ApiModelProperty("给会员提现下分次数")
    private Integer activeWithdrawToMemberTimes;

    @ApiModelProperty("给代理提现下分")
    private BigDecimal activeWithdrawToProxy;

    @ApiModelProperty("给代理提现下分次数")
    private Integer activeWithdrawToProxyTimes;

    @ApiModelProperty("被代理提现下分")
    private BigDecimal passiveWithdrawByProxy;

    @ApiModelProperty("被代理提现下分次数")
    private Integer passiveWithdrawByProxyTimes;

    @ApiModelProperty("被官方提现下分")
    private BigDecimal passiveWithdrawByPlatform;

    @ApiModelProperty("被官方提现下分次数")
    private Integer passiveWithdrawByPlatformTimes;

    @ApiModelProperty("给会员授信上分")
    private BigDecimal activeCreditDepositToMember;

    @ApiModelProperty("给会员授信上分次数")
    private Integer activeCreditDepositToMemberTimes;

    @ApiModelProperty("给代理授信上分")
    private BigDecimal activeCreditDepositToProxy;

    @ApiModelProperty("给代理授信上分次数")
    private Integer activeCreditDepositToProxyTimes;

    @ApiModelProperty("被代理授信上分")
    private BigDecimal passiveCreditDepositByProxy;

    @ApiModelProperty("被代理授信上分次数")
    private Integer passiveCreditDepositByProxyTimes;

    @ApiModelProperty("被官方授信上分")
    private BigDecimal passiveCreditDepositByPlatform;

    @ApiModelProperty("被官方授信上分次数")
    private Integer passiveCreditDepositByPlatformTimes;

    @ApiModelProperty("给会员授信下分")
    private BigDecimal activeCreditWithdrawToMember;

    @ApiModelProperty("给会员授信下分次数")
    private Integer activeCreditWithdrawToMemberTimes;

    @ApiModelProperty("给代理授信下分")
    private BigDecimal activeCreditWithdrawToProxy;

    @ApiModelProperty("给代理授信下分次数")
    private Integer activeCreditWithdrawToProxyTimes;

    @ApiModelProperty("被代理授信下分")
    private BigDecimal passiveCreditWithdrawByProxy;

    @ApiModelProperty("被代理授信下分次数")
    private Integer passiveCreditWithdrawByProxyTimes;

    @ApiModelProperty("被官方授信下分")
    private BigDecimal passiveCreditWithdrawByPlatform;

    @ApiModelProperty("被官方授信下分次数")
    private Integer passiveCreditWithdrawByPlatformTimes;

    @ApiModelProperty("业务id")
    private Long bizId;

    @ApiModelProperty("注册时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedAt;

    private static final long serialVersionUID = 1L;
}