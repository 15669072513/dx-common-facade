package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameOrderRecordProxyReq;
import com.dx.facade.game.resp.GameOrderRecordProxyResp;

public interface GameRecordEsRpcService {

    /**
     * 游戏记录接口
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordProxyResp, ?>> getGameRecord(GameOrderRecordProxyReq req);
}
