package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.req.DxHandInfoAddReq;
import com.dx.facade.venue.req.DxHandInfoListReq;
import com.dx.facade.venue.resp.DxHandInfoListResp;

public interface IDxHandInfoService {
    /**
     * 根据条件查询牌局列表信息
     * @param req
     * @return
     */
    CommonResp<PageResp<DxHandInfoListResp, Void>> listPage(DxHandInfoListReq req);

    /**
     * 新增牌局
     * @param req
     * @throws BizException
     */
    CommonResp<?> addHand(DxHandInfoAddReq req) throws BizException;

    /**
     * 根据手牌id获取手牌信息
     * @param handId
     * @return
     */
    CommonResp<DxHandInfoListResp> getHandInfoById(String handId);
}
