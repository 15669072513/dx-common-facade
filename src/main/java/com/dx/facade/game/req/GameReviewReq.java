package com.dx.facade.game.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import lombok.Data;

@Data
public class GameReviewReq extends LocalDatePageRequest {
    /**
     * 牌桌id
     */
    private Long tableId;
    /**
     * 轮次 （0 上一轮 1 上上轮 ）
     */
    private Integer num;
}
