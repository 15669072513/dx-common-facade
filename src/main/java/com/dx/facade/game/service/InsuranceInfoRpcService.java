package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.InsuranceInfoListReq;
import com.dx.facade.game.resp.InsuranceInfoResp;

public interface InsuranceInfoRpcService {

  CommonResp<PageResp<InsuranceInfoResp, ?>> getInsuranceInfoList(InsuranceInfoListReq req);
}
