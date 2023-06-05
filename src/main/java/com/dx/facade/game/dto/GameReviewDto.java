package com.dx.facade.game.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 手牌记录
 */
@Data
public class GameReviewDto implements Serializable {
    /**
     * 玩家id
     */
    private Long userId;
    /**
     * 牌局id
     */
    private Long roundId;
    /**
     * 扑克牌编码
     */
    private String pokerCode;
    /**
     * 发牌时间
     */
    private Date operateDate;
    /**
     * 玩家状态 (0跟注1看牌2加注3allin4弃牌）
     */
    private Integer status;
}
