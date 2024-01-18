package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.report.MemberRebateDataPersonReq;
import com.dx.facade.report.param.report.MemberRebateDataReq;
import com.dx.facade.report.resp.report.*;

public interface MemberRebateDataRpcService {

    CommonResp<PageResp<DwmMemberRebateDataRespDTO, Object>> queryMemberRebateData(MemberRebateDataReq var1);
    CommonResp<DwmMemberRebateDataTotalRespDTO> queryMemberRebateDataTotal(MemberRebateDataReq var1);
    CommonResp<DwmMemberRebatePersonDataReqDTO> queryMemberRebatePersonDetail(MemberRebateDataPersonReq var1);
}
