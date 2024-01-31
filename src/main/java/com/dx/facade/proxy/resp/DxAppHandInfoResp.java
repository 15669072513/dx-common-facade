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
public class DxAppHandInfoResp implements Serializable {

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

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("前注功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer anteSwitch = 0;

    @ApiModelProperty("前注")
    private BigDecimal anteScore = BigDecimal.ZERO;

    @ApiModelProperty("抽水金额(服务费)")
    private BigDecimal pumpingAmount = BigDecimal.ZERO;

    @ApiModelProperty("总底池")
    private BigDecimal totalPotAmount = BigDecimal.ZERO;

    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount = BigDecimal.ZERO;

    @ApiModelProperty("保险盈亏")
    private BigDecimal insuredNetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "总盈亏")
    private BigDecimal totalNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("显示手牌信息。当前登录会员的手牌，如未参与，则显示虚线牌")
    private String handInfo;

    @ApiModelProperty("赢家")
    private String winUserName;

    @ApiModelProperty("牌型")
    private String resultInfo;

    @ApiModelProperty("赢家手牌")
    private String winHandInfo;

    @ApiModelProperty("公牌")
    private String publicCards;

    @ApiModelProperty("赢家手牌")
    private BigDecimal winTotalNetAmount = BigDecimal.ZERO;
}
