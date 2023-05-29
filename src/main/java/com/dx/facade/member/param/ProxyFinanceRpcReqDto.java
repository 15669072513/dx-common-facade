package com.dx.facade.member.param;

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
 * @author agan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyFinanceRpcReqDto implements Serializable {
    
    @ApiModelProperty(value="代理ID")
    private Long proxyId;

    @ApiModelProperty(value="1-ob,2-美播")
    private Integer appId;
    
    @ApiModelProperty(value="商户id")
    private Long merchantId;
    
    @ApiModelProperty(value="累计团队返点金额")
    private BigDecimal totalTeamRebate;
    
    @ApiModelProperty(value="累计下级返点金额")
    private BigDecimal totalChildRebate;

    @ApiModelProperty(value="累计个人应收返点金额")
    private BigDecimal totalReceivableRebate;
    
    @ApiModelProperty(value="累计个人已收返点金额")
    private BigDecimal totalReceiveRebate;
    
    @ApiModelProperty(value="累计返点期数")
    private BigDecimal totalRebateTimes;
    
    @ApiModelProperty(value="累计佣金期数")
    private BigDecimal totalBrokerageTimes;
    
    @ApiModelProperty(value="累计应得个人佣金")
    private BigDecimal totalPersonBrokerage;
    
    @ApiModelProperty(value="累计应收佣金")
    private BigDecimal totalReceivableBrokerage;
    
    @ApiModelProperty(value="累计应付佣金")
    private BigDecimal totalPayableBrokerage;
    
    @ApiModelProperty(value="实际已收个人佣金")
    private BigDecimal totalReceiveBrokerage;
    
    @ApiModelProperty(value="实际已付个人佣金")
    private BigDecimal totalPayBrokerage;
    
    @ApiModelProperty(value="实际已得个人佣金")
    private BigDecimal totalReceivePersonBrokerage;
    
    @ApiModelProperty(value="累计存款金额")
    private BigDecimal totalDepositAmount;
    
    @ApiModelProperty(value="累计存款次数")
    private Integer totalDepositNum;
    
    @ApiModelProperty(value="累计佣金钱包存款金额")
    private BigDecimal totalBrokewltDepositAmount;
    
    @ApiModelProperty(value="累计佣金钱包存款次数")
    private Integer totalBrokewltDepositNum;
    
    @ApiModelProperty(value="累计额度钱包存款金额")
    private BigDecimal totalQuotawltDepositAmount;
    
    @ApiModelProperty(value="累计额度钱包存款次数")
    private Integer totalQuotawltDepositNum;

    @ApiModelProperty(value="累计提款金额")
    private BigDecimal totalWithdrawAmount;
    
    @ApiModelProperty(value="累计提款次数")
    private Integer totalWithdrawNum;
    
    @ApiModelProperty(value="累计大额提款次数")
    private Integer totalBigWithdrawNum;
    
    @ApiModelProperty(value="累计代存金额")
    private BigDecimal totalBehalfAmount;
    
    @ApiModelProperty(value="累计代存次数")
    private Integer totalBehalfNum;
    
    @ApiModelProperty(value="累计佣金钱包代存金额")
    private BigDecimal totalBrokewltBehalfAmount;

    @ApiModelProperty(value="累计佣金钱包代存次数")
    private Integer totalBrokewltBehalfNum;
    
    @ApiModelProperty(value="累计额度钱包代存金额")
    private BigDecimal totalQuotawltBehalfAmount;

    @ApiModelProperty(value="累计额度钱包代存次数")
    private Integer totalQuotawltBehalfNum;
    
    @ApiModelProperty(value="累计转账金额")
    private BigDecimal totalTransferAmount;
    
    @ApiModelProperty(value="累计转账次数")
    private Integer totalTransferNum;
    
    @ApiModelProperty(value="累计佣金钱包转账金额")
    private BigDecimal totalBrokewltTransferAmount;
    
    @ApiModelProperty(value="累计佣金钱包转账次数")
    private Integer totalBrokewltTransferNum;
    
    @ApiModelProperty(value="累计额度钱包转账金额")
    private BigDecimal totalQuotawltTransferAmount;
    
    @ApiModelProperty(value="累计额度钱包转账次数")
    private Integer totalQuotawltTransferNum;
    
	@ApiModelProperty(value="统计代理转中心钱包总额")
	private BigDecimal totalBrokerageTransCenterAmount;
	
	@ApiModelProperty(value="统计代理转中心钱包次数")
	private Integer totalBrokerageTransCenterNum;
    
    @ApiModelProperty(value="上次存款时间")
    private LocalDateTime lastDepositTime;
    
    @ApiModelProperty(value="上次存款id")
    private Long lastDepositId;
    
    @ApiModelProperty(value="上次提款时间")
    private LocalDateTime lastWithdrawTime;

    @ApiModelProperty(value="上次提款id")
    private Long lastWithdrawId;
    
    @ApiModelProperty(value="首次存款时间")
    private LocalDateTime firstDepositTime;
    
    @ApiModelProperty(value="首次存款金额")
    private BigDecimal firstDepositAmount;
    
    @ApiModelProperty(value="首次提款时间")
    private LocalDateTime firstWithdrawTime;

    @ApiModelProperty(value="首次提款金额")
    private BigDecimal firstWithdrawAmount;

    @ApiModelProperty(value="业务ID")
    private Long bizId;

    private static final long serialVersionUID = 1L;
}