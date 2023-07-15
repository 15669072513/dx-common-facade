package com.dx.facade.es.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.es.req.GameTableInfoListReq;
import com.dx.facade.texas.req.DxHandInfoListReq;
import com.dx.facade.texas.resp.DxHandInfoListEsResp;

/**
 * 牌桌ESRPC接口定义
 */
public interface IGameTableRpcService {


    /**
     * 根据条件查询牌桌列表信息-翻页
     * @param req
     * @return
     */
    CommonResp<PageResp<DxHandInfoListEsResp, Void>> listPage(GameTableInfoListReq req);
}
