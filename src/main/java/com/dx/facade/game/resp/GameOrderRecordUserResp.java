package com.dx.facade.game.resp;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class GameOrderRecordUserResp {
    /**
     * 玩家id
     */
    private Long userId;
    /**
     * 手牌id
     */
    private Long handId;
    /**
     * 游戏时间
     */
    private Date gameDate;
    /**
     * 游戏名称
     */
    private String gameName;
    /**
     * 游戏类型
     */
    private Integer gameType;
    /**
     * 耗时
     */
    private Integer ms;
    /**
     * 盈亏筹码
     */
    private BigDecimal netChip;
}
