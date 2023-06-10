package com.dx.facade.game.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 牌局信息表
 */
@Data
public class GameOrderUserTableSumResp implements Serializable {
    /**
     * 用户id
     */
    private Long userId;
    /**
     *  牌桌id
     */
    private Long tableId;
    /**
     * 牌桌创建时间
     */
    private Long tableCreateDate;
    /**
     * 时长
     */
    private Long ms;
    /**
     * 牌桌名称
     */
    private String tableName;
    /**
     * 头像
     */
    private String userHearUrl;
    /**
     * 玩家昵称
     */
    private String nickName;
    /**
     * 盈亏筹码
     */
    private BigDecimal netChip;
    /***
     * 小盲注
     */
    private Long sbBlindScore;

    /***
     * 大盲注
     */
    private Long bbBlindScore;

}
