package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.GameOrderRecordReq;
import com.dx.facade.game.req.GameOrderRecordUserReq;
import com.dx.facade.game.resp.GameOrderRecordResp;
import com.dx.facade.game.resp.GameOrderRecordUserResp;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author heart
 */
public interface GameOrderEsRpcService {
    /**
     * 手牌记录
     */
    CommonResp<List<GameOrderRecordResp>> queryRoundList(GameOrderRecordReq req);
    /**
     * 战绩列表
     */
    CommonResp<List<GameOrderRecordUserResp>> queryUserRoundList(GameOrderRecordUserReq req);
    /**
     * 盈亏总额
     */
    CommonResp<BigDecimal> userNetAmountSummary(GameOrderRecordUserReq req);
}
