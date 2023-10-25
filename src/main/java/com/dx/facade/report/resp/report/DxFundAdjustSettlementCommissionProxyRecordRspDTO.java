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
 * @description 资金调整-非总代返佣管理列表查询
 * @date 2023-09-26
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "团队返佣数据", description = "团队返佣数据")
public class DxFundAdjustSettlementCommissionProxyRecordRspDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    /**
     * 报表日期
     */
    @ApiModelProperty("报表日期")
    private Integer reportYm;

    /**
     * 周期类型: 1-天 2-周 3-月
     */
    @ApiModelProperty("周期类型: 1-天 2-周 3-月")
    private int cycleType;

    /**
     * 周期名称 - 结算期数
     */
    @ApiModelProperty("周期名称 - 结算期数")
    private String cycleName;

    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    private Long proxyId;
    /**
     * 代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;
    /**
     * 代理类型
     */
    @ApiModelProperty("代理类型")
    private String proxyType;


    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;
    /**
     * accountType
     */
    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

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
     * 上级代理id
     */
    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    /**
     * 上级代理账号
     */
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    /**
     * 总代id
     */
    @ApiModelProperty("总代id")
    private Long topProxyId;
    /**
     * 总代账号
     */
    @ApiModelProperty("总代账号")
    private String topProxyName;
    /**
     * 代理层级
     */
    @ApiModelProperty("代理层级")
    private String proxyLevel;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currency;

    /**
     * 总代返佣中控审核，非总代默认二审通过
     * 审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过
     */
    @ApiModelProperty("审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过,代返佣中控审核，非总代默认二审通过")
    private Integer orderStatus;

    /**
     */
    @ApiModelProperty("返佣状态(0-未结算 1=待发放 2-待领取(返佣废弃当前状态) 3-已发放 4，已过期(返佣废弃当前状态)，5：无返佣 6-已取消  )")
    private Integer payoutStatus;

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

}