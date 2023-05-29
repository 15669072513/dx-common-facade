package com.dx.facade.report.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author gollum
 * @version 1.0.0
 * @title 总代佣金记录总计接口响应数据传输对象
 * @desc
 * @path
 * @since 2021年09月27日 23:21:43
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("总代佣金记录总计接口响应数据传输对象")
public class FundsGeneralProxyCommissionRecordTotalRespDTO implements Serializable {

    @ApiModelProperty(value = "个人佣金CNY")
    private BigDecimal totalPersonCommissionAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "个人佣金VND")
    private BigDecimal totalPersonCommissionAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "个人佣金THB")
    private BigDecimal totalPersonCommissionAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "团队总佣金CNY")
    private BigDecimal commissionAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "团队总佣金VND")
    private BigDecimal commissionAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "团队总佣金THB")
    private BigDecimal commissionAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "预计佣金加减金额CNY")
    private BigDecimal adjustCommissionAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "预计佣金加减金额VND")
    private BigDecimal adjustCommissionAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "预计佣金加减金额THB")
    private BigDecimal adjustCommissionAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "返佣金额CNY")
    private BigDecimal commissionOnlyAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "返佣金额VND")
    private BigDecimal commissionOnlyAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "返佣金额THB")
    private BigDecimal commissionOnlyAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "冲正后净输赢CNY")
    private BigDecimal totalRushAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "冲正后净输赢VND")
    private BigDecimal totalRushAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "冲正后净输赢THB")
    private BigDecimal totalRushAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "上月结余CNY")
    private BigDecimal totalLastAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "上月结余VND")
    private BigDecimal totalLastAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "上月结余THB")
    private BigDecimal totalLastAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "代理净输赢CNY")
    private BigDecimal totalPureAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "代理净输赢VND")
    private BigDecimal totalPureAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "代理净输赢THB")
    private BigDecimal totalPureAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "会员总输赢CNY")
    private BigDecimal totalNetAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "会员总输赢VND")
    private BigDecimal totalNetAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "会员总输赢THB")
    private BigDecimal totalNetAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "场馆费CNY")
    private BigDecimal totalPlatformAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "场馆费VND")
    private BigDecimal totalPlatformAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "场馆费THB")
    private BigDecimal totalPlatformAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "总返水CNY")
    private BigDecimal totalRebateAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总返水VND")
    private BigDecimal totalRebateAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总返水THB")
    private BigDecimal totalRebateAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "总优惠CNY")
    private BigDecimal totalDiscountAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总优惠VND")
    private BigDecimal totalDiscountAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总优惠THB")
    private BigDecimal totalDiscountAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "总返点CNY")
    private BigDecimal totalProxyRebateAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "总返点CNY")
    private BigDecimal totalProxyRebateAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "总返点CNY")
    private BigDecimal totalProxyRebateAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "其他调整CNY")
    private BigDecimal totalAdjustAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty(value = "其他调整VND")
    private BigDecimal totalAdjustAmountVND = BigDecimal.ZERO;
    @ApiModelProperty(value = "其他调整THB")
    private BigDecimal totalAdjustAmountTHB = BigDecimal.ZERO;

}
