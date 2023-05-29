package com.dx.facade.member.proxy.resp;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyCommissionRecordAuditRespDTO implements Serializable {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @ApiModelProperty(value = "代理层级")
    private String proxyLevelName;

    @ApiModelProperty(value = "风控层级")
    private String windControlLevel;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "币种")
    private String currency;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 3-二审通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "当前锁单账号Id")
    private Long lockAccountId;

    @ApiModelProperty(value = "当前锁单账号")
    private String lockAccount;

    @ApiModelProperty("锁单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lockTime;

    @ApiModelProperty(value = "结算年月")
    private Integer reportYm;

    @ApiModelProperty(value = "报表日期，每月一条")
    private Integer reportDate;

    @ApiModelProperty(value = "团队总拥金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "佣金加减")
    private BigDecimal adjustCommissionAmount;

    @ApiModelProperty(value = "报表创建(申请)时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "1审核账号")
    private String audit1Operator;

    @ApiModelProperty(value = "2审核账号")
    private String audit2Operator;

    @ApiModelProperty(value = "个人佣金")
    private BigDecimal totalPersonCommissionAmount;

    @ApiModelProperty(value = "下级总佣金")
    private BigDecimal totalChildCommissionAmount;

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

    @ApiModelProperty(value = "其他调整")
    private BigDecimal totalAdjustAmount;

    @ApiModelProperty(value = "补单输赢")
    private BigDecimal totalPatchNetAmount;

    @ApiModelProperty(value = "代理返点")
    private BigDecimal totalProxyRebateAmount;

}