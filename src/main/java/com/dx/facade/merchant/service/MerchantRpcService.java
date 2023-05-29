package com.dx.facade.merchant.service;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import com.dx.facade.merchant.req.QueryMerchantParam;
import com.dx.facade.merchant.resp.MerchantBaseInfoRespDTO;

/**
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

	@ApiModelProperty("根据商户名称获取商户基础信息")
	MerchantBaseInfoRespDTO getMerchantBaseInfoByName(String merchantName);
	/**
	 * 获取商户
	 * @param queryMerchantParam
	 * @return
	 */
	List<MerchantBaseInfoRespDTO> getMerchant(QueryMerchantParam queryMerchantParam);
	
}
