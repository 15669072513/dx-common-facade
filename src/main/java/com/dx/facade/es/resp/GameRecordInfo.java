package com.dx.facade.es.resp;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameRecordInfo {
    @ApiModelProperty("注单状态 0,2-未结算 1-已结算")
    private String obBetStatus;

    @ApiModelProperty("投注额")
    private BigDecimal betAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "有效投注额")
    private BigDecimal validBetAmount = BigDecimal.ZERO;

    @ApiModelProperty("输赢金额")
    private BigDecimal netAmount = BigDecimal.ZERO;

    @ApiModelProperty("带场馆code拼接的注单id(如OBTY_8923472)")
    private String id;

    @ApiModelProperty("注单id")
    private String generatedId;

    @ApiModelProperty("投注内容")
    private String betContent;

    @ApiModelProperty("投注时间")
    private Long createAt;

    @ApiModelProperty("投注时间(yyyy-MM-dd HH:mm:ss")
    private String createAtString;

    @ApiModelProperty("游戏名称")
    private String gameTypeName;

}
