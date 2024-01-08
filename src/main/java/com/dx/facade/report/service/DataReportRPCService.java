package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.report.MemberNetTopReq;
import com.dx.facade.report.param.report.ProxyTeamTopReq;
import com.dx.facade.report.resp.report.DwmMemberNetTopRspDTO;
import com.dx.facade.report.resp.report.DwmMemberNetTopTotalRspDTO;
import com.dx.facade.report.resp.report.DwmProxyTeamTopRspDTO;
import com.dx.facade.report.resp.report.DwmProxyTeamTopTotalRspDTO;

public interface DataReportRPCService {

    CommonResp<PageResp<DwmMemberNetTopRspDTO, Object>> queryMembersProfitAndLossTop(MemberNetTopReq var1);
    CommonResp<DwmMemberNetTopTotalRspDTO> queryMembersProfitAndLossTopTotal(MemberNetTopReq var1);
    CommonResp<PageResp<DwmProxyTeamTopRspDTO, Object>> queryAgencyTeamTop(ProxyTeamTopReq var1);
    CommonResp<DwmProxyTeamTopTotalRspDTO> queryAgencyTeamTopTotal(ProxyTeamTopReq var1);
}
