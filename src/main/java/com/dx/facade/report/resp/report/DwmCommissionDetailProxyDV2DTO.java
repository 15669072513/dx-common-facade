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
 * @description 返佣统计明细dto
 * @date 2023-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "返佣统计明细dto", description = "返佣统计明细dto")
public class DwmCommissionDetailProxyDV2DTO implements Serializable {

    private static final long serialVersionUID = 1L;


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
     * 结算类型名称
     */
    @ApiModelProperty("结算类型名称")
    private String settlementName;

    /**
    * 团队返佣
    */
    @ApiModelProperty("团队返佣")
    private BigDecimal commissionAmount;
    /**
     * 会员游戏盈亏(平台)
     */
    @ApiModelProperty("会员游戏盈亏(平台)")
    private BigDecimal platformNetAmount;

    /**
     * 场馆费用
     */
    @ApiModelProperty("场馆费用")
    private BigDecimal venueAmount;
    /**
     * 直属会员返水金额
     */
    @ApiModelProperty("直属会员返水金额")
    private BigDecimal memberRebateAmount;

    /**
     * 直属会员返水调整金额
     */
    @ApiModelProperty("直属会员返水调整金额")
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
     * 冲正净输赢
     */
    @ApiModelProperty("冲正净输赢")
    private BigDecimal rushAmount;


}