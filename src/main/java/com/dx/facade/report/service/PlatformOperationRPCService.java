package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.report.MemberNetTopReq;
import com.dx.facade.report.param.report.PlatformOperationReq;
import com.dx.facade.report.param.report.ProxyTeamTopReq;
import com.dx.facade.report.param.report.profitandloss.ProfitPlatformThirdReqDTO;
import com.dx.facade.report.resp.DwmPlatformThirdRspDTO;
import com.dx.facade.report.resp.report.*;

public interface PlatformOperationRPCService {

    CommonResp<PageResp<DwmPlatformOperationRspDTO, DwmPlatformOperationSummaryRspDTO>> listPage(PlatformOperationReq var1);
    CommonResp<DwmPlatformOperationSummaryRspDTO> summary(PlatformOperationReq var1);

    CommonResp<PageResp<DwmPlatformThirdRspDTO, DwmPlatformThirdRspDTO>> thirdListPage(ProfitPlatformThirdReqDTO reqDTO);

    CommonResp<DwmPlatformThirdRspDTO> thirdSummary(ProfitPlatformThirdReqDTO reqDTO);
}
