package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.*;
import com.dx.facade.game.resp.*;
import com.dx.facade.game.resp.gamedetail.GameOrderRecordDetail;
import java.util.List;

/**
 * 战绩
 * @author broadway
 */
public interface GameOrderRecordRpcService {
    /**
     * 查询战绩详情
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordDetail.GameOrderRecord, GameOrderRecordDetail.GameOrderRecordSummary>> queryGameOrderRecordDetailInfo(GameOrderTableDetailSumReq req);

    /**
     * 资金明细页的统计数据
     * @param req
     * @return
     */
    CommonResp<FundDetailSumResp> getFundDetailSum(FundDetailReq req);

    /**
     * 资金明细页分页数据
     * @param req
     * @return
     */
    CommonResp<PageResp<FundDetailRecordResp,Void>> getFundDetailRecord(FundDetailReq req);

    CommonResp<PageResp<GameOrderRecordProxyResp, ?>> getGameRecord(GameOrderRecordProxyReq req);

    /**
     * 查询注单列表
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordResp, ?>> queryGameOrderList(GameOrderRecordReq req);

    /**
     * 查询注单详情
     * @param req
     * @return
     */
    CommonResp<GameOrderRecordDetailResp> queryGameOrderDetailList(GameOrderRecordDetailReq req);


    /**
     * 获取当前牌桌的注单记录用户手牌列表
     * @param tableId
     * @return
     */
    CommonResp<List<GameRecordUserHandResp>> getGameRecordUserHandListByTableId(Long tableId);

    /**
     * 战绩详情
     *
     * @param req
     * @return
     */
    CommonResp<PageResp<RecordDetailList, RecordDetailSummary>> recordDetailList(RecordDetailReq req);

    /**
     * 根据tableId查询注单信息（APP端手牌列表使用）
     * @param tableId
     * @return
     */
    CommonResp<List<GameOrderRecordHandInfoResp>> queryGameOrderByTableId(Long tableId);
}
