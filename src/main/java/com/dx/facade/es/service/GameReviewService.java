package com.dx.facade.es.service;

import com.dx.facade.es.req.GameReviewReq;
import com.dx.facade.es.resp.GameReviewResp;

import java.util.List;

/**
 * 牌局回顾
 * @author heart
 */
public interface GameReviewService {
    /**
     * 获取游戏牌局回顾
     * @param req
     * @return
     */
    List<GameReviewResp> getGameReview(GameReviewReq req);
}
