package com.dx.facade.es.resp;

import lombok.Data;

import java.math.BigDecimal;

/**
 *  游戏注单输出
 *
 * @author heart
 * @date 2023/06/03 14:26
 */
@Data
public class GameOrderRecordResp {
    /**
     * id
     */
    private Long id;
    /**
     * 牌局id
     */
    private Long roundId;
    /**
     * 牌局名称
     */
    private String roundName;
    /**
     * 牌局类型 0 德州 1短牌
     */
    private String roundType;
    /**
     * 牌桌id
     */
    private String tableId;
    /**
     * 牌桌名称
     */
    private String tableName;
    /**
     * 游戏名称
     */
    private String gameTypeName;
    /**
     * 俱乐部id
     */
    private String clubId;
    /**
     * 俱乐部名称
     */
    private String clubName;
    /**
     * 玩家id
     */
    private String userId;
    /**
     * 会员账号
     */
    private String userName;
    /**
     * 会员昵称
     */
    private String nickName;
    /**
     * 订单流水号
     */
    private String orderNo;
    /**
     * 牌局开始时间
     */
    private Long roundBeginDate;
    /**
     * 牌局结束时间
     */
    private Long roundEndDate;
    /**
     * 局次（牌桌第多少局）
     */
    private String roundNo;
    /**
     * 公共牌
     */
    private String globalPokerCode;
    /**
     * 期初金额
     */
    private BigDecimal beforeAmount;
    /**
     * 中途带入金额
     */
    private BigDecimal bringMidwayAmount;
    /**
     * 期末金额
     */
    private BigDecimal afterAmount;
    /**
     * 有效低池
     */
    private BigDecimal effectivePool;
    /**
     * 抽水金额
     */
    private BigDecimal pumpingAmount;
    /**
     *  盈亏金额
     */
    private BigDecimal netAmount;
    /**
     * 流水金额（投注金额）
     */
    private BigDecimal betAmount;
    /**
     * 座位号
     */
    private Integer seatNum;
    /**
     * 玩家位置类型 0普通 1 庄家 2 大盲，3小盲
     */
    private Integer seatType;
    /**
     * 上级代理id
     */
    private Long proxyId;
    /**
     * 上级代理账号
     */
    private String proxyName;
    /**
     * 上级代理路径(1@6@10@20)
     */
    private String proxyPath;
    /**
     * 总代id
     */
    private Long topProxyId;
    /**
     * 总代账号
     */
    private Long topProxyName;
    /**
     * 状态 (0有效 1失效)
     */
    private Integer status;
}
