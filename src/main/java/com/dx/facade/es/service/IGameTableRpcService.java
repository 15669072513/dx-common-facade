package com.dx.facade.es.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.es.req.GameTableInfoListReq;
import com.dx.facade.es.resp.GameTableInfoListEsResp;

/**
 * 牌桌ESRPC接口定义
 */
public interface IGameTableRpcService {


    /**
     * 根据条件查询牌桌列表信息-翻页tijiao
     *
     * @param req
     * @return
     */
    CommonResp<PageResp<GameTableInfoListEsResp, Void>> listPage(GameTableInfoListReq req);
}
