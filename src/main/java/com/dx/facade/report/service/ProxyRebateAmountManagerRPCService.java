package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.report.ProxyRebateShareReq;
import com.dx.facade.report.param.report.ProxyRebateTeamReq;
import com.dx.facade.report.resp.report.DwmCommissionProxyRebateShareDTO;
import com.dx.facade.report.resp.report.DwmProxyRebateShareRspDTO;
import com.dx.facade.report.resp.report.DwmProxyRebateTeamRspDTO;

import java.util.List;

public interface ProxyRebateAmountManagerRPCService {
    CommonResp<PageResp<DwmProxyRebateTeamRspDTO, ?>> listPageTeam(ProxyRebateTeamReq var1);
    CommonResp<List<DwmProxyRebateShareRspDTO>> queryShareDetail(ProxyRebateShareReq req);
    CommonResp<DwmCommissionProxyRebateShareDTO> queryProxyDetail(ProxyRebateShareReq req);
}
