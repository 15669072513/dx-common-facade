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
 * @description 返佣统计明细dto
 * @date 2023-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "返佣统计明细小计dto", description = "返佣统计明细小计dto")
public class DwmCommissionDetailProxyDTotalV2DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 币种
    */
    @ApiModelProperty("币种")
    private String currency;

    /**
    * 团队返佣
    */
    @ApiModelProperty("团队返佣")
    private BigDecimal commissionAmount = BigDecimal.ZERO;
    /**
     * 会员游戏盈亏/抽水贡献
     */
    @ApiModelProperty("会员游戏盈亏/抽水贡献")
    private BigDecimal platformNetAmount= BigDecimal.ZERO;

    /**
     * 场馆费用
     */
    @ApiModelProperty("场馆费用")
    private BigDecimal venueAmount= BigDecimal.ZERO;
    /**
     * 直属会员返水金额
     */
    @ApiModelProperty("直属会员返水金额")
    private BigDecimal memberRebateAmount= BigDecimal.ZERO;

    /**
     * 直属会员返水调整金额
     */
    @ApiModelProperty("直属会员返水调整金额")
    private BigDecimal memberRebateAdjustAmount= BigDecimal.ZERO;

    /**
     * 代理净输赢
     */
    @ApiModelProperty("代理净输赢")
    private BigDecimal proxyNetwinAmount= BigDecimal.ZERO;

    /**
    * 上月结余
    */
    @ApiModelProperty("上月结余")
    private BigDecimal commissionLastAmount= BigDecimal.ZERO;
    /**
     * 冲正净输赢
     */
    @ApiModelProperty("冲正净输赢")
    private BigDecimal rushAmount= BigDecimal.ZERO;


}