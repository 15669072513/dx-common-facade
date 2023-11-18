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
 * @description 团队返佣统计
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "团队返佣数据-1.30", description = "团队返佣数据-1.30")
public class DxSettlementCommissionProxyRecordRspV2DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("返佣状态(0-未结算 1=已结算（数据不会在进行统计变动） 2-待发放  3-已发放 ,4，已过期(返佣废弃当前状态)，5：无返佣 6-已取消)")
    private Integer payoutStatus;
    @ApiModelProperty("返佣状态")
    private Integer payoutStatusStr;

    /**
     * 周期名称 - 结算期数
     */
    @ApiModelProperty("周期名称 - 结算期数")
    private String cycleName;

    /**
     * 周期起始日期
     */
    @ApiModelProperty("周期起始日期")
    private Integer cycleStartDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty("周期结束日期")
    private Integer cycleEndDate;

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
     * 抽水贡献
     */
    @ApiModelProperty("抽水贡献")
    private BigDecimal commissionContribute;
    /**
     * 场馆费
     */
    @ApiModelProperty("场馆费")
    private BigDecimal commissionVenueFee;

    /**
     * 会员返水
     */
    @ApiModelProperty("会员返水")
    private Long memberRebateAmount;

    /**
     * 会员返水调整金额
     */
    @ApiModelProperty("会员返水调整金额")
    private BigDecimal memberRebateAdjustAmount;

    /**
     * 代理净输赢
     */
    @ApiModelProperty("代理净输赢")
    private BigDecimal proxyNetwinAmount;

    /**
     * 上月结余
     */
    @ApiModelProperty("上月结余")
    private BigDecimal commissionLastAmount;
    /**
     * 冲正后净输赢
     */
    @ApiModelProperty("冲正后净输赢")
    private BigDecimal rushAmount;


    /**
     * 返佣调整
     */
    @ApiModelProperty("返佣调整")
    private BigDecimal commissionAdjustAmount;





}