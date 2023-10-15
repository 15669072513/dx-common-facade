package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description 代理返佣结算 ->总代汇总
 * @date 2023-09-26
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "代理返佣结算 ->总代汇总", description = "代理返佣结算汇总")
public class DxSettlementCommissionTopProxyRecordSumRspDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 团队返佣金额
     */
    @ApiModelProperty("团队返佣金额")
    private BigDecimal commissionAmount;

    /**
     * 佣金调整金额
     */
    @ApiModelProperty("佣金调整金额")
    private BigDecimal adjustAmount;
    /**
     * 佣金调整后团队返佣
     */
    @ApiModelProperty("佣金调整后团队返佣")
    private BigDecimal commissionAdjustAmount;


    /**
     * 单量
     */
    @ApiModelProperty("单量")
    private Long betCount;

    /**
     * 投注额
     */
    @ApiModelProperty("投注额")
    private BigDecimal betAmount;
    /**
     * 有效投注额
     */
    @ApiModelProperty("有效投注额")
    private BigDecimal validBetAmount;

    /**
     * 活跃用户
     */
    @ApiModelProperty("活跃用户")
    private Long activeMemberNum;

    /**
     * 有效用户
     */
    @ApiModelProperty("有效用户")
    private Long effecactiveMemberNum;


    /**
     * 当前分页汇总
     */
    private  DxSettlementCommissionTopProxyRecordSumRspDTO currentSum;



}