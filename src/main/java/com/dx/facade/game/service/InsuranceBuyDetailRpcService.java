package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.InsuranceBuyDetailListReq;
import com.dx.facade.game.resp.InsuranceInfoBuyDetailResp;

public interface InsuranceBuyDetailRpcService {

  CommonResp<InsuranceInfoBuyDetailResp> getInsuranceBuyDetailList(InsuranceBuyDetailListReq req);
}
