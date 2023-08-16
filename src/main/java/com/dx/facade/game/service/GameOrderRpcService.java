package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.dto.GameOrderRecordDto;
import com.dx.facade.game.dto.game.GameOrderRecordHandUserRespDto;
import com.dx.facade.game.dto.game.UserValiBetAmountRespDto;
import com.dx.facade.game.req.GameOrderRecordHandUserReq;
import com.dx.facade.game.req.GameOrderRecordUserVenueReq;
import com.dx.facade.game.req.GameOrderUserReq;
import com.dx.facade.game.req.GameOrderUserSettlementDetailByProxyReq;
import com.dx.facade.game.req.GameReviewReq;
import com.dx.facade.game.req.UserValiBetAmountReq;
import com.dx.facade.game.resp.GameOrderRecordUserVenueResp;
import com.dx.facade.game.resp.GameOrderUserResp;
import com.dx.facade.game.resp.GameOrderUserSettlementDetailByProxyResp;
import com.dx.facade.game.resp.GameOrderUserSumResp;
import com.dx.facade.game.resp.GameRecordDeatailPackResp;
import com.dx.facade.game.resp.GameReviecardRoundResp;
import com.dx.facade.game.resp.GameReviewcardResp;
import com.dx.facade.texas.req.DxHandInfoListReq;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author heart
 */
public interface GameOrderRpcService {

    /**
     * 修改订单es下发状态
     * @param idList 主键id
     * @return
     */
    CommonResp<Integer> updateGameOrderRecord(List<Long> idList, BigDecimal maxPot);

    CommonResp<Integer> updateGameOrderRecordHaveDto(List<Long> idList, GameOrderRecordDto dto);

    /**
     * 修改手牌记录es下发状态
     * @param idList 主键id
     * @return
     */
    CommonResp<Integer> updateGameReview(List<Long> idList);

    /**
     * 获取该牌桌最大手数
     * @param tableId 牌桌id
     * @return
     */
    CommonResp<Integer> getMaxRoundNoByTableId(Long tableId);

    CommonResp<PageResp<GameOrderRecordDto, ?>>selectGameOrderRecordPage(DxHandInfoListReq req);

    /**
     * 获取用户总盈亏
     * @param userId 用户id
     * @param gameType 牌局类型
     * @param starTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    CommonResp<BigDecimal> getUserNetAmountSummary(Long userId, Integer gameType,
                                       Long starTime, Long endTime);



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
     * 用户有效投注总计
     * @param req
     * @return
     */
    CommonResp<UserValiBetAmountRespDto> userVlidBetAmountSum(UserValiBetAmountReq req);


    /**
     * 手牌玩家列表
     */
    CommonResp<GameOrderRecordHandUserRespDto> gameOrderRecordHandUserList(GameOrderRecordHandUserReq req);


    /**
     * 代理后台-结算详情
     */
    CommonResp<PageResp<GameOrderUserSettlementDetailByProxyResp, ?>> gameOrderUserSettlementByProxyList(
        GameOrderUserSettlementDetailByProxyReq req);

}
