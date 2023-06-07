package com.dx.facade.game.service;

import com.dx.entity.CommonResp;

import java.util.List;

/**
 * @author heart
 */
public interface GameOrderRpcService {

    /**
     * 手牌记录
     * @param idList 主键id
     * @return
     */
    CommonResp<Integer> updateGameOrderRecord(List<Long> idList);

    /**
     * 游戏回顾
     * @param idList 主键id
     * @return
     */
    CommonResp<Integer> updateGameReview(List<Long> idList);
}
