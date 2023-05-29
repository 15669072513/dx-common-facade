package com.dx.facade.account.service;

import java.util.List;

import com.dx.facade.account.req.QueryVirtualRateConfigReq;
import com.dx.facade.account.req.UpdateVirtualRateConfigReq;
import com.dx.facade.account.resp.VirtualRateConfigResp;

public interface VirtualRateConfigRPCService {

    List<VirtualRateConfigResp> queryVirtualRateConfig(List<Long> merchantIdList);

    void updateVirtualRateConfig(UpdateVirtualRateConfigReq updateVirtualRateConfigReq);

    List<VirtualRateConfigResp> getVirtualRateConfig(QueryVirtualRateConfigReq queryVirtualRateConfigReq);
}
