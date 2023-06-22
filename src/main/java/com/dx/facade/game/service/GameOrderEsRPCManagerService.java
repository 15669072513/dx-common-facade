package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.dto.game.*;
import com.dx.facade.game.req.*;

public interface GameOrderEsRPCManagerService {
    /**
     *  综合后台--手牌 金额相关汇总
     */
    CommonResp<GameOrderHandSumRespDto> gameOrderHandSumList(GameOrderHandSumReq req);
    /**
     *  综合后台--牌桌 金额相关汇总
     */
    CommonResp<GameOrderTableSumRespDto> gameOrderTableSumList(GameOrderTableSumReq req);

    /**
     * 手牌下面的玩家列表
     */
    CommonResp<GameOrderRecordUserHandRespDto> gameOrderRecordUserHandList(GameOrderRecordUserHandReq req);


    /**
     * 综合后天-俱乐部 金额相关汇总
     */
    CommonResp<GameOrderClubSumRespDto> gameOrderClubSumList(GameOrderClubSumReq req);

    /**
     *  会员金额相关汇总
     */
    CommonResp<GameOrderUserSumByUserIdRespDto> gameOrderUserSumList(GameOrderUserSumByUserIdReq req);

}
