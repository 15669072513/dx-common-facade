package com.dx.facade.report.service;

import com.dx.facade.report.resp.proxyoverview.ProxyOverviewPrimaryDataRespDTO;

public interface ProxyOverviewRPCService {
    ProxyOverviewPrimaryDataRespDTO queryPrimaryData(Long var1, Long var2);

//    Option queryCompareData(Long var1, Long var2, ProxyOverviewCompareDataReqDTO var3) throws BizException;
//
//    ProxyOverviewSubordinateProxyRespDTO querySubordinateProxy(Long var1, Long var2);
//
//    ProxyOverviewTotalCommissionRespDTO queryTotalCommission(Long var1, Long var2);
//
//    ProxyOverviewSubordinateMemberRespDTO querySubordinateMember(Long var1, Long var2);
}
