package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.member.proxy.req.ProxyLoanBillAppReqDTO;
import com.dx.facade.member.proxy.resp.ProxyLoanBillAppRespDTO;


/**
 *
 */
public interface ProxyLoanBillService {
    /**
     * 代理借款账单 for app
     */
    CommonResp<PageResp<ProxyLoanBillAppRespDTO, ?>> queryProxyLoanBillAppPage(PageReq<ProxyLoanBillAppReqDTO> reqDTO);
}
