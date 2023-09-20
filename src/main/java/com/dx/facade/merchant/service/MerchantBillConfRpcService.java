package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.ProxyLoanBillConfResp;

/**
 *账单配置RPC接口
 * 
 * @author bicycle
 *
 */
public interface MerchantBillConfRpcService {
	/**
	 * 账单配置RPC接口
	 * 
	 * @return
	 */
	 CommonResp<ProxyLoanBillConfResp> proxyLoanBillConfQuery();
}
