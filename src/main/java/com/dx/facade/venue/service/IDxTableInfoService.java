package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.po.DxTableInfoPO;
import com.dx.facade.venue.req.*;
import com.dx.facade.venue.resp.DxTableInfoListResp;
import com.dx.facade.venue.resp.TableCountResp;

public interface IDxTableInfoService {
    /**
     * 根据条件插叙牌桌列表信息
     * @param req
     * @return
     */
    PageResp<DxTableInfoListResp, Void> listPage(DxTableInfoListReq req);

    CommonResp<DxTableInfoPO> getTableConfigByTableId(String tableId);

    /**
     * 新增牌桌
     * @param req
     * @throws BizException
     */
    void addTable(DxTableInfoAddReq req) throws BizException;

    /**
     * 更新牌桌
     * @param req
     * @throws BizException
     */
    void updateTable(DxTableInfoAddReq req) throws BizException;

    /**
     * 根据俱乐部id 获取牌桌个数
     * @param clubId
     * @return
     */
    CommonResp<TableCountResp> getTableCountByClubId(Long clubId);

}
