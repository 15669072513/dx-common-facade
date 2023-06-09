package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.ExclusiveDomainResp;

import java.util.List;

public interface ExclusiveDomainRpcService {
	/**
	 * 根据代理名称、合营码查询代理专属域名
	 * 
	 * @param merchantId
	 * @param proxyName
	 * @param joinCode
	 * @return
	 */
    CommonResp<List<ExclusiveDomainResp>> queryDomainList(Long merchantId, String proxyName, String joinCode);
}
