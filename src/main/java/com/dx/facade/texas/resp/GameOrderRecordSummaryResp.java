package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 游戏注单统计对象
 */
@Data
public class GameOrderRecordSummaryResp implements Serializable {
    /**
     * 投注金额
     */
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount = BigDecimal.ZERO;
    /**
     * 有效投注（抽水金额）
     */
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount = BigDecimal.ZERO;
    /**
     * 输赢金额
     */
    @ApiModelProperty("输赢金额")
    private BigDecimal netAmount = BigDecimal.ZERO;
    /**
     * 抽水贡献
     */
    @ApiModelProperty(value = "抽水贡献")
    private BigDecimal pumpContribution;

}
