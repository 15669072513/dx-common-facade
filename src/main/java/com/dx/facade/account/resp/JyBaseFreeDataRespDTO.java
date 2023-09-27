package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 基础费率数据
 */

@Data
public class JyBaseFreeDataRespDTO {

    @ApiModelProperty(value = "存款结算汇率")
    private BigDecimal depositSettlementRate;

    @ApiModelProperty(value = "提款结算汇率")
    private BigDecimal withdrawSettlementRate;

    @ApiModelProperty(value = "erc20手续费")
    private BigDecimal erc20Fee;

    @ApiModelProperty(value = "trc20手续费")
    private BigDecimal trc20Fee;

    @ApiModelProperty(value = "omni手续费")
    private BigDecimal omniFee;
}
