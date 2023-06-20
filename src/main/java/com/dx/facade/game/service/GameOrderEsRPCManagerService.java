package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameOrderClubSumReq;
import com.dx.facade.game.req.GameOrderHandSumReq;
import com.dx.facade.game.req.GameOrderRecordUserHandReq;
import com.dx.facade.game.req.GameOrderTableSumReq;
import com.dx.facade.game.resp.GameOrderClubSumResp;
import com.dx.facade.game.resp.GameOrderHandSumResp;
import com.dx.facade.game.resp.GameOrderRecordUserHandResp;
import com.dx.facade.game.resp.GameOrderTableSumResp;

import java.util.List;

public interface GameOrderEsRPCManagerService {
    /**
     *  综合后台--手牌 金额相关汇总
     */
    CommonResp<List<GameOrderHandSumResp>> gameOrderHandSumList(GameOrderHandSumReq req);
    /**
     *  综合后台--牌桌 金额相关汇总
     */
    CommonResp<List<GameOrderTableSumResp>> gameOrderTableSumList(GameOrderTableSumReq req);

    /**
     * 手牌下面的玩家列表
     */
    CommonResp<List<GameOrderRecordUserHandResp>> gameOrderRecordUserHandList(GameOrderRecordUserHandReq req);


    /**
     * 俱乐部贡献
     */
    CommonResp<PageResp<GameOrderClubSumResp, ?>> gameOrderClubSumList(GameOrderClubSumReq req);
}
