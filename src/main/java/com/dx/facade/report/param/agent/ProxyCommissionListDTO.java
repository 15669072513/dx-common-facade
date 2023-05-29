package com.dx.facade.report.param.agent;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyCommissionStatDTO
 *
 * @author kygo
 * @version 1.0.0
 * @since 20220414
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionListDTO {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "优惠契约ID", required = true, example = "1")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long contractId;

    @ApiModelProperty(value = "代理层级ID", required = true, example = "1")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long proxyLevelId;

    @ApiModelProperty(value = "佣金契约等级序号")
    private Integer contractLevel;

    @ApiModelProperty(value = "代理id")
    private String proxyId;

    @ApiModelProperty(value = "代理账户")
    private String proxyName;

    @ApiModelProperty(value = "游戏盈亏")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "场馆费")
    private BigDecimal totalPlatformAmount;

    @ApiModelProperty(value = "会员总优惠")
    private BigDecimal totalDiscountAmount;

    @ApiModelProperty(value = "会员返水")
    private BigDecimal totalRebateAmount;

    @ApiModelProperty(value = "账号调整")
    private BigDecimal totalAdjustAmount;

    @ApiModelProperty(value = "净输赢")
    private BigDecimal totalPureAmount;

    @ApiModelProperty(value = "上月结余")
    private BigDecimal totalLastAmount;

    @ApiModelProperty(value = "冲正后净输赢")
    private BigDecimal totalRushAmount;

    @ApiModelProperty(value = "活跃会员")
    private Integer monthActiveNum;

    @ApiModelProperty(value = "有效新增")
    private Integer monthEffecactiveNum;

    @ApiModelProperty(value = "本月新增有效活跃用户数")
    private Integer monthEffecactiveNumNew;

    @ApiModelProperty(value = "佣金比例")
    private BigDecimal commissionRate;

    @ApiModelProperty(value = "账户调整")
    private BigDecimal totalAcctadjustAmount;

    @ApiModelProperty(value = "佣金加减")
    private BigDecimal adjustCommissionAmount;

    @ApiModelProperty(value = "团队拥金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "佣金调整")
    private BigDecimal commissionAdjustAmount;

    @ApiModelProperty(value = "个人佣金")
    private BigDecimal totalPersonCommissionAmount;

    @ApiModelProperty(value = "剩余未收金额")
    private BigDecimal notRecviedAmount;

    @ApiModelProperty(value = "剩余未付金额")
    private BigDecimal notPayAmount;

    @ApiModelProperty(value = "客户端状态:0-已取消,1-未结清,2-已结清,3-无佣金")
    private Integer payoutStatus;

    @ApiModelProperty(value = "代理总返点（有返点契约的代理才有该项）")
    private BigDecimal totalProxyRebateAmount;
}

