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
 * @description 返佣统计列表-汇总DTO
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "返佣统计列表汇总数据DTO", description = "返佣统计列表汇总数据DTO")
public class DxSettlementCommissionProxyTotalRspV2DTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    private Long proxyId;

    /**
     * 团队返佣金额
     */
    @ApiModelProperty("团队返佣金额")
    private BigDecimal commissionAmount =BigDecimal.ZERO;

    /**
     * 抽水贡献
     */
    @ApiModelProperty("抽水贡献")
    private BigDecimal platformNetAmount =BigDecimal.ZERO;
    /**
     * 场馆费
     */
    @ApiModelProperty("场馆费")
    private BigDecimal venueAmount =BigDecimal.ZERO;

    /**
     * 会员返水
     */
    @ApiModelProperty("会员返水")
    private BigDecimal memberRebateAmount =BigDecimal.ZERO;

    /**
     * 会员返水调整金额
     */
    @ApiModelProperty("会员返水调整金额")
    private BigDecimal memberRebateAdjustAmount =BigDecimal.ZERO;

    /**
     * 代理净输赢
     */
    @ApiModelProperty("代理净输赢")
    private BigDecimal proxyNetwinAmount =BigDecimal.ZERO;

    /**
     * 上月结余
     */
    @ApiModelProperty("上月结余")
    private BigDecimal commissionLastAmount =BigDecimal.ZERO;
    /**
     * 冲正后净输赢
     */
    @ApiModelProperty("冲正后净输赢")
    private BigDecimal rushAmount =BigDecimal.ZERO;


    /**
     * 返佣调整
     */
    @ApiModelProperty("返佣调整")
    private BigDecimal commissionAdjustAmount =BigDecimal.ZERO;

}