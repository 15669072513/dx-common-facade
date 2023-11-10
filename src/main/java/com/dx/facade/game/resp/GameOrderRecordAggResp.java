package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderRecordAggResp {

    @ApiModelProperty(value = "统计时间")
    private String recordDate;

    @ApiModelProperty(value = "项目 0抽水 1保险 2全部合计")
    private Integer itemType;

    @ApiModelProperty(value = "投注人数")
    private Long betNumber;

    @ApiModelProperty(value = "注单量")
    private Long placeOrderQuantity;

    @ApiModelProperty(value = "投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "有效投注额")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("最大ID")
    private Long maxId;
}
