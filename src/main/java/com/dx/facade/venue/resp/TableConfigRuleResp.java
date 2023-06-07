package com.dx.facade.venue.resp;

import lombok.Data;

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
     * 牌桌类型 1:德州局 2:短牌局
     */
    private Integer tableType;

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
     * 带入的筹码
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
     * 时长 单位 小时
     */
    private Integer timeCount;
}
