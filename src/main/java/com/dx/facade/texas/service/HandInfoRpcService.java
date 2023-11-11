package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.resp.gamedetail.GameOrderRecordDetail;
import com.dx.facade.texas.req.DxHandInfoStartReq;

/**
 * 手牌RPC
 */
public interface HandInfoRpcService {

    CommonResp<Long> startHandInfo(DxHandInfoStartReq dxHandInfoStartReq);

    /**
     * 查询战绩详情聚合
     * @param tableId
     * @return
     */
    CommonResp<GameOrderRecordDetail.GameOrderRecordSummary> getGameOrderRecordSummary(Long tableId);
}
