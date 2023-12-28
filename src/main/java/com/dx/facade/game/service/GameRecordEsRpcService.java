package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameOrderRecordProxyReq;
import com.dx.facade.game.req.GameOrderRecordReq;
import com.dx.facade.game.resp.GameOrderRecordProxyResp;
import com.dx.facade.game.resp.GameOrderRecordResp;

public interface GameRecordEsRpcService {

    /**
     * 游戏记录接口
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordProxyResp, ?>> getGameRecord(GameOrderRecordProxyReq req);

    /**
     * 查询注单列表
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordResp, ?>> queryGameOrderList(GameOrderRecordReq req);

}
