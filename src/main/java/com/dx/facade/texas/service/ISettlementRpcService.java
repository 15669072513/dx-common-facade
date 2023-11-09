package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.dto.DxSettlementDto;

public interface ISettlementRpcService {
    CommonResp<Integer> settlement(DxSettlementDto dxSettlementDto);
}
