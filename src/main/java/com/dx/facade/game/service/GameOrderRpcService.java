package com.dx.facade.game.service;

import com.dx.entity.CommonResp;

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
    CommonResp<Integer> updateGameOrderRecord(List<Long> idList);

    /**
     * 修改手牌记录es下发状态
     * @param idList 主键id
     * @return
     */
    CommonResp<Integer> updateGameReview(List<Long> idList);


}
