package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.dto.DxSettleDetailDto;
import com.dx.facade.texas.req.DxSettleDetailReq;

public interface IDxSettleDetailService {
    CommonResp<DxSettleDetailDto> selectSettleDetails(DxSettleDetailReq req);
}
