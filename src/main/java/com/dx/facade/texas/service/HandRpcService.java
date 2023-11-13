package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.resp.HandStatusResp;

/**
 * 手牌RPC
 */
public interface HandRpcService {
    CommonResp<Boolean> startHand(Long tableId,String handCode);
    CommonResp<Boolean> updateHandStatusToException(Long tableId,String handCode);
    CommonResp<HandStatusResp> getLastHandStatusByTableId(Long tableId);
}
