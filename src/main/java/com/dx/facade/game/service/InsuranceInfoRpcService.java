package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.InsuranceInfoListReq;
import com.dx.facade.game.resp.InsuranceInfoResp;
import com.dx.facade.texas.resp.InsureIsOursRecordResp;

import java.util.List;

public interface InsuranceInfoRpcService {

  CommonResp<PageResp<InsuranceInfoResp, Void>> getInsuranceInfoList(InsuranceInfoListReq req);

  CommonResp<List<InsureIsOursRecordResp>> getInsuranceInfoByTableId(Long tableId);

}
