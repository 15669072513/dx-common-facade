package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.resp.DxGameTableConfigResp;
import com.dx.facade.texas.resp.HandStatusResp;

/**
 * 牌桌RPC
 */
public interface TableInfoRpcService {
    /**
     * 获取游戏牌桌配置信息
     * @param tableId 牌桌id
     * @return
     */
    CommonResp<DxGameTableConfigResp> getGameTableConfigInfo(Long tableId);
}
