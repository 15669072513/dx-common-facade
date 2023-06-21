package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.req.DxHandInfoAddReq;
import com.dx.facade.venue.req.DxHandInfoListReq;
import com.dx.facade.venue.resp.DxGameRecordResp;
import com.dx.facade.venue.resp.DxHandDetailResp;
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
    CommonResp<Void> addHand(DxHandInfoAddReq req) throws BizException;

    /**
     * 根据手牌id获取手牌信息
     * @param handId
     * @return
     */
    CommonResp<DxHandDetailResp> getHandInfoById(Long handId);

    /**
     * 根据tableId和局次更新手牌数据
     * @param req
     * @throws BizException
     */
    CommonResp<Void> updateHandByTableIdAndHandNum(DxHandInfoAddReq req) throws BizException;

    /**
     * 根据手牌id获取游戏注单信息
     * @param handId
     * @return
     */
    public CommonResp<DxGameRecordResp> getGameRecordInfoByHandId(Long handId);
}
