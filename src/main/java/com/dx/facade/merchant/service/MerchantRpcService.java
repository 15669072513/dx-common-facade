package com.dx.facade.merchant.service;

import com.dx.facade.merchant.dto.MerchantDTO;
import com.dx.facade.merchant.req.QueryMerchantParam;
import com.dx.facade.merchant.resp.MerchantBaseInfoRespDTO;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 商户RPC服务
 * 
 * @author fitz
 * @version 1.0.0
 */
public interface MerchantRpcService {
	
	/**
	 * 根据商户ID获取商户基础信息
	 *
	 * @param id 商户ID
	 * @return 商户基础信息
	 */
	@ApiModelProperty("根据商户ID获取商户基础信息")
	MerchantBaseInfoRespDTO getMerchantBaseInfoById(Long id);
	
	/**
	 * 根据商户名称获取商户基础信息
	 * 
	 * @param merchantName
	 * @return
	 */
	@ApiModelProperty("根据商户名称获取商户基础信息")
	MerchantBaseInfoRespDTO getMerchantBaseInfoByName(String merchantName);
	
	/**
	 * 根据商户id、商户编码、商户名称查询商户基础信息
	 * 
	 * @param queryMerchantParam
	 * @return
	 */
	List<MerchantBaseInfoRespDTO> getMerchant(QueryMerchantParam queryMerchantParam);

	/**
	 *  根据ID查询商户信息
	 * @param id
	 * @return
	 */
	MerchantDTO getByMerchantId(Long id);
	List<MerchantDTO> getByMerchantIds(List<Long> merchantIds);
}
