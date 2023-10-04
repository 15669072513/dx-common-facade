package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.facade.account.req.MemberBillDetailIncreaseReq;

public interface MemberBillDetailRPCService {

    /**
     * 给会员增加需要完成的流水（存款，优惠，返水，返水增加，充值上分，信用借款，俱乐部返水增加调整，保险返水增加调整）
     * @param req
     * @return true，处理成功，false，处理失败
     */
    CommonResp<Boolean> increaseBillDetail (MemberBillDetailIncreaseReq req);
}
