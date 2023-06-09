package com.dx.facade.merchant.service;


import com.dx.entity.CommonResp;
import com.dx.facade.auth.entity.Kvconfig;
import com.dx.facade.auth.entity.PersonConfig;

import java.util.List;

/**
 * 商户个性化配置RPC服务
 * 
 * @author bicycle
 *
 */
public interface MerchantPersonRpcService {
	
	/**
	 * 根据商户id和key获取个性化配置值
	 * 
	 * @param merchantId
	 * @param k
	 * @return
	 */
    CommonResp<String> getValue(Long merchantId, String k);

    /**
     * 根据商户id和key列表获取个性化配置
     * 
     * @param merchantId
     * @param keys
     * @return
     */
    CommonResp<List<Kvconfig>> getValueList(Long merchantId, List<String> keys);
    
    /**
     * 根据key查询个性化配置
     * 
     * @param key
     * @return
     */
    CommonResp<List<PersonConfig>> getKValueList(String key);

}
