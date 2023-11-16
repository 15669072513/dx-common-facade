package com.dx.facade.game.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameRecordMsgReq;
import com.dx.facade.game.resp.GameRecordMsgResp;


/**
 * 牌局消息信息表rpc调用
 */
public interface GameRecordMsgRpcService {


    /**
     * 删除牌局消息记录信息
     * @param linkId
     * @return
     */
    CommonResp<Boolean> deleteGameRecordMsg(String linkId);

    /**
     * 分页查询牌局消息记录信息
     * @param req
     * @return
     */
    CommonResp<PageResp<GameRecordMsgResp, ?>> queryGameRecordMsgPage(GameRecordMsgReq req);


    /**
     * 手动同步es消息
     * @param req
     * @return
     */
    CommonResp<Boolean> syncGameRecordMsgEs(GameRecordMsgReq req);
}
