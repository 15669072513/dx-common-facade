package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.member.proxy.req.*;
import com.dx.facade.member.proxy.resp.*;

import java.util.List;


/**
 *
 */
public interface ProxyLoanBillService {
    /**
     * 代理借款账单 for app
     * 第一条是未出账单，剩下的是历史账单时间倒序排列
     */
    CommonResp<PageResp<ProxyLoanBillAppRespDTO, ?>> queryProxyLoanBillAppPage(PageReq<ProxyLoanBillAppReqDTO> reqDTO);

    /**
     * 查询未读账单条数 for app
     */
    CommonResp<Integer> cntUnReadApp(ProxyLoanBillAppReqDTO reqDTO);

    /**
     * 更新已读账单 for app
     * @return 更新条数
     */
    CommonResp<Integer> updReadBillApp(ProxyLoanBillUpdReadAppReqDTO reqDTO);

    CommonResp<List<ProxyLoanBillUnPubBatchRespDTO>> queryUnPubBatch(ProxyLoanBillUnPubBatchReqDTO reqDTO);

    CommonResp<PageResp<ProxyLoanBillRespDTO, ProxyLoanBillSumRespDTO>> queryBillPage(ProxyLoanBillReqDTO reqDTO);

    CommonResp<PageResp<ProxyLoanBillPeriodRespDTO, ?>> queryBillPeriod(ProxyLoanBillPeriodReqDTO reqDTO);

    /**
     * 查询当前账期
     * @param reqDTO reqDTO
     * @return ProxyLoanBillPeriodRespDTO
     */
    CommonResp<ProxyLoanBillPeriodRespDTO> queryCurBillPeriod(ProxyLoanBillPeriodReqDTO reqDTO);
}
