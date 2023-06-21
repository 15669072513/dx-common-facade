package com.dx.facade.game.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author Smith
 * @Version 1.0.0
 * @Date 2021/2/1 20:59
 */
@Data
public class TyGameRecordDetail {

    /**
     * 投注项Id
     */
    private String playOptionsId;

    /**
     * 注单ID
     */
    private String betNo;

    /**
     * 赛事ID
     */
    private String matchId;

    /**
     * 投注额
     */
    private BigDecimal betAmount;

    /**
     * 盘口值(数字类型,包含让球和全场进球数)
     */
    private BigDecimal handiCap;
    /**
     * 联赛名称
     */
    private String matchName;

    /**
     * 比赛对阵
     */
    private String matchInfo;

    /**
     * 投注类型1 ：早盘赛事 ，2： 滚球盘赛事，3： 冠军盘赛事
     */
    private Integer matchType;

    /**
     * 赛种ID
     */
    private String sportId;

    /**
     * 游戏名称
     */
    private String sportName;

    /**
     * 联赛ID
     */
    private String tournamentId;

    /**
     * 投注项名称
     */
    private String playOptionName;

    /**
     * 玩法名称
     */
    private String playName;

    /**
     * 盘口值
     */
    private String marketValue;

    /**
     * 盘口类型
     */
    private String marketType;

    /**
     * 赔率
     */
    private String oddsValue;

    /**
     * 订单结算结果0-无结果 2-走水 3-输 4-赢 5-赢一半 6-输一半
     */
    private Integer betResult;

    /**
     * 比赛开始时间
     */
    private Long beginTime;
    
    /**
     * 基准分
     */
    private String scoreBenchmark;
    
    
    /**
     * 赛果
     */
    private String settleScore;
}
