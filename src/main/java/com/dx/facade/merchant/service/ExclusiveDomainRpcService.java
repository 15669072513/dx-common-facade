package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.ExclusiveDomainResp;

import java.util.List;

public interface ExclusiveDomainRpcService {
    CommonResp<List<ExclusiveDomainResp>> queryDomainList(Long merchantId, String proxyName, String joinCode);
}
