package com.dx.facade.game.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import lombok.Data;

/**
 * 牌局详情请求对象
 */
@Data
public class GameOrderTableDetailSumReq extends LocalDatePageRequest {
    /**
     * 牌桌id
     */
    private Long tableId;

}
