package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.MerchantConfigRecordRespDTO;

/**
 * 商户初始代理配置RPC服务
 * 
 * @author bicycle
 *
 */
public interface MerchantConfigRpcService {
	
	/**
	 * 根据商户id查询商户初始代理配置
	 * 
	 * @param merchantId
	 * @return
	 */
    CommonResp<MerchantConfigRecordRespDTO> getMerchantConfig(Long merchantId);
}
