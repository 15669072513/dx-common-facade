package com.dx.facade.merchant.service;


import com.dx.facade.merchant.resp.ProxyLevelConfRespDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * 代理等级RPC服务
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/10/05
 */
public interface ProxyLevelConfigRpcService {
	
	/**
	 * 获取代理层级信息
	 *
	 * @param id 代理层级ID
	 * @return 代理层级信息
	 */
	@ApiModelProperty("通过ID获取代理层级信息")
	ProxyLevelConfRespDTO getProxyLevelConfById(Long id);
	
}
