package com.dx.facade.game.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 牌局信息表
 */
@Data
public class GameOrderTableDetailSumResp implements Serializable {
    /**
     *  牌桌id
     */
    private Long tableId;
    /**
     * 玩家id
     */
    private Long userId;
    /**
     * 头像
     */
    private String userHearUrl;

    /**
     * 玩家昵称
     */
    private String nickName;
    /**
     * 牌桌时间
     */
    private Date tableTime;
    /**
     * 时长
     */
    private Long ms;

    /**
     * 牌桌名称
     */
    private String tableName;

    /**
     * 牌桌手数
     */
    private Long handCount;
    /**
     * 牌桌流水
     */
    private BigDecimal betAmountSum;
    /**
     *  牌桌带入
     */
    private BigDecimal bringChipSum;
    /**
     *  最大底池
     */
    private BigDecimal maxEffectivePool;
    /**
     *  盈亏筹码
     */
    private BigDecimal netAmountSum;
    /***
     * 小盲注
     */
    private BigDecimal sbBlindScore;

    /***
     * 大盲注
     */
    private BigDecimal bbBlindScore;

}
