package com.dx.facade.es.req;

import lombok.Data;

/**
 * 牌局回顾请求参数
 *
 * @author heart
 * @date 2023/06/03 14:26
 */
@Data
public class GameReviewReq {
    /**
     * 牌局id
     */
    private Long roundId;

}
