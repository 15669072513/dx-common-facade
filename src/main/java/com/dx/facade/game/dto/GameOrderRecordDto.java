package com.dx.facade.game.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 游戏注单记录DTO
 * @author heart
 */
@Data
public class GameOrderRecordDto implements Serializable {
    private Long id;
    /**
     * 手牌id
     */
    private Long roundId;
    /**
     * 手牌名称
     */
    private String roundName;
    /**
     * 牌局类型 0 德州 1短牌
     */
    private Integer roundType;
    /**
     * 牌桌id
     */
    private Long tableId;
    /**
     * 牌桌名称
     */
    private String tableName;
    /**
     * 游戏名称
     */
    private String gameName;
    /**
     * 俱乐部id
     */
    private Long clubId;
    /**
     * 俱乐部名称
     */
    private String clubName;
    /**
     * 玩家id
     */
    private Long userId;
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
    private Date roundBeginDate;
    /**
     * 牌局结束时间
     */
    private Date roundEndDate;
    /**
     * 局次（牌桌第多少局）
     */
    private Integer roundNo;
    /**
     * 公共牌
     */
    private String globalPokerCode;
    /**
     * 开始筹码
     */
    private BigDecimal beforeChip;
    /**
     * 中途带入筹码
     */
    private BigDecimal bringMidwayChip;
    /**
     * 结束筹码
     */
    private BigDecimal afterChip;
    /**
     * 带入筹码次数
     */
    private Integer bringCount;
    /**
     * 有效低池
     */
    private BigDecimal effectivePool;
    /**
     * 有效投注（抽水金额）
     */
    private BigDecimal pumpingChip;
    /**
     * 抽水占比
     */
    private Double rakeProportion;
    /**
     *  赢的筹码
     */
    private BigDecimal winChip;
    /**
     *  盈亏的筹码
     */
    private BigDecimal netChip;
    /**
     * 投注金额
     */
    private BigDecimal betChip;
    /**
     * 座位号
     */
    private Integer seatNum;
    /**
     * 座位类型 (0普通 1 庄家 2 大盲，3小盲)
     */
    private Integer seatType;
    /**
     * 盲注
     */
    private String blinds;
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
     * 链路id
     */
    private String linkId;

}
