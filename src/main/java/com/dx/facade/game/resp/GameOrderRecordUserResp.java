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
     * 牌局结束时间
     */
    private Date handEndDate;
    /**
     * 牌局开始时间
     */
    private Date handBeginDate;
    /**
     * 游戏名称
     */
    private String gameName;
    /**
     * 游戏类型
     */
    private Integer gameType;
    /**
     * 盈亏筹码
     */
    private BigDecimal netChip;
    /**
     * 盲注(大盲/小盲)
     */
    private String blinds;
}
