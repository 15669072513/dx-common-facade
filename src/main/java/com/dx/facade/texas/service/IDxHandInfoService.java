package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.proxy.resp.DxAppHandInfoResp;
import com.dx.facade.proxy.resp.DxAppHandSummaryResp;
import com.dx.facade.proxy.resp.DxHandInfoResp;
import com.dx.facade.texas.dto.DxHandPumpInfoDto;
import com.dx.facade.texas.req.DxAppHandInfoListReq;
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
     * 根据 手牌id 或者 手牌code 获取手牌信息
     * @param handId
     * @return
     */
    CommonResp<DxHandDetailResp> getHandInfoById(String handId);


    /**
     * 根据牌桌Id和手牌号获取手牌信息
     * @param tableId
     * @param handNum
     * @return
     */
    CommonResp<DxHandDetailResp> getHandInfo(Long  tableId,Integer handNum);

    /**
     * 根据手牌id获取手牌信息
     * @param handId
     * @return
     */
    CommonResp<DxHandDetailResp> getHandInfoById(Long handId);

    /**
     * 根据handId和状态更新手牌数据
     * @param req
     * @throws BizException
     */
    CommonResp<Void> updateHandByIdAndStatus(DxHandInfoAddReq req, Integer conditionStatus) throws BizException;

    /**
     * 根据手牌Code获取游戏注单信息
     * @param handCode
     * @return
     */
    public CommonResp<DxGameRecordResp> getGameRecordInfoByHandCode(String handCode);

    /**
     * 根据多个handId查询手牌信息
     * @param handIds
     * @return
     */
    public CommonResp<DxHandPumpInfoDto> getHandInfoByHandIds(List<Long> handIds);

    /**
     * 战绩手牌列表
     */
    public CommonResp<PageResp<DxHandInfoResp, Void>> getRecordHandListPage(DxHandInfoListReq dxHandInfoListReq);

    /**
     * 代理后台手牌列表
     */
    public CommonResp<PageResp<DxHandInfoResp, Void>> getProxyHandListPage(DxHandInfoListReq dxHandInfoListReq);

    /**
     * APP手牌列表
     */
    public CommonResp<PageResp<DxAppHandInfoResp, DxAppHandSummaryResp>> getAppHandListPage(DxAppHandInfoListReq dxAppHandInfoListReq);

}
