package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.dto.game.GameOrderRecordHandUserRespDto;
import com.dx.facade.game.dto.game.GameOrderRecordUserNetChipSumReqDto;
import com.dx.facade.game.dto.game.GameOrderUserSettlementRespDto;
import com.dx.facade.game.dto.game.UserValiBetAmountRespDto;
import com.dx.facade.game.req.*;
import com.dx.facade.game.resp.*;
import com.dx.facade.game.resp.gamedetail.GameOrderRecordDetail;

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
    CommonResp<PageResp<GameOrderRecordDetail.GameOrderRecord, GameOrderRecordDetail.GameOrderRecordSummary>> queryGameOrderTableDetailSumList(GameOrderTableDetailSumReq req);

    /**
     * 盈亏总额
     */
    CommonResp<GameOrderRecordUserNetChipSumReqDto> userNetAmountSummary(GameOrderRecordUserNetChipSumReq req);

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
     * 综合后台-结算详情
     */
    CommonResp<GameOrderUserSettlementRespDto> gameOrderUserSettlementDetail(GameOrderUserSettlementDetailReq req);

    /**
     * 代理-会员流水
     */
    CommonResp<PageResp<GameOrderUserResp, GameOrderUserSumResp>> gameOrderUserList(GameOrderUserReq req);
    /**
     * 代理-游戏记录
     */
    CommonResp<PageResp<GameOrderRecordUserVenueResp, ?>> gameOrderUserVenueList(GameOrderRecordUserVenueReq req);

    /**
     * 会员有效投注
     */
    CommonResp<UserValiBetAmountRespDto> userVlidBetAmountSum(UserValiBetAmountReq req);

    /**
     * 手牌玩家列表
     */
    CommonResp<GameOrderRecordHandUserRespDto> gameOrderRecordHandUserList(GameOrderRecordHandUserReq req);

    /**
     * 代理后台-结算详情
     */
    CommonResp<PageResp<GameOrderUserSettlementDetailByProxyResp, ?>> gameOrderUserSettlementByProxyList(GameOrderUserSettlementDetailByProxyReq req);


}
