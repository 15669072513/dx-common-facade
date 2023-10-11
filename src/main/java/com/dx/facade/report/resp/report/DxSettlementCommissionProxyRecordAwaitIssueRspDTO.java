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
 * @description 代理返佣发放列表查询
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = " 代理返佣发放列表查询", description = "代理返佣发放列表查询")
public class DxSettlementCommissionProxyRecordAwaitIssueRspDTO implements Serializable {

    private static final long serialVersionUID = 1L;


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
     * 币种
     */
    @ApiModelProperty("币种")
    private String currency;

    /**
     * 团队返佣金额
     */
    @ApiModelProperty("团队返佣金额")
    private BigDecimal commissionAmount;

    /**
     * 团队支付金额
     */
    @ApiModelProperty("团队支付金额")
    private BigDecimal commissionPayAmount;

    /**
     * 审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过
     */
    @ApiModelProperty("审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过")
    private int orderStatus;

    /**
     * 返佣状态 (1=待发放 2-已发放 3-无返佣 4-已取消)
     */
    @ApiModelProperty("返佣状态(1=待发放 2-已发放 3-无返佣 4-已取消)")
    private int rebateStatus;






}