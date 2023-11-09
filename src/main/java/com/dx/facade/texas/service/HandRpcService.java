package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.resp.HandStatusResp;

/**
 * 手牌RPC
 */
public interface HandRpcService {
    CommonResp<Void> startHand(Long tableId,String handCode);
    CommonResp<Void> updateHandStatusToException(Long tableId,String handCode);
    CommonResp<HandStatusResp> getLastHandStatusByTableId(Long tableId);
}
