package com.dx.facade.game.resp;

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
    private Long handId;
    /**
     *  会员id
     */
    private Long userId;
    /**
     *  手牌编码
     */
    private String handCode;
    /**
     * 手牌结束时间
     */
    private Long handEndDate;
    /**
     * 游戏名称
     */
    private String gameName;
    /**
     * 头像
     */
    private String userHearUrl;
    /**
     * 玩家昵称
     */
    private String nickName;
    /**
     * 手牌信息
     */
    private String handInfo;
    /**
     * 公共牌信息
     */
    private String globalPokerCode;
    /**
     * 开牌结果（#PokerResultInfoEnum）
     */
    private String resultInfo;
    /**
     * 投注状态（GameBetStatusEnum)
     */
    private String betStatus;
    /**
     * 盈亏筹码
     */
    private BigDecimal netAmount;
    /***
     * 小盲注
     */
    private BigDecimal sbBlindScore;

    /***
     * 大盲注
     */
    private BigDecimal bbBlindScore;

    /**
     * 座位类型 (GameSeatTypeEnum)
     */
    private Integer seatType;

}
