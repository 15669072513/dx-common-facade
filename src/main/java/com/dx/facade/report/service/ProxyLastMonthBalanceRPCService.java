package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.facade.report.param.report.DwmProxyLastMonthBalanceReq;
import com.dx.facade.report.resp.report.DwmProxyLastMonthBalanceResqDTO;

public interface ProxyLastMonthBalanceRPCService {

    CommonResp<DwmProxyLastMonthBalanceResqDTO> queryProxyLastMonthBalance (DwmProxyLastMonthBalanceReq var1);
    CommonResp updateProxyLastMonthBalance (DwmProxyLastMonthBalanceReq var1);
}
