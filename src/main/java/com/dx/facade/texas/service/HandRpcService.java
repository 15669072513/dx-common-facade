package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;

/**
 * 手牌RPC
 */
public interface HandRpcService {
    CommonResp<Boolean> startHand(Long tableId,String handCode);
    CommonResp<Boolean> updateHandStatusToException(Long tableId,String handCode);
    CommonResp<Integer> getLastHandStatusByTableId(Long tableId);
}
