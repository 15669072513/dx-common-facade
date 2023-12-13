package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.dto.game.*;
import com.dx.facade.game.req.*;
import com.dx.facade.game.resp.GameOrderClubSumResp;

public interface GameOrderRPCManagerService {
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
     *  俱乐部贡献
     */
    CommonResp<PageResp<GameOrderClubSumResp, ?>> gameOrderClubContributeList(GameOrderClubSumReq req);
    /**
     *  查询手牌id
     */
    CommonResp<GameOrderClubContributeDto> gameOrderClubContributeHandIdList(GameOrderClubSumReq req);

    /**
     *  会员金额相关汇总
     *  代理后台会员列表
     */
    CommonResp<GameOrderUserSumByUserIdRespDto> gameOrderUserSumList(GameOrderUserSumByUserIdReq req);


    CommonResp<GameOrderTableListRespDto> gameOrderTableListByUserName(GameOrderUserNameReq req);

    CommonResp<GameOrderTableListRespDto> gameOrderTableListByUserId(Long userId);
}
