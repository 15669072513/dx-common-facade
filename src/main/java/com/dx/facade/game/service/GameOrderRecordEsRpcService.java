package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameOrderClubSumReq;
import com.dx.facade.game.req.GameOrderRecordReq;
import com.dx.facade.game.resp.GameOrderClubSumResp;
import com.dx.facade.game.resp.GameOrderRecordResp;

/**
 * es 注单 相关接口
 */
public interface GameOrderRecordEsRpcService {


    /**
     * 从es中查询注单列表
     *
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordResp, ?>> getGameRecord(GameOrderRecordReq req);

    /**
     * 查询游戏订单俱乐部汇总信息
     *
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderClubSumResp, ?>> gameOrderClubSum(GameOrderClubSumReq req);
}
