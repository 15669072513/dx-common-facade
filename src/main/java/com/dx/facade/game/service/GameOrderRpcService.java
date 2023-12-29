package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.es.req.GameTableInfoListReq;
import com.dx.facade.es.resp.GameReviewDetailResp;
import com.dx.facade.es.resp.GameTableInfoListEsResp;
import com.dx.facade.game.dto.GameOrderRecordDto;
import com.dx.facade.game.dto.game.GameOrderRecordHandUserRespDto;
import com.dx.facade.game.dto.game.GameOrderRecordUserNetChipSumReqDto;
import com.dx.facade.game.dto.game.UserValiBetAmountRespDto;
import com.dx.facade.game.req.GameOrderRecordHandUserReq;
import com.dx.facade.game.req.GameOrderRecordUserNetChipSumReq;
import com.dx.facade.game.req.GameOrderRecordUserVenueReq;
import com.dx.facade.game.req.GameOrderUserReq;
import com.dx.facade.game.req.GameOrderUserSettlementDetailByProxyReq;
import com.dx.facade.game.req.GameOrderUserTableSumReq;
import com.dx.facade.game.req.GameReviewReq;
import com.dx.facade.game.req.UserValiBetAmountReq;
import com.dx.facade.game.resp.GameOrderRecordUserVenueResp;
import com.dx.facade.game.resp.GameOrderUserResp;
import com.dx.facade.game.resp.GameOrderUserSettlementDetailByProxyResp;
import com.dx.facade.game.resp.GameOrderUserSumResp;
import com.dx.facade.game.resp.GameOrderUserTableSumResp;
import com.dx.facade.game.resp.GameRecordDeatailPackResp;
import com.dx.facade.game.resp.GameRevieRoundResp;
import com.dx.facade.game.resp.GameReviecardRoundResp;
import com.dx.facade.game.resp.GameReviewResp;
import com.dx.facade.game.resp.GameReviewcardResp;
import com.dx.facade.texas.req.DxHandInfoListReq;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author heart
 */
public interface GameOrderRpcService {



    /**
     * 查询展示牌局回顾牌谱列表
     * @param req
     * @return
     */
    CommonResp<PageResp<GameReviewcardResp, GameReviecardRoundResp>> queryGameReviewList(GameReviewReq req);

    /**
     * 查看牌局回顾详细过程明细
     * @param req
     * @return
     */
    CommonResp<PageResp<GameRecordDeatailPackResp, Void>> getGameReviewDeatailList(GameReviewReq req);

    /**
     * 战绩列表
     */
    CommonResp<PageResp<GameOrderUserTableSumResp, ?>> queryGameOrderUserTableSumList(GameOrderUserTableSumReq req);

    /**
     * 盈亏总额
     */
    CommonResp<GameOrderRecordUserNetChipSumReqDto> userNetAmountSummary(GameOrderRecordUserNetChipSumReq req);

    /**
     * 用户投注记录
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderUserResp, GameOrderUserSumResp>> gameOrderUserList(GameOrderUserReq req);

    /**
     * 场馆维度用户记录
     * @param req
     * @return
     */
    CommonResp<PageResp<GameOrderRecordUserVenueResp, ?>> gameOrderUserVenueList(GameOrderRecordUserVenueReq req);



    /**
     * 代理后台-结算详情
     */
    CommonResp<PageResp<GameOrderUserSettlementDetailByProxyResp, ?>> gameOrderUserSettlementByProxyList(
        GameOrderUserSettlementDetailByProxyReq req);

    /**
     * 注单记录
     * @param req
     * @return
     */
    CommonResp<PageResp<GameTableInfoListEsResp, Void>> listPage(GameTableInfoListReq req);

}