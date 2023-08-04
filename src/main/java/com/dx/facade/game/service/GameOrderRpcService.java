package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.dto.GameOrderRecordDto;
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
}
