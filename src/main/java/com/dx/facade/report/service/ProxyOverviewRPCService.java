package com.dx.facade.report.service;

import com.dx.exception.BizException;
import com.dx.facade.common.chart.Option;
import com.dx.facade.report.param.proxyoverview.ProxyOverviewCompareDataReqDTO;
import com.dx.facade.report.param.proxyoverview.ProxyOverviewCompareNewDataReqDTO;
import com.dx.facade.report.resp.proxyoverview.*;

public interface ProxyOverviewRPCService {
    ProxyOverviewPrimaryDataRespDTO queryPrimaryData(Long var1, Long var2);

    Option queryCompareData(Long var1, Long var2, ProxyOverviewCompareDataReqDTO var3) throws BizException;

    Option queryCompareDataNew(Long var1, Long var2, ProxyOverviewCompareNewDataReqDTO var3) throws BizException;

    ProxyOverviewSubordinateProxyRespDTO querySubordinateProxy(Long var1, Long var2);

    ProxyOverviewTotalCommissionRespDTO queryTotalCommission(Long var1, Long var2);

    ProxyOverviewSubordinateMemberRespDTO querySubordinateMember(Long var1, Long var2);

    ProxyOverviewMainDataRespDTO queryMainData(Long proxyId, Long merchantId, ProxyOverviewMainDataRespDTO param);
}
