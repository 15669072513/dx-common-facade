package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 牌局信息表
 */
@Data
public class GameReviewResp implements Serializable  {
    /**
     *  手牌id
     */
    @ApiModelProperty("手牌id")
    private Long handId;
    /**
     *  会员id
     */
    @ApiModelProperty("会员id")
    private Long userId;
    /**
     *  手牌编码
     */
    @ApiModelProperty("手牌编码")
    private String handCode;
    /**
     * 手牌结束时间
     */
    @ApiModelProperty("手牌结束时间")
    private Long handEndDate;
    /**
     * 游戏名称
     */
    @ApiModelProperty("游戏名称")
    private String gameName;
    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String userHearUrl;
    /**
     * 玩家昵称
     */
    @ApiModelProperty("玩家昵称")
    private String nickName;
    /**
     * 手牌信息
     */
    @ApiModelProperty("手牌信息")
    private String handInfo;
    /**
     * 公共牌信息
     */
    @ApiModelProperty("公共牌信息")
    private String globalPokerCode;
    /**
     * 开牌结果（#PokerResultInfoEnum）
     */
    @ApiModelProperty("开牌结果")
    private String resultInfo;
    /**
     * 投注状态（GameBetStatusEnum)
     */
    @ApiModelProperty("投注状态")
    private String betStatus;
    /**
     * 盈亏筹码
     */
    @ApiModelProperty("盈亏筹码")
    private BigDecimal netAmount;
    /***
     * 小盲注
     */
    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    /***
     * 大盲注
     */
    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    /**
     * 座位类型 (GameSeatTypeEnum)
     */
    @ApiModelProperty("座位类型 0 普通 1庄 2 大盲 3小盲")
    private Integer seatType;

}
