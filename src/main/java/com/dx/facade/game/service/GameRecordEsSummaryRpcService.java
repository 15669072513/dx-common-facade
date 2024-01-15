package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.GameOrderRecordReq;
import com.dx.facade.game.resp.GameOrderRecordSummaryResp;

/**
 * 注单页统计
 */
public interface GameRecordEsSummaryRpcService {

    /**
     * 根据条件查询注单列表统计信息(ES)
     * @param req
     * @return
     */
    CommonResp<GameOrderRecordSummaryResp> getGameRecordSummary(GameOrderRecordReq req);

}
