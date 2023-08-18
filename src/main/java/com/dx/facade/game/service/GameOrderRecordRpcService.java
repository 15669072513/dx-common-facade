package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.FundDetailReq;
import com.dx.facade.game.req.GameOrderRecordProxyReq;
import com.dx.facade.game.req.GameOrderRecordReq;
import com.dx.facade.game.req.GameOrderTableDetailSumReq;
import com.dx.facade.game.resp.FundDetailRecordResp;
import com.dx.facade.game.resp.FundDetailSumResp;
import com.dx.facade.game.resp.GameOrderRecordProxyResp;
import com.dx.facade.game.resp.GameOrderRecordResp;
import com.dx.facade.game.resp.gamedetail.GameOrderRecordDetail;

import java.math.BigDecimal;
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
}
