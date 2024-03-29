package com.dx.facade.report.resp.report;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description 返佣统计列表DTO
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "返佣统计列表DTO", description = "返佣统计列表DTO")
public class DxSettlementCommissionProxyRecordRspV2DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    private Long proxyId;

    /**
     * 代理层级
     */
    @ApiModelProperty("代理层级")
    private Long proxyLevel;
    /**
     * 代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;
    /**
     * 上级代理名称
     */
    @ApiModelProperty("上级代理名称")
    private String parentProxyName;


    @ApiModelProperty("返佣状态(0-未结算 1=已结算（数据不会在进行统计变动） 2-待发放  3-已发放 ,4，已过期(返佣废弃当前状态)，5：无返佣 6-已取消)")
    private Integer payoutStatus;
    @ApiModelProperty("返佣状态")
    private String payoutStatusStr;

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
    @ApiModelProperty("抽水贡献/游戏盈亏")
    private BigDecimal platformNetAmount;
    /**
     * 场馆费
     */
    @ApiModelProperty("场馆费")
    private BigDecimal venueAmount;
    /**
     * 会员返水
     */
    @ApiModelProperty("会员返水")
    private BigDecimal memberRebateAmount;

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