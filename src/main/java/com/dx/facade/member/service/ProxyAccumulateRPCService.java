package com.dx.facade.member.service;


import com.dx.exception.BizException;
import com.dx.facade.member.param.ProxyAccumulateParamDTO;
import io.swagger.annotations.ApiModelProperty;

/**
 * 代理财务信息-v2 业务RPC接口
 */
public interface ProxyAccumulateRPCService {
	

	/**
	 * 新增或更新代理财务信息
	 *
	 * @param reqDto 新增更新代理财务信息入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("新增或更新代理财务信息")
    boolean insertOrUpdate(ProxyAccumulateParamDTO reqDto) throws BizException;

	/**
	 * 通过代理id获取代理财务信息
	 *
	 * @param proxyId 代理id
	 * @return 代理财务信息
	 */
	@ApiModelProperty("通过代理id获取代理财务信息")
	ProxyAccumulateParamDTO selectByProxyId(Long proxyId);
}
