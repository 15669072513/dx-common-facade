package com.dx.facade.game.resp;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DxHandInfoSumResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    private String handId;

    @ApiModelProperty("牌局code，按业务规则生成")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("牌桌类型")
    private String gameType;

    @ApiModelProperty("俱乐部主键")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;


    @ApiModelProperty("游戏ID")
    private Long gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("牌局开始时间")
    private LocalDateTime handBeginTime;

    @ApiModelProperty("牌局结束时间")
    private LocalDateTime handEndTime;

    @ApiModelProperty("'参与用户ID集合'")
    private String userIds;

    @ApiModelProperty("参与用户名称集合")
    private String userNames;

    @ApiModelProperty("参与用户昵称集合")
    private String nickNames;

    @ApiModelProperty("结算信息盈亏集合")
    private String settleInfo;

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("初期金额")
    private BigDecimal beginMount;

    @ApiModelProperty("中途带入金额")
    private BigDecimal bringMidwayAmount;

    @ApiModelProperty("期末金额")
    private BigDecimal endAmount;

    @ApiModelProperty("公牌信息")
    private String publicCards;

    @ApiModelProperty("参与用户手牌集合")
    private String handCards;

    @ApiModelProperty("有效底池")
    private String validPot;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("抽水金额")
    private BigDecimal pumpingAmount;

    @ApiModelProperty("会员输赢汇总")
    private BigDecimal netAmount;

    @ApiModelProperty("盈利筹码")
    private BigDecimal winAmount;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("带入次数")
    private Long bringCount;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    @ApiModelProperty("庄家位置")
    private Integer button;

    @ApiModelProperty("小盲位置")
    private Integer sbChairId;

    @ApiModelProperty("大盲位置")
    private Integer bbChairId;

    @ApiModelProperty("保险盈亏")
    private BigDecimal insuredNetAmount;
}
