package com.dx.facade.game.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import lombok.Data;

@Data
public class GameOrderRecordReq extends LocalDatePageRequest {
    /**
     * 手牌id
     */
    private Long handId;
}
