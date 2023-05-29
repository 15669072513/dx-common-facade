package com.dx.facade.member.proxy.service;

import com.dx.exception.BizException;
import com.dx.facade.member.proxy.resp.ProxyMemberPeopleNumByMerchantRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 代理商户相关 业务RPC接口
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/5/11
 */
public interface ProxyMerchantInfoRpcService {
	
	
	/**
	 * 根据商户ids获取商户下所有代理、会员人数
	 *
	 * @param ids 商户ids
	 * @return 代理、会员人数
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty(value = "新增非总代")
	List<ProxyMemberPeopleNumByMerchantRespDTO> getProxyMemberPeopleNumByMerchantIds(List<Long> ids) throws BizException;
	
	
}
