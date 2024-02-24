package com.dx.facade.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author Rock
 * 代理后台-牌桌管理-手牌列表返回
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DxHandInfoResp implements Serializable {

    @ApiModelProperty("手牌id")
    private String handId;

    @ApiModelProperty("手牌号")
    private String handCode;

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("手牌开始时间")
    private String handStartDateStr;

    @ApiModelProperty("手牌结束时间")
    private String handEndDateStr;

    @ApiModelProperty("牌局开始时间")
    private Long handBeginDate;

    @ApiModelProperty("牌局结束时间")
    private Long handEndDate;

    @ApiModelProperty("庄家位置(荷官位)")
    private Integer button;

    @ApiModelProperty("小盲位置")
    private Integer sbChairId;

    @ApiModelProperty("大盲位置")
    private Integer bbChairId;

    @ApiModelProperty("手牌服务费")
    private BigDecimal pumpAmount;

    @ApiModelProperty("桌牌")
    private String globalPokerCode;

    @ApiModelProperty("有效底池")
    private BigDecimal effectivePool=BigDecimal.ZERO;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("手牌（牌桌第多少手）")
    private Integer roundNo=0;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("经典保险盈亏")
    private BigDecimal insuredNetAmount=BigDecimal.ZERO;

    @ApiModelProperty("手牌盈亏（手牌服务费+保险盈亏）")
    private BigDecimal handNetAmount=BigDecimal.ZERO;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("前注功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer anteSwitch = 0;

    @ApiModelProperty("前注")
    private BigDecimal anteScore = BigDecimal.ZERO;
}
