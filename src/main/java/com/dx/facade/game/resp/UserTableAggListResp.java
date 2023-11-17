package com.dx.facade.game.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 玩家游戏个人信息
 * </p>
 *
 * @author broadway
 * @since 2023-08-03
 */
@Data
public class UserTableAggListResp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 牌桌Id
     */
    private Long tableId;

    /**
     * 牌桌code
     */
    private String tableCode;

    /**
     * 手牌数
     */
    private Integer handCounts;

    /**
     * 商户Id
     */
    private Long merchantId;

    /**
     * 父级代理ID
     */
    private Long parentProxyId;

    /**
     * 上级代理账号
     */
    private String parentProxyName;

    /**
     * 会员Id
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
     * 用户头像
     */
    private String userHeadUrl;

    /**
     * 牌桌名称
     */
    private String tableName;

    /**
     * 牌桌类型 2001:德州局 2002:短牌局
     */
    private Long tableType;

    /**
     * 关联俱乐部id
     */
    private Long clubId;

    /**
     * 俱乐部名称
     */
    private String clubName;

    /**
     * 主动入池次数
     */
    private Long activeBringPoolNumber;

    /**
     * Walks手牌数
     */
    private Long walksHandNumber;

    /**
     * 总手数
     */
    private Long handNumberTotal;

    /**
     * 玩家总带出
     */
    private BigDecimal bringOutChipScore;

    /**
     * 总带入次数
     */
    private Integer bringInCount;

    /**
     * 玩家总带入
     */
    private BigDecimal bringInChipScore;

    /**
     * 总投注金额
     */
    private BigDecimal betAmount;

    /**
     * 玩家输赢
     */
    private BigDecimal netAmount;

    /**
     * 保险盈亏
     */
    private BigDecimal insuredNetAmount;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 修改人
     */
    private String updatedBy;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;

    /**
     * 是否删除（0 未删除 1已删除）
     */
    private Integer deleteFlag;

    /**
     * 总代名称
     */
    private String topProxyName;

    /**
     * 总代ID
     */
    private Long topProxyId;
}
