package com.dx.facade.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author royal
 * APP手牌列表返回
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DxAppHandSummaryResp implements Serializable {

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("总手牌笔数")
    private Integer totalHandNumber;

    @ApiModelProperty("我参与的笔数")
    private Integer myHandNumber;

    @ApiModelProperty("小盲")
    private BigDecimal sbBlindScore = BigDecimal.ZERO;

    @ApiModelProperty("大盲")
    private BigDecimal bbBlindScore = BigDecimal.ZERO;

    @ApiModelProperty("'前注功能 0-关闭 1-开启 2-关闭隐藏'")
    private Integer anteSwitch;

    @ApiModelProperty("前注金额")
    private BigDecimal anteScore = BigDecimal.ZERO;

    @ApiModelProperty("手牌维度总盈亏")
    private BigDecimal totalNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("打牌服务费")
    private BigDecimal totalPumpingAmount = BigDecimal.ZERO;

    @ApiModelProperty("保险池")
    private BigDecimal totalInsuredNetAmount = BigDecimal.ZERO;

}
