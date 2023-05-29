package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.agent.*;

/**
 * 代理系统-代理佣金
 *
 * @author kygo
 * @version 1.0.0
 * @since 2022.04.14
 */
public interface AgentProxyCommissionService {
    /**
     * 查询个人历史佣金
     *
     * @author carlos
     * @version 1.0.0
     * @since 2022.04.14
     */
    ProxyCommissionReportDTO proxyCommissionReport(ProxyCommissionReqDTO proxyCommissionReq);

    /**
     * 查询个人预估佣金
     * @param proxyCommissionReq
     * @return
     */
    ProxyCommissionReportDTO proxyCommissionBudgetReport(ProxyCommissionReqDTO proxyCommissionReq);

    /**
     * 查询个人和直属下级历史佣金
     *
     * @author kygo
     * @version 1.0.0
     * @since 2022.04.14
     */
    CommonResp<PageResp<ProxyCommissionListDTO, ProxyCommissionPaymentTotalDTO>> proxyCommissionList(PageReq<ProxyCommissionReqDTO> req);

    /**
     * 查询个人和直属下级预估佣金
     *
     * @author kygo
     * @version 1.0.0
     * @since 2022.04.14
     */
    CommonResp<PageResp<ProxyCommissionListDTO, ProxyCommissionPaymentTotalDTO>> proxyCommissionBudgetList(PageReq<ProxyCommissionReqDTO> req);



    /**
     * 代理自己的下级代理佣金信息
     *
     * @author kygo
     * @version 1.0.0
     * @since 2022.04.14
     */
    CommonResp<ProxyCommissionPaymentTotalDTO> proxyCommissionListLock(ProxyCommissionLockReqDTO req);

    /**
     * 已收/未收
     *
     * @author kygo
     * @version 1.0.0
     * @since 2022.04.14
     */
    ProxyCommissionReciveTotalDTO childProxyReceiveTotal(ProxyCommissionPaymentReqDTO req);

    /**
     * 已付/未付
     *
     * @author kygo
     * @version 1.0.0
     * @since 2022.04.14
     */
    ProxyCommissionPayTotalDTO childProxyPayedTotal(ProxyCommissionPaymentReqDTO req);

}
