package com.dx.facade.venue.resp;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TableConfigRuleResp {

    /***
     * 房主id
     */
    private Long holderId;

    /***
     * 牌桌id
     */
    private Long tableId;

    /***
     * 牌桌code
     */
    private String tableCode;

    /***
     * 牌桌类型 2001L:德州局 2002L:短牌局
     */
    private Long tableType;

    /***
     * 牌桌名称
     */
    private String tableName;

    /***
     * 牌桌最大人数
     */
    private int maxSeats;

    /***
     * 自动开局人数
     */
    private int autoStartUserCounts;

    /**
     * 默认带入的筹码
     */
    private Long bringChipScore;

    /***
     * 小盲注
     */
    private Long sbBlindScore;

    /***
     * 大盲注
     */
    private Long bbBlindScore;

    /**
     * 时长 单位 分钟
     */
    private Long timeCount;

    /**
     * 最小带入的筹码
     */
    private Long minBringChipScore;

    /**
     * 最大带入的筹码
     */
    private Long maxBringChipScore;

    /**
     * 抽水比例配置
     */
    private BigDecimal rake;
}
