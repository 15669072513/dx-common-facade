package com.dx.facade.merchant.service;


import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.MerchantCustomerRecordRespDTO;
/**
 * 商户客服信息RPC服务
 * 
 * @author bicycle
 *
 */
public interface MerchantCustomerRpcService {
	/**
	 * 根据商户id查询商户客服信息
	 * 
	 * @param merchantId
	 * @return
	 */
    CommonResp<MerchantCustomerRecordRespDTO> getMerchantCustomer(Long merchantId);
}
