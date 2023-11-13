package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.game.dto.ShutdownMaintenanceDTO;
import com.dx.facade.game.req.ShutdownMaintenanceReq;
import com.dx.facade.game.resp.DxShutdownMaintenanceResp;
import com.dx.facade.game.resp.ShutdownMaintenanceResp;

/**
 * @author admin
 */
public interface ShutdownMaintenanceRpcService {

    /**
     * 客户端热门列表分页数据
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ShutdownMaintenanceResp, ?>> shutdownMaintenancePage(ShutdownMaintenanceReq req) throws BizException;

    /**
     * 新增
     *
     * @param dto
     * @return
     * @throws BizException
     */
    CommonResp<Void> insertShutdownMaintenance(ShutdownMaintenanceDTO dto) throws BizException;

    /**
     * 编辑
     *
     * @param dto
     * @return
     * @throws BizException
     */
    CommonResp<Void> updateShutdownMaintenance(ShutdownMaintenanceDTO dto) throws BizException;

    /**
     * 物理删除单条数据
     *
     * @param id
     * @return
     * @throws BizException
     */
    CommonResp<Void> deleteShutdownMaintenance(Long id) throws BizException;


    /**
     * 获取最近的一条停机维护信息
     * @return
     * @throws BizException
     */
    CommonResp<DxShutdownMaintenanceResp> getRecentlyShutdownMaintenance() throws BizException;

}
