package com.dx.facade.es.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.texas.req.DxHandInfoListReq;
import com.dx.facade.texas.resp.DxHandInfoListResp;

/**
 * 手牌RPC接口定义
 */
public interface IGameHandRpcService {


    /**
     * 根据条件查询牌局列表信息-翻页
     * @param req
     * @return
     */
    CommonResp<PageResp<DxHandInfoListResp, Void>> listPage(DxHandInfoListReq req);
}
