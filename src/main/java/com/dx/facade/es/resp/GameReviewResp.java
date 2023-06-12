package com.dx.facade.es.resp;

import lombok.Data;

/**
 *  牌局回顾输出
 *
 * @author heart
 * @date 2023/06/03 14:26
 */
@Data
public class GameReviewResp {
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
    private String operateDate;
    /**
     * 玩家状态 (0跟注1看牌2加注3allin4弃牌）
     */
    private String status;
}
