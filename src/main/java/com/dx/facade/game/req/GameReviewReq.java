package com.dx.facade.game.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import lombok.Data;

/**
 * 有效回顾请求参数
 */
@Data
public class GameReviewReq extends LocalDatePageRequest {
    /**
     * 牌桌id
     */
    private Long tableId;
    /**
     * 局次（牌桌第多少局）
     */
    private Integer roundNo;
}
