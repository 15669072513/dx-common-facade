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
 * @description 代理返佣结算表日志
 * @date 2023-09-26
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "团队返佣调整日志", description = "团队返佣调整日志")
public class DxSettlementCommissionProxyRecordLogRspDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    /**
     * 代理返佣结算表id
     */
    @ApiModelProperty("代理返佣结算表id")
    private Long settlementCommissionProxyRecordId;

    /**
     * '1：调整返佣增加，2：调整返佣减少，3：返佣取消，4：代发佣金）
     */
    @ApiModelProperty("'操作类型（1：调整返佣增加，2：调整返佣减少，3：返佣取消，4：代发佣金）")
    private Integer operationType;
    /**
     * 报表日期
     */
    @ApiModelProperty("报表日期")
    private Long reportYm;

    /**
     * 周期名称 - 结算期数
     */
    @ApiModelProperty("周期名称 - 结算期数")
    private String cycleName;
    /**
     * 周期类型: 1-天 2-周 3-月
     */
    @ApiModelProperty("id")
    private Integer cycleType;

    /**
     * 代理id&收款代理id
     */
    @ApiModelProperty("代理id&收款代理id")
    private Long proxyId;

    /**
     * 代理id&收款代理名称
     */
    @ApiModelProperty("代理id&收款代理名称")
    private String proxyName;

    /**
     * 支付代理id
     */
    @ApiModelProperty("支付代理id")
    private Long payProxyId;

    /**
     * 支付代理名称
     */
    @ApiModelProperty("支付代理名称")
    private String payProxyName;

    /**
     * 商户id
     */
    @ApiModelProperty("商户id")
    private Long merchantId;

    /**
     * 商户名称
     */
    @ApiModelProperty("商户名称")
    private String merchantName;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currency;

    /**
     * 佣金调整金额
     */
    @ApiModelProperty("佣金调整金额")
    private BigDecimal commissionAdjustAmount;

    /**
     * 收到佣金金额
     */
    @ApiModelProperty("收到佣金金额")
    private BigDecimal receiveCommissionAmount;

    /**
     * 操作人名称
     */
    @ApiModelProperty("操作人名称")
    private String operateName;
    /**
     * 备注
     */
    @ApiModelProperty("操作备注")
    private String remark;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

}