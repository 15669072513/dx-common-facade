package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @description 资金调整-非总代返佣管理列表查询
 * @date 2023-09-26
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "团队返佣数据", description = "团队返佣数据")
public class DxFundAdjustSettlementCommissionProxyRecordSumRspDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实际收益金额
     */
    @ApiModelProperty("实际收益金额")
    private BigDecimal actualAmount;
    /**
     * 应付返佣金额
     */
    @ApiModelProperty("应付返佣金额")
    private BigDecimal payableAmount;
    /**
     * 实付返佣
     */
    @ApiModelProperty("实付返佣")
    private BigDecimal actualPayAmount;
    /**
     * 剩余欠款金额
     */
    @ApiModelProperty("剩余欠款金额")
    private BigDecimal remainingDebtAmount;

    /**
     * 应收返佣
     */
    @ApiModelProperty("应收返佣")
    private BigDecimal receivableAmount;

    /**
     * 实收返佣
     */
    @ApiModelProperty("实收返佣")
    private BigDecimal actualReceivableAmount;

    /**
     * 剩余未收
     */
    @ApiModelProperty("剩余未收")
    private BigDecimal remainingUncollectedAmount;

    /**
     * 当前页条件下得总汇总数据
     */
    private DxFundAdjustSettlementCommissionProxyRecordSumRspDTO currentSum;


}