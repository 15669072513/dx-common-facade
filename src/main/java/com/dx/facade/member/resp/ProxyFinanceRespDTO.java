package com.dx.facade.member.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 代理表财务信息表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyFinanceRespDTO implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 代理ID
     */
    @TableField(value = "proxy_id")
    @ApiModelProperty(value="代理ID")
    private Long proxyId;

    /**
     * 商户id
     */
    @TableField(value = "merchant_id")
    @ApiModelProperty(value="商户id")
    private Long merchantId;

    /**
     * 累计团队返点金额
     */
    @TableField(value = "total_team_rebate")
    @ApiModelProperty(value="累计团队返点金额")
    private BigDecimal totalTeamRebate;

    /**
     * 累计下级返点金额
     */
    @TableField(value = "total_child_rebate")
    @ApiModelProperty(value="累计下级返点金额")
    private BigDecimal totalChildRebate;

    /**
     * 累计个人应收返点金额
     */
    @TableField(value = "total_receivable_rebate")
    @ApiModelProperty(value="累计个人应收返点金额")
    private BigDecimal totalReceivableRebate;

    /**
     * 累计个人已收返点金额
     */
    @TableField(value = "total_receive_rebate")
    @ApiModelProperty(value="累计个人已收返点金额")
    private BigDecimal totalReceiveRebate;

    /**
     * 累计返点期数
     */
    @TableField(value = "total_rebate_times")
    @ApiModelProperty(value="累计返点期数")
    private BigDecimal totalRebateTimes;

    /**
     * 累计佣金期数
     */
    @TableField(value = "total_brokerage_times")
    @ApiModelProperty(value="累计佣金期数")
    private BigDecimal totalBrokerageTimes;

    /**
     * 累计应得个人佣金
     */
    @TableField(value = "total_person_brokerage")
    @ApiModelProperty(value="累计应得个人佣金")
    private BigDecimal totalPersonBrokerage;

    /**
     * 累计应收佣金
     */
    @TableField(value = "total_receivable_brokerage")
    @ApiModelProperty(value="累计应收佣金")
    private BigDecimal totalReceivableBrokerage;

    /**
     * 累计应付佣金
     */
    @TableField(value = "total_payable_brokerage")
    @ApiModelProperty(value="累计应付佣金")
    private BigDecimal totalPayableBrokerage;

    /**
     * 实际已收个人佣金
     */
    @TableField(value = "total_receive_brokerage")
    @ApiModelProperty(value="实际已收个人佣金")
    private BigDecimal totalReceiveBrokerage;

    /**
     * 实际已付个人佣金
     */
    @TableField(value = "total_pay_brokerage")
    @ApiModelProperty(value="实际已付个人佣金")
    private BigDecimal totalPayBrokerage;

    /**
     * 实际已得个人佣金
     */
    @TableField(value = "total_receive_person_brokerage")
    @ApiModelProperty(value="实际已得个人佣金")
    private BigDecimal totalReceivePersonBrokerage;

    /**
     * 累计存款金额
     */
    @TableField(value = "total_deposit_amount")
    @ApiModelProperty(value="累计存款金额")
    private BigDecimal totalDepositAmount;

    /**
     * 累计存款次数
     */
    @TableField(value = "total_deposit_num")
    @ApiModelProperty(value="累计存款次数")
    private Integer totalDepositNum;

    /**
     * 累计佣金钱包存款金额
     */
    @TableField(value = "total_brokewlt_deposit_amount")
    @ApiModelProperty(value="累计佣金钱包存款金额")
    private BigDecimal totalBrokewltDepositAmount;

    /**
     * 累计佣金钱包存款次数
     */
    @TableField(value = "total_brokewlt_deposit_num")
    @ApiModelProperty(value="累计佣金钱包存款次数")
    private Integer totalBrokewltDepositNum;

    /**
     * 累计额度钱包存款金额
     */
    @TableField(value = "total_quotawlt_deposit_amount")
    @ApiModelProperty(value="累计额度钱包存款金额")
    private BigDecimal totalQuotawltDepositAmount;

    /**
     * 累计额度钱包存款次数
     */
    @TableField(value = "total_quotawlt_deposit_num")
    @ApiModelProperty(value="累计额度钱包存款次数")
    private Integer totalQuotawltDepositNum;

    /**
     * 累计提款金额
     */
    @TableField(value = "total_withdraw_amount")
    @ApiModelProperty(value="累计提款金额")
    private BigDecimal totalWithdrawAmount;

    /**
     * 累计提款次数
     */
    @TableField(value = "total_withdraw_num")
    @ApiModelProperty(value="累计提款次数")
    private Integer totalWithdrawNum;

    /**
     * 累计大额提款次数
     */
    @TableField(value = "total_big_withdraw_num")
    @ApiModelProperty(value="累计大额提款次数")
    private Integer totalBigWithdrawNum;

    /**
     * 累计代存金额
     */
    @TableField(value = "total_behalf_amount")
    @ApiModelProperty(value="累计代存金额")
    private BigDecimal totalBehalfAmount;

    /**
     * 累计代存次数
     */
    @TableField(value = "total_behalf_num")
    @ApiModelProperty(value="累计代存次数")
    private Integer totalBehalfNum;

    /**
     * 累计佣金钱包代存金额
     */
    @TableField(value = "total_brokewlt_behalf_amount")
    @ApiModelProperty(value="累计佣金钱包代存金额")
    private BigDecimal totalBrokewltBehalfAmount;

    /**
     * 累计佣金钱包代存次数
     */
    @TableField(value = "total_brokewlt_behalf_num")
    @ApiModelProperty(value="累计佣金钱包代存次数")
    private Integer totalBrokewltBehalfNum;

    /**
     * 累计额度钱包代存金额
     */
    @TableField(value = "total_quotawlt_behalf_amount")
    @ApiModelProperty(value="累计额度钱包代存金额")
    private BigDecimal totalQuotawltBehalfAmount;

    /**
     * 累计额度钱包代存次数
     */
    @TableField(value = "total_quotawlt_behalf_num")
    @ApiModelProperty(value="累计额度钱包代存次数")
    private Integer totalQuotawltBehalfNum;

    /**
     * 累计转账金额
     */
    @TableField(value = "total_transfer_amount")
    @ApiModelProperty(value="累计转账金额")
    private BigDecimal totalTransferAmount;

    /**
     * 累计转账次数
     */
    @TableField(value = "total_transfer_num")
    @ApiModelProperty(value="累计转账次数")
    private Integer totalTransferNum;

    /**
     * 累计佣金钱包转账金额
     */
    @TableField(value = "total_brokewlt_transfer_amount")
    @ApiModelProperty(value="累计佣金钱包转账金额")
    private BigDecimal totalBrokewltTransferAmount;

    /**
     * 累计佣金钱包转账次数
     */
    @TableField(value = "total_brokewlt_transfer_num")
    @ApiModelProperty(value="累计佣金钱包转账次数")
    private Integer totalBrokewltTransferNum;

    /**
     * 累计额度钱包转账金额
     */
    @TableField(value = "total_quotawlt_transfer_amount")
    @ApiModelProperty(value="累计额度钱包转账金额")
    private BigDecimal totalQuotawltTransferAmount;

    /**
     * 累计额度钱包转账次数
     */
    @TableField(value = "total_quotawlt_transfer_num")
    @ApiModelProperty(value="累计额度钱包转账次数")
    private Integer totalQuotawltTransferNum;

    /**
     * 上次存款时间
     */
    @TableField(value = "last_deposit_time")
    @ApiModelProperty(value="上次存款时间")
    private LocalDateTime lastDepositTime;

    /**
     * 上次存款id
     */
    @TableField(value = "last_deposit_id")
    @ApiModelProperty(value="上次存款id")
    private Long lastDepositId;

    /**
     * 上次提款时间
     */
    @TableField(value = "last_withdraw_time")
    @ApiModelProperty(value="上次提款时间")
    private LocalDateTime lastWithdrawTime;

    /**
     * 上次提款id
     */
    @TableField(value = "last_withdraw_id")
    @ApiModelProperty(value="上次提款id")
    private Long lastWithdrawId;

    /**
     * 首次存款时间
     */
    @TableField(value = "first_deposit_time")
    @ApiModelProperty(value="首次存款时间")
    private LocalDateTime firstDepositTime;

    /**
     * 首次存款金额
     */
    @TableField(value = "first_deposit_amount")
    @ApiModelProperty(value="首次存款金额")
    private BigDecimal firstDepositAmount;

    /**
     * 首次提款时间
     */
    @TableField(value = "first_withdraw_time")
    @ApiModelProperty(value="首次提款时间")
    private LocalDateTime firstWithdrawTime;
    
	@TableField(value = "biz_id")
	@ApiModelProperty(value="业务ID")
	private Long bizId;
    /**
     * 首次提款金额
     */
    @TableField(value = "first_withdraw_amount")
    @ApiModelProperty(value="首次提款金额")
    private BigDecimal firstWithdrawAmount;
	
	@ApiModelProperty(value="自存总额")
	private BigDecimal totalBrokerageTransCenterAmount;
	
	@ApiModelProperty(value="自存次数")
	private Integer totalBrokerageTransCenterNum;

    private static final long serialVersionUID = 1L;
}