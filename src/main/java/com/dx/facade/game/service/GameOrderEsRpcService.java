package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.*;
import com.dx.facade.game.resp.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * 玩家注单查询
 * @author heart
 */
public interface GameOrderEsRpcService {
    /**
     * 牌局回顾
     */
    CommonResp<GameReviewResp> queryGameReviewList(GameReviewReq req);
    /**
     * 玩家战绩列表
     */
    CommonResp<PageResp<GameOrderUserTableSumResp, ?>> queryGameOrderUserTableSumList(GameOrderUserTableSumReq req);
    /**
     * 牌桌战绩列表
     */
    CommonResp<List<GameOrderTableDetailSumResp>> queryGameOrderTableDetailSumList(GameOrderTableDetailSumReq req);

    /**
     * 盈亏总额
     */
    CommonResp<BigDecimal> userNetAmountSummary(GameOrderRecordUserNetChipSumReq req);

    /**
     * 注单列表
     */
    CommonResp<PageResp<GameOrderRecordResp, ?>> queryGameOrderList(GameOrderRecordReq req);
    /**
     * 注单详情
     */
    CommonResp<GameOrderRecordDetailResp> queryGameOrderDetailList(GameOrderRecordDetailReq req);

    /**
     * 场馆游戏注单
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordVenueResp, ?>> queryGameOrderVenueList(GameOrderRecordVenueReq req);
    /**
     * 场馆游戏注单详情
     */
    CommonResp<PageResp<GameOrderRecordDetailVenueResp, ?>> queryGameOrderVenueDetailList(GameOrderRecordDetailVenueReq req);


    /**
     * 会员盈亏汇总
     */
    CommonResp<PageResp<GameOrderRecordUserResp, ?>> userNetChipDetail(GameOrderRecordUserReq req);

    /**
     * 会员结算详情
     */
    CommonResp<PageResp<GameOrderUserSettlementResp, ?>> userSettlementDetail(Long tableId);


    /**
     * 会员流水
     */
    CommonResp<PageResp<GameOrderUserFlowWaterResp, ?>> userFlowingWaterList(GameOrderUserFlowWaterReq req);
    /**
     * 游戏记录
     */
    CommonResp<PageResp<GameOrderRecordResp, ?>> userGameRecordList(GameOrderRecordReq req);
}
