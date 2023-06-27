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

    @ApiModelProperty("总牌桌费用")
    private BigDecimal costSum = BigDecimal.ZERO;
}
