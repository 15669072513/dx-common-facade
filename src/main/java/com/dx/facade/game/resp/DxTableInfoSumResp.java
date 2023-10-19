package com.dx.facade.game.resp;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DxTableInfoSumResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("牌桌局数")
    private Integer tableHandNumber=0;

    @ApiModelProperty("累计参与者")
    private Integer participantTotal=0;

    @ApiModelProperty("玩家总带出")
    private BigDecimal bringOutChipScore=BigDecimal.ZERO;

    @ApiModelProperty("玩家总带入")
    private BigDecimal bringInChipScore=BigDecimal.ZERO;

    @ApiModelProperty("总打牌抽水")
    private BigDecimal pumpingAmountTotal=BigDecimal.ZERO;

    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("保险盈亏")
    private BigDecimal insuredNetAmount;

    @ApiModelProperty("牌桌总费用")
    private BigDecimal costTotal=BigDecimal.ZERO;
}
