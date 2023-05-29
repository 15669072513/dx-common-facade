package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.proxycommission.ProxyCommissionBudgetReqDTO;
import com.dx.facade.report.param.proxycommission.ProxyCommissionHistoryReqDTO;
import com.dx.facade.report.resp.proxycommission.ProxyCommissionBudgetRespDTO;
import com.dx.facade.report.resp.proxycommission.ProxyCommissionHistoryRespDTO;

/**
 * ProxyCommissionManageService
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午2:36:03
 */
public interface ProxyCommissionManageRPCService {

    /**
     * 佣金管理 - 预期佣金列表
     *
     * @author focus
     * @since 2021年9月19日 下午2:30:58
     * @param reqDTO
     * @return CommonResp
     */
    CommonResp<PageResp<ProxyCommissionBudgetRespDTO, ProxyCommissionBudgetRespDTO>>
            monthCommissionBudget(PageReq<ProxyCommissionBudgetReqDTO> reqDTO);

    /**
     * 佣金管理 - 佣金历史列表
     *
     * @author focus
     * @since 2021年9月19日 下午2:30:58
     * @param reqDTO
     * @return CommonResp
     */
    CommonResp<PageResp<ProxyCommissionHistoryRespDTO, ProxyCommissionHistoryRespDTO>>
            commissionHistory(PageReq<ProxyCommissionHistoryReqDTO> reqDTO);

    /**
     * 代理web - 佣金历史列表
     *
     * @author kygo
     * @since 2022年05月07日
     * @param reqDTO
     * @return CommonResp
     */
    CommonResp<PageResp<ProxyCommissionHistoryRespDTO, ProxyCommissionHistoryRespDTO>>
    commissionAgentHistory(PageReq<ProxyCommissionHistoryReqDTO> reqDTO);
}
