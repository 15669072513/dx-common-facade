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
     * 开始时间
     */
    private Date minBeginDate;
    /**
     * 结束时间
     */
    private Date maxEndDate;

    /**
     * 牌桌名称
     */
    private String tableName;

    /**
     * 全部手数
     */
    private int handCount;
    /**
     * 全部流水
     */
    private BigDecimal betChipSum;
    /**
     *  全部带入
     */
    private BigDecimal bringChipSum;
    /**
     *  最大底池
     */
    private BigDecimal maxEffectivePool;
    /**
     *  最大底池
     */
    private BigDecimal netChipSum;
    /**
     * 盲注(大盲/小盲)
     */
    private String blinds;

}
