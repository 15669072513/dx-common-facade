package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.dto.DxTableInfoDto;
import com.dx.facade.venue.req.DxTableInfoAddReq;
import com.dx.facade.venue.req.DxTableInfoListReq;
import com.dx.facade.venue.resp.*;

public interface IDxTableInfoService {
    /**
     * 根据条件查询牌桌列表信息
     * @param req
     * @return
     */
    CommonResp<PageResp<DxTableInfoListResp, DxTableSummaryResp>> listPage(DxTableInfoListReq req);

    CommonResp<TableConfigRuleResp> getTableConfigByTableId(Long tableId);

    /**
     * 新增牌桌
     * @param req
     * @throws BizException
     */
    CommonResp<DxTableInfoDto> addTable(DxTableInfoAddReq req) throws BizException;

    /**
     * 更新牌桌
     * @param req
     * @throws BizException
     */
    CommonResp<Void> updateTable(DxTableInfoAddReq req) throws BizException;

    /**
     * 根据俱乐部id 获取牌桌个数
     * @param clubId
     * @return
     */
    CommonResp<TableCountResp> getTableCountByClubId(Long clubId);

    /**
     * 游戏牌桌解散（综合后台强制解散）
     * @param tableId 牌桌id
     */
    CommonResp<Void> gameDissolve(Long tableId);

    /**
     * 游戏牌桌解散（游戏房间内房主解散）
     * @param tableId 牌桌id
     */
    CommonResp<Void> houseOwnerGameDissolve(Long tableId);

    /**
     * 根据牌桌ID获取牌桌基础信息
     */
    CommonResp<DxTableBaseInfoResp> getTableBaseInfoById(Long tableId);

}
