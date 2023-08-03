package com.dx.facade.game.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 游戏注单记录DTO
 * @author heart
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameOrderRecordDto implements Serializable {

    private Long id;
    /**
     * 手牌id
     */
    private String handId;
    /**
     * 抽水金额
     */
    private BigDecimal validBetAmount;
    /**
     * 手牌code
     */
    private String handCode;
    /**
     * 手牌名称
     */
    private String handName;
    /**
     * 牌桌类型 2001L:德州局 2002L:短牌局
     */
    private Long handType;
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
     * 会员账号u
     */
    private String userName;
    /**
     * 会员昵称
     */
    private String nickName;
    /**
     * 会员头像
     */
    private String userHeadUrl;
    /**
     * 订单流水号
     */
    private String orderNo;
    /**
     * 牌局开始时间
     */
    private Long handBeginDate;
    /**
     * 牌局结束时间
     */
    private Long handEndDate;
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
    /***
     * 小盲注
     */
    private Long sbBlindScore;

    /***
     * 大盲注
     */
    private Long bbBlindScore;
    /**
     * 手牌信息
     */
    private String handInfo;
    /**
     * 牌结果（对子,顺子)
     */
    private String resultInfo;
    /**
     *  投注状态(最后一次）
     */
    private Integer betStatus;
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
    private String topProxyName;
    /**
     * 链路id
     */
    private String linkId;


    /**
     * 总抽水金额
     */
    private BigDecimal rakeAmountAll;

    /**
     * 总有效底池金额
     */
    private BigDecimal prosperPoolAll;

    /**
     * 批次id
     */
    private String batchId;

    /***
     * 小盲座位号
     */
    private Integer sbChairId;
    /***
     * 大盲座位号
     */
    private Integer bbChairId;
    /***
     * 庄家座位号
     */
    private Integer button;
    /**
     * 牌桌创建时间
     */
    private Long tableCreateDate;
    /**
     * 牌桌第一局开始时间
     */
    private Long tableBeginDate;
    /**
     * 牌桌结束时间
     */
    private Long tableGameOverDate;
    /**
     * 牌桌解散类型
     * 0强制解散 1房间内解散 2正常结束
     */
    private Integer tableGameOverType;
    /**
     * 最大底池
     */
    private BigDecimal maxPot;
}
