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
    CommonResp<PageResp<GameReviewResp, GameRevieRoundResp>> queryGameReviewList(GameReviewReq req);
    /**
     * 战绩列表
     */
    CommonResp<PageResp<GameOrderUserTableSumResp, ?>> queryGameOrderUserTableSumList(GameOrderUserTableSumReq req);
    /**
     * 战绩列表详情
     */
    CommonResp<PageResp<GameOrderTableDetailSumResp, GameOrderTableDetailSumResp>> queryGameOrderTableDetailSumList(GameOrderTableDetailSumReq req);

    /**
     * 盈亏总额
     */
    CommonResp<BigDecimal> userNetAmountSummary(GameOrderRecordUserNetChipSumReq req);

    /**
     * 德信-注单列表
     */
    CommonResp<PageResp<GameOrderRecordResp, ?>> queryGameOrderList(GameOrderRecordReq req);
    /**
     * 德信-注单详情
     */
    CommonResp<GameOrderRecordDetailResp> queryGameOrderDetailList(GameOrderRecordDetailReq req);

    /**
     * 游戏-注单列表
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordVenueResp, GameOrderRecordVenueAggregationResp>> queryGameOrderVenueList(GameOrderRecordVenueReq req);
    /**
     * 游戏-注单详情
     */
    CommonResp<GameOrderRecordDetailVenueResp> queryGameOrderVenueDetailList(GameOrderRecordDetailVenueReq req);

    /**
     * 会员盈亏汇总
     */
    CommonResp<PageResp<GameOrderRecordUserResp, ?>> userNetChipDetail(GameOrderRecordUserReq req);

    /**
     * 会员结算详情
     */
    CommonResp<GameOrderUserSettlementResp> gameOrderUserSettlementDetail(GameOrderUserSettlementDetailReq req);

    /**
     * 代理-会员流水
     */
    CommonResp<PageResp<GameOrderUserResp, GameOrderUserSumResp>> gameOrderUserList(GameOrderUserReq req);
    /**
     * 代理-游戏记录
     */
    CommonResp<PageResp<GameOrderRecordUserVenueResp, ?>> gameOrderUserVenueList(GameOrderRecordUserVenueReq req);

    /**
     * 会员游戏投注
     */
    CommonResp<List<UserValiBetAmountResp>> userVlidBetAmountSum(UserValiBetAmountReq req);

    /**
     * 手牌列表
     */
    CommonResp<List<GameOrderRecordHandUserResp>> gameOrderRecordHandUserList(GameOrderRecordHandUserReq req);
}
