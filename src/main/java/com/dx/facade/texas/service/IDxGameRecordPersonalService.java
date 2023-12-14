package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.req.DxGamePersonalReq;
import com.dx.facade.texas.resp.DxGamePersonalResp;

public interface IDxGameRecordPersonalService {
    /**
     * 根据用户ID、牌桌类型获取游戏个人信息
     * @param dxGamePersonalReq
     * @return
     */
    CommonResp<DxGamePersonalResp> getGameRecordPersonalInfo(DxGamePersonalReq dxGamePersonalReq);
}
