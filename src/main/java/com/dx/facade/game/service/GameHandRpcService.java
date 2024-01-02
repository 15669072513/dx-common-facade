package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.texas.req.DxHandInfoListReq;
import com.dx.facade.texas.resp.DxHandInfoListEsResp;

/**
 * 手牌RPC接口定义
 */
public interface GameHandRpcService {


    /**
     * 根据条件查询牌局列表信息-翻页
     * @param req
     * @return
     */
    CommonResp<PageResp<DxHandInfoListEsResp, Void>> listPage(DxHandInfoListReq req);
}
