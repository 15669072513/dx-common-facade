package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.req.DxHandInfoStartReq;

/**
 * 手牌RPC
 */
public interface HandInfoRpcService {

    CommonResp<Long> startHandInfo(DxHandInfoStartReq dxHandInfoStartReq);

}
