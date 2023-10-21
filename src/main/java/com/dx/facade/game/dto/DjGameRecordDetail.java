package com.dx.facade.game.dto;

import lombok.Data;

/**
 * @author vito
 * @date 2020/11/09
 */
@Data
public class DjGameRecordDetail {

    /**
     * 注单ID
     */
    private Long id;

    /**
     * <pre>
     * 游戏编码
     * 2001 经典百家乐
     * 2002 极速百家乐
     * 2003 竞咪百家乐
     * 2004 包桌百家乐
     * 2005 共咪百家乐
     * 2006 龙虎
     * 2007 轮盘
     * 2008 骰宝
     * 2009 牛牛
     * 2010 炸金花
     * 2011 三公
     * 2012 21点
     * 2013 多台
     * 2014 高额贵宾百家乐
     * 2015 斗牛
     * 2016 保险百家乐
     * 2017 区块链百家乐
     * </pre>
     */
    private String gameTypeId;
    
    private String gameTypeName;

    /**
     * 联赛ID
     */
    private String tournamentId;

    /**
     * 比赛ID
     */
    private String matchId;

    /**
     * 比赛类型
     */
    private Integer matchType;

    /**
     * 盘口ID
     */
    private String marketId;

    /**
     * 盘口简称
     */
    private String marketCnName;

    /**
     * 战队名称
     */
    private String teamName;

    /**
     * 局数
     */
    private Integer round;

    /**
     * 赛事阶段 1-初盘 2-滚盘
     */
    private Integer isLive;

    /**
     * 投注项Id
     */
    private String playOptionsId;

    /**
     * 投注项名称
     */
    private String playOptionName;

    /**
     * 赔率
     */
    private String oddsValue;

    /**
     * 注单状态 1已结算 0未结算
     */
    private Integer betStatus;

    /**
     * 开始时间=当前该注单的投注时间 或该注单创建时间
     */
    private Long createAt;

    /**
     * 结束时间=当前注单被结算的时间
     */
    private Long netAt;

    /**
     * 更新时间 如果更新了盘口的状态时间
     */
    private Long updatedAt;

    /**
     * 比赛开始时间
     */
    private Long matchStartTime;

    /**
     * 结算统计
     */
    private String settleCount;

    /**
     * 战队ID
     */
    private String teamId;
    
    /**
     * 赛事简称 map 结构.key 值为 联赛ID  tournamentId
     */
    private String matchInfo;
}