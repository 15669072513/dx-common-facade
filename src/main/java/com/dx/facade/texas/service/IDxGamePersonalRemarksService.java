package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.req.DxGamePersonalRemarksAddReq;
import com.dx.facade.texas.req.DxGamePersonalRemarksReq;
import com.dx.facade.texas.resp.DxGamePersonalRemarksResp;
import java.util.List;

public interface IDxGamePersonalRemarksService {
    /**
     * 保存或者修改游戏个人信息备注
     * @param req
     * @return
     */
    CommonResp<Void> saveOrUpdateGamePersonalRemarksInfo(DxGamePersonalRemarksAddReq req);

    /**
     * 获取游戏个人信息备注
     * @param req
     * @return
     */
    CommonResp<List<DxGamePersonalRemarksResp>> getGamePersonalRemarksInfo(DxGamePersonalRemarksReq req);

    /**
     * 获取游戏个人信息备注 by cache
     * @param req
     * @return
     */
    CommonResp<List<DxGamePersonalRemarksResp>> getGamePersonalRemarksCacheInfo(DxGamePersonalRemarksReq req);
}
