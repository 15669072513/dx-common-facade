package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 盈亏表结果对象
 */
@Data
public class ProfitAndLossStatementResp  implements Serializable {
    @ApiModelProperty("德信注单id")
    private String id;

    @ApiModelProperty("投注人数")
    private Long betNumber;

    @ApiModelProperty("注单量")
    private Long placeOrderQuantity;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("盈亏")
    private BigDecimal profitAndLoss;
}
