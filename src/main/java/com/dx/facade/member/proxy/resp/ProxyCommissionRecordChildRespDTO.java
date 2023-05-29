package com.dx.facade.member.proxy.resp;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/*
* 总代佣金记录
* 非总代佣金记录
* */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyCommissionRecordChildRespDTO implements Serializable {

    @ApiModelProperty(value = "月份")
    private  Integer reportYm;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "代理层级")
    private String proxyLevelName;

    @ApiModelProperty(value = "币种")
    private String  currency;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "风控层级")
    private String windControlLevel;

    @ApiModelProperty(value = "个人佣金")
    private BigDecimal totalPersonCommissionAmount;

    @ExcelProperty(value = "下级总佣金")
    private BigDecimal totalChildCommissionAmount;

    @ApiModelProperty(value = "团队总拥金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "等级专享佣金")
    private BigDecimal rewardAmount;

    @ApiModelProperty(value = "等级专享比例")
    private BigDecimal proxyVipLevelRate;

    @ApiModelProperty(value = "返佣金额")
    private BigDecimal commissionOnlyAmount;

    @ApiModelProperty(value = "佣金比例")
    private BigDecimal commissionRate;

    @ApiModelProperty(value = "冲正后净输赢")
    private BigDecimal totalRushAmount;

    @ApiModelProperty(value = "上月结余")
    private BigDecimal totalLastAmount;

    @ApiModelProperty(value = "代理净输赢")
    private BigDecimal totalPureAmount;

    @ApiModelProperty(value = "会员总输赢")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "场馆费")
    private BigDecimal totalPlatformAmount;

    @ApiModelProperty(value = "会员返水")
    private BigDecimal totalRebateAmount;

    @ApiModelProperty(value = "会员优惠")
    private BigDecimal totalDiscountAmount;

    @ApiModelProperty(value = "会员账号调整")
    private BigDecimal totalAdjustAmount;

    @ApiModelProperty(value = "补单输赢")
    private BigDecimal totalPatchNetAmount;

    @ApiModelProperty(value = "代理返点")
    private BigDecimal totalProxyRebateAmount;
}