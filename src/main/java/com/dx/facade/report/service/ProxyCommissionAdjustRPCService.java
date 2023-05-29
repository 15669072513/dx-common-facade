package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.proxy.ProxyCommissionOperateRecordReqDTO;
import com.dx.facade.report.resp.proxycommission.ProxyCommissionAdjustRespDTO;
import com.dx.facade.report.resp.proxycommission.ProxyCommissionOperateRecordRespDTO;
import com.dx.facade.report.resp.proxycommission.ProxyCommissionOperateRecordSummerRespDTO;

/**
 * ProxyCommissionAdjustRPCService
 *
 * @author focus
 * @version 1.0.0
 * @since 2022年3月12日 下午2:00:00
 */
public interface ProxyCommissionAdjustRPCService {

    /**
     * 佣金管理 - 佣金加减操作列表
     */
    CommonResp<PageResp<ProxyCommissionAdjustRespDTO,?>> queryProxyCommissionAdjustList(PageReq<ProxyCommissionOperateRecordReqDTO> reqDTO) throws BizException;

    /**
     * 佣金管理 - 取消佣金/代付佣金操作记录列表
     */
    CommonResp<PageResp<ProxyCommissionOperateRecordRespDTO,?>> getProxyCommissionOperate(PageReq<ProxyCommissionOperateRecordReqDTO> reqDTO) throws BizException;

    /**
     * 佣金管理 - 佣金操作记录-总计
     */
    ProxyCommissionOperateRecordSummerRespDTO getProxyCommissionOperateTotal(ProxyCommissionOperateRecordReqDTO reqDTO) throws BizException;
}
