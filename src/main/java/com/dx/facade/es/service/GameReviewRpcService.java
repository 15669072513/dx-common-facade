package com.dx.facade.es.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameReviewReq;
import com.dx.facade.game.resp.GameRecordDeatailPackResp;
import com.dx.facade.game.resp.GameReviecardRoundResp;
import com.dx.facade.game.resp.GameReviewcardResp;


/**
 * 游戏牌局回顾查询
 * @author streak
 */
public interface GameReviewRpcService {

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
}