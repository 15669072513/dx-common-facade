package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameOrderRecordDetailReq;
import com.dx.facade.game.req.GameOrderRecordUserReq;
import com.dx.facade.game.req.GameReviewReq;
import com.dx.facade.game.resp.GameOrderRecordDetailResp;
import com.dx.facade.game.resp.GameOrderRecordUserResp;
import com.dx.facade.game.resp.GameReviewResp;

import java.math.BigDecimal;

/**
 * @author heart
 */
public interface GameOrderEsRpcService {
    /**
     * 牌局回顾
     */
    CommonResp<PageResp<GameReviewResp, ?>> queryGameReviewList(GameReviewReq req);

    /**
     *  牌局详情
     */
    CommonResp<PageResp<GameOrderRecordDetailResp, ?>> queryGameOrderDetailList(GameOrderRecordDetailReq req);
    /**
     * 战绩列表
     */
    CommonResp<PageResp<GameOrderRecordUserResp, ?>> queryUserHandList(GameOrderRecordUserReq req);
    /**
     * 盈亏总额
     */
    CommonResp<BigDecimal> userNetAmountSummary(GameOrderRecordUserReq req);
}
