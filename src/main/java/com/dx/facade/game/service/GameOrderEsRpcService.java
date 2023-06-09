package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.*;
import com.dx.facade.game.resp.*;

import java.math.BigDecimal;
import java.util.List;

/**
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
    CommonResp<BigDecimal> userNetAmountSummary(GameOrderRecordUserReq req);

    /**
     *  牌局详情
     */
    CommonResp<PageResp<GameOrderRecordDetailResp, ?>> queryGameOrderDetailList(GameOrderRecordDetailReq req);
    /**
     * 玩家手牌列表
     */
    CommonResp<PageResp<GameOrderRecordUserResp, ?>> queryUserHandList(GameOrderRecordUserReq req);
}
