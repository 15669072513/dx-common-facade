package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.*;
import com.dx.facade.game.resp.*;

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
     * 综合后天-俱乐部 金额相关汇总
     */
    CommonResp<List<GameOrderClubSumResp>> gameOrderClubSumList(GameOrderClubSumReq req);

    /**
     *  会员金额相关汇总
     */
    CommonResp<List<GameOrderUserSumByUserIdResp>> gameOrderUserSumList(GameOrderUserSumByUserIdReq req);

}
