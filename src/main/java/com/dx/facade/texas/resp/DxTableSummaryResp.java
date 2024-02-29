package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-05
 */
@Data
public class DxTableSummaryResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("总牌桌抽水")
    private BigDecimal pumpAmountSum = BigDecimal.ZERO;

    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("总保险盈亏")
    private BigDecimal insuredNetAmount=BigDecimal.ZERO;

    @ApiModelProperty("总牌桌费用")
    private BigDecimal costSum = BigDecimal.ZERO;

    @ApiModelProperty("总牌桌抽水百分比")
    private String pumpAmountRate;

    @ApiModelProperty("保险盈亏百分比")
    private String insuredNetAmountRate;

    @ApiModelProperty("牌桌手牌数")
    private Integer tableHandNumber = 0;

    @ApiModelProperty("玩家总带入")
    private BigDecimal bringInChipScore = BigDecimal.ZERO;

    @ApiModelProperty("玩家总带出")
    private BigDecimal bringOutChipScore = BigDecimal.ZERO;

    @ApiModelProperty("总牌桌盈亏")
    private BigDecimal costTotal = BigDecimal.ZERO;

    @ApiModelProperty("局服务费")
    private BigDecimal tableFee= BigDecimal.ZERO;
}
