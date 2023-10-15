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
 * @description 代理返佣结算 ->总代
 * @date 2023-09-26
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = " 代理返佣结算 ->总代", description = "代理返佣结算汇总")
public class DxSettlementCommissionTopProxyRecordRspDTO implements Serializable {

    private static final long serialVersionUID = 1L;

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

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus = 0;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus = 0;

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
     * 团队返佣金额
     */
    @ApiModelProperty("团队返佣金额    ->   已发放返佣=commissionAmount-commissionPayAmount")
    private BigDecimal commissionAmount;

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
     * 投注盈亏
     */
    @ApiModelProperty("投注盈亏")
    private BigDecimal rushAmount;
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








}