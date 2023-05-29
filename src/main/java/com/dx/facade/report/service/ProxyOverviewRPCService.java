package com.dx.facade.report.service;

import com.dx.exception.BizException;
import com.dx.facade.common.chart.Option;
import com.dx.facade.report.param.proxyoverview.ProxyOverviewCompareDataReqDTO;
import com.dx.facade.report.resp.proxyoverview.ProxyOverviewPrimaryDataRespDTO;
import com.dx.facade.report.resp.proxyoverview.ProxyOverviewSubordinateMemberRespDTO;
import com.dx.facade.report.resp.proxyoverview.ProxyOverviewSubordinateProxyRespDTO;
import com.dx.facade.report.resp.proxyoverview.ProxyOverviewTotalCommissionRespDTO;

/**
 * 代理web预览rpc接口
 */
public interface ProxyOverviewRPCService {
    /**
     * 查询核心数据
     * @return
     */
    ProxyOverviewPrimaryDataRespDTO queryPrimaryData(Long proxyId, Long merchantId);

    /**
     * 查询对比数据
     * @return
     */
    Option queryCompareData(Long proxyId, Long merchantId, ProxyOverviewCompareDataReqDTO compareDataReqDTO) throws BizException;

    /**
     * 查询下级代理
     * @return
     */
    ProxyOverviewSubordinateProxyRespDTO querySubordinateProxy(Long proxyId, Long merchantId);

    /**
     * 查看累计返佣金
     * @return
     */
    ProxyOverviewTotalCommissionRespDTO queryTotalCommission(Long proxyId, Long merchantId);

    /**
     * 查询下级会员
     * @return
     */
    ProxyOverviewSubordinateMemberRespDTO querySubordinateMember(Long proxyId, Long merchantId);
}
