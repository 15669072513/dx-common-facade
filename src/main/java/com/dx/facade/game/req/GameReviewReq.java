package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import lombok.Data;

/**
 * 有效回顾请求参数
 */
@Data
public class GameReviewReq extends BaseRequest{
    /**
     * 牌桌id
     */
    private Long tableId;
    /**
     * 局次（牌桌第多少局）
     */
    private Integer roundNo;
}
