package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.venue.req.DxSettleDetailReq;
import com.dx.facade.venue.resp.DxSettleDetailResp;

public interface IDxSettleDetailService {
    CommonResp<PageResp<DxSettleDetailResp, Void>> listPage(DxSettleDetailReq req);
}
