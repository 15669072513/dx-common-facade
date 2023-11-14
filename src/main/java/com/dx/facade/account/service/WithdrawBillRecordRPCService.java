package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.facade.account.resp.WithdrawBillRecordRespDTO;

/**
 * 取款账单快照信息RPC
 */
public interface WithdrawBillRecordRPCService {

    /**
     * 通过提现订单号查询提现账单快照信息
     * @param eventId
     * @return
     */
    CommonResp<WithdrawBillRecordRespDTO> getByEventId(String eventId);
}
