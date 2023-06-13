package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.MerchantGameUrlRecordRespDTO;

/**
 * 商户游戏地址RPC服务
 * 
 * @author bicycle
 *
 */
public interface MerchantGameUrlRpcService {
	/**
	 * 根据商户id查询商户游戏地址信息
	 * 
	 * @param merchantId
	 * @return
	 */
    CommonResp<MerchantGameUrlRecordRespDTO> getMerchantGameUrl(Long merchantId);
}
