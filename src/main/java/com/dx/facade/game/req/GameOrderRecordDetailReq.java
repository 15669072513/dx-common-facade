package com.dx.facade.game.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import lombok.Data;

/**
 * 牌局详情请求对象
 */
@Data
public class GameOrderRecordDetailReq extends LocalDatePageRequest {
    /**
     * 手牌id
     */
    private Long handId;
}
