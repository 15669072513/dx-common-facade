package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.report.MemberNetTopReq;
import com.dx.facade.report.param.report.ProxyTeamTopReq;
import com.dx.facade.report.resp.report.*;

public interface DataReportRPCService {

    CommonResp<PageResp<DwmMemberNetTopRspDTO, Object>> queryMembersProfitAndLossTop(MemberNetTopReq var1);
    CommonResp<DwmMemberNetTopTotalRsp> queryMembersProfitAndLossTopTotal(MemberNetTopReq var1);
    CommonResp<PageResp<DwmProxyTeamTopRspDTO, Object>> queryAgencyTeamTop(ProxyTeamTopReq var1);
    CommonResp<DwmProxyTeamTopTotalRsp> queryAgencyTeamTopTotal(ProxyTeamTopReq var1);
}
