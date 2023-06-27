package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.texas.dto.DxHandPumpInfoDto;
import com.dx.facade.texas.req.DxHandInfoAddReq;
import com.dx.facade.texas.req.DxHandInfoListReq;
import com.dx.facade.texas.resp.DxGameRecordResp;
import com.dx.facade.texas.resp.DxHandDetailResp;
import com.dx.facade.texas.resp.DxHandInfoListResp;

import java.util.List;

public interface IDxHandInfoService {
    /**
     * 根据条件查询牌局列表信息-翻页
     * @param req
     * @return
     */
    CommonResp<PageResp<DxHandInfoListResp, Void>> listPage(DxHandInfoListReq req);

    /**
     * 根据条件查询牌局列表信息-导出
     * @param req
     * @return
     */
    CommonResp<DxHandPumpInfoDto> listAll(DxHandInfoListReq req);

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

    /**
     * 根据多个handId查询手牌信息
     * @param handIds
     * @return
     */
    public CommonResp<DxHandPumpInfoDto> getHandInfoByHandIds(List<Long> handIds);
}
