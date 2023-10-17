package com.dx.facade.member.service;


import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.ProxyFinanceParamDTO;
import com.dx.facade.member.resp.ProxyFinanceRespDTO;
import com.dx.facade.report.param.proxy.ProxyDayReportReqDTO;

import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 代理财务信息 业务RPC接口
 */
public interface ProxyFinanceRPCService {
	
	
	/**
	 * 新增或更新代理财务信息
	 *
	 * @param reqDto 新增更新代理财务信息入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("新增或更新代理财务信息")
    boolean insertOrUpdate(ProxyFinanceParamDTO reqDto) throws BizException;
	/**
	 * 通过代理id获取代理财务信息
	 *
	 * @param proxyId 代理id
	 * @return 代理财务信息
	 */
	@ApiModelProperty("通过代理id获取代理财务信息")
	ProxyFinanceRespDTO selectByProxyId(Long proxyId);

	/**
	 * 通过代理id集合获取代理财务信息
	 *
	 * @param proxyId 代理id
	 * @return 代理财务信息
	 */
	@ApiModelProperty("通过代理id获取代理财务信息")
	List<ProxyFinanceRespDTO> selectListByProxyId(List<Long> proxyId);

	/**
	 * 根据累计获取佣金范围或者累计返点范围查询代理集合
	 *
	 * @param record 代理ID
	 * @param suffix 分表前缀
	 * @return 代理财务信息
	 */
	CommonResp<List<Long>> selectByTotalReceive(@Param("record") ProxyDayReportReqDTO record, @Param("suffix") Long suffix);
}
