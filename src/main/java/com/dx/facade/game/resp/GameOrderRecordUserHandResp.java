package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameOrderRecordUserHandResp {
    /**
     * 玩家id
     */
    @ApiModelProperty("玩家id")
    private Long userId;

    /**
     * 手牌id
     */
    @ApiModelProperty("手牌id")
    private String handId;
    /**
     * 牌局结束时间
     */
    @ApiModelProperty("牌局结束时间")
    private Long handEndDate;
    /**
     * 牌局开始时间
     */
    @ApiModelProperty("牌局开始时间")
    private Long handBeginDate;
    /**
     * 游戏名称
     */
    @ApiModelProperty("游戏名称")
    private String gameName;
    /**
     * 牌桌code
     */
    @ApiModelProperty("牌桌code")
    private String tableCode;

    /**
     * 牌桌名称
     */
    @ApiModelProperty("牌桌名称")
    private String tableName;
    /**
     * 游戏类型
     */
    @ApiModelProperty("游戏类型")
    private Long gameType;
    /**
     * 主键id
     */
    @ApiModelProperty("id")
    private Long id;
    /**
     * 会员账号
     */
    @ApiModelProperty("会员账号")
    private String playerName;
    /**
     * 会员账号
     */
    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("上级代理id")
    private String parentProxyId;


    @ApiModelProperty("上级代理账号")
    private String parentProxyName;
    /**
     * 会员昵称
     */
    @ApiModelProperty("会员昵称")
    private String nickName;
    /**
     * 俱乐部id
     */
    @ApiModelProperty("俱乐部id")
    private Long clubId;
    /**
     * 俱乐部名称
     */
    @ApiModelProperty("俱乐部名称")
    private String clubName;
    /**
     * 局次（牌桌第多少局）
     */
    @ApiModelProperty("局次")
    private Integer roundNo;
    /**
     * 公共牌
     */
    @ApiModelProperty("公共牌")
    private String globalPokerCode;
    /**
     * 手牌信息
     */
    @ApiModelProperty("手牌信息")
    private String handInfo;
    /**
     * 开始筹码
     */
    @ApiModelProperty("开始筹码")
    private BigDecimal beforeChip=BigDecimal.ZERO;
    /**
     * 中途带入筹码
     */
    @ApiModelProperty("中途带入筹码")
    private BigDecimal bringMidwayChip=BigDecimal.ZERO;
    /**
     * 首次带入
     */
    @ApiModelProperty("首次带入")
    private BigDecimal firstBringChip=BigDecimal.ZERO;

    /**
     * 结束筹码
     */
    @ApiModelProperty("结束筹码")
    private BigDecimal afterChip=BigDecimal.ZERO;
    /**
     * 有效低池
     */
    @ApiModelProperty("有效低池")
    private BigDecimal effectivePool=BigDecimal.ZERO;
    /**
     * 有效投注
     */
    @ApiModelProperty("俱乐部游戏有效投注")
    private BigDecimal validBetAmount=BigDecimal.ZERO;
    /**
     * 抽水占比
     */
    @ApiModelProperty("抽水占比")
    private BigDecimal rakeProportion=BigDecimal.ZERO;
    /**
     *  赢的筹码
     */
    @ApiModelProperty("赢的筹码")
    private BigDecimal winAmount=BigDecimal.ZERO;
    /**
     *  会员输赢
     */
    @ApiModelProperty("会员输赢")
    private BigDecimal netAmount=BigDecimal.ZERO;
    /**
     * 投注金额
     */
    @ApiModelProperty("俱乐部游戏投注金额")
    private BigDecimal betAmount=BigDecimal.ZERO;
    /**
     * 座位号
     */
    @ApiModelProperty("座位号")
    private Integer seatNum;

    @ApiModelProperty("保险投注金额")
    private BigDecimal insuranceBetAmount;

    @ApiModelProperty("保险有效投注")
    private BigDecimal insuranceValidBetAmount;

    @ApiModelProperty("抽水贡献")
    private BigDecimal pumpContribution;
}
