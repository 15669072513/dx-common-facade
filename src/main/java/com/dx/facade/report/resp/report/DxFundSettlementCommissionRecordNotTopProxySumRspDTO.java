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
 * @description 代理返佣记录-非总代
 * @date 2023-09-26
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "代理返佣记录-非总代", description = "代理返佣记录-非总代")
public class DxFundSettlementCommissionRecordNotTopProxySumRspDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 剩余未收返佣金额
     */
    @ApiModelProperty("剩余未收返佣金额")
    private BigDecimal uncollectedCommissionAmount;

    /**
     * 个人返佣金额
     */
    @ApiModelProperty("个人返佣金额")
    private BigDecimal personCommissionAmount;

    /**
     * 下级团队返佣金额
     */
    @ApiModelProperty("下级团队返佣金额")
    private BigDecimal childCommissionAmount;

    /**
     * 调整后团队返佣
     */
    @ApiModelProperty("调整后团队返佣")
    private BigDecimal commissionAdjustAmount;

    /**
     * 返佣调整
     */
    @ApiModelProperty("返佣调整")
    private BigDecimal adjustAmount;

    /**
     * 团队返佣金额
     */
    @ApiModelProperty("团队返佣金额")
    private BigDecimal commissionAmount;

    /**
     * 当前分页汇总
     */
    private DxFundSettlementCommissionRecordNotTopProxySumRspDTO currentSum;



}