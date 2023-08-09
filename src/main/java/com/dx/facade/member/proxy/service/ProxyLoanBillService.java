package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.member.proxy.req.ProxyLoanBillAppReqDTO;
import com.dx.facade.member.proxy.req.ProxyLoanBillPeriodReqDTO;
import com.dx.facade.member.proxy.req.ProxyLoanBillReqDTO;
import com.dx.facade.member.proxy.req.ProxyLoanBillUnPubBatchReqDTO;
import com.dx.facade.member.proxy.resp.*;

import java.util.List;


/**
 *
 */
public interface ProxyLoanBillService {
    /**
     * 代理借款账单 for app
     */
    CommonResp<PageResp<ProxyLoanBillAppRespDTO, ?>> queryProxyLoanBillAppPage(PageReq<ProxyLoanBillAppReqDTO> reqDTO);

    CommonResp<List<ProxyLoanBillUnPubBatchRespDTO>> queryUnPubBatch(ProxyLoanBillUnPubBatchReqDTO reqDTO);

    CommonResp<PageResp<ProxyLoanBillRespDTO, ProxyLoanBillSumRespDTO>> queryBillPage(ProxyLoanBillReqDTO reqDTO);

    CommonResp<PageResp<ProxyLoanBillPeriodRespDTO, ?>> queryBillPeriod(ProxyLoanBillPeriodReqDTO reqDTO);
}
