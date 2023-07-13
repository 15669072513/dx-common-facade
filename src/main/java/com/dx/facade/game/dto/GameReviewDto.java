package com.dx.facade.game.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 手牌记录
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameReviewDto implements Serializable {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 玩家id
     */
    private Long userId;
    /**
     * 牌局id
     */
    private Long handId;
    /**
     * 投注金额
     */
    private BigDecimal betChip;
    /**
     * 带入金额
     */
    private BigDecimal bringChip;
    /**
     * 发牌时间
     */
    private Date operateDate;
    /**
     * 玩家状态 (0跟注1看牌2加注3allin4弃牌）
     */
    private Integer status;
}
