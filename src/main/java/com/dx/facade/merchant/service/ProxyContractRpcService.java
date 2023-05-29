package com.dx.facade.merchant.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.proxy.resp.ProxyResp;
import com.dx.facade.merchant.req.*;
import com.dx.facade.merchant.resp.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * 代理契约 业务RPC接口
 *
 * @author yinter
 * @version 1.0.0
 * @date 2021/9/23
 */
public interface ProxyContractRpcService {
	
	
	/**
	 * 代理个人契约-查询
	 *
	 * @param reqDto 代理个人契约-查询入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("代理个人契约-查询")
	CommonResp<List<ProxyContractRespDTO>> myContract(MyContractReqDTO reqDto) throws BizException;
	
	
	/**
	 * 契约管理-查询
	 *
	 * @param reqDto 契约管理-查询入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("契约管理-查询")
	CommonResp<List<ProxyContractRespDTO>> contractManageList(ContractManageReqDTO reqDto) throws BizException;
	
	/**
	 * 契约管理-查询
	 *
	 * @param reqDto 契约管理-查询入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("契约管理web-查询")
	CommonResp<PageResp<ProxyContractRespDTO, ?>> contractManageWebList(ContractManageWebReqDTO reqDto) throws BizException;
	
	/**
	 * 下级代理无契约-查询
	 *
	 * @param reqDto 下级代理无契约-查询入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("下级代理无契约-查询")
	CommonResp<List<ProxyResp>> noLowerContract(ContractManageReqDTO reqDto) throws BizException;
	
	/**
	 * 根据代理账号查询直属代理ID
	 *
	 * @param reqDto 查询入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	CommonResp<List<Long>> selectDirectlyProxyIds(ContractManageReqDTO reqDto) throws BizException;
	
	/**
	 * 接受契约
	 *
	 * @param reqDto
	 * @return
	 * @throws BizException 异常
	 */
	@ApiModelProperty("接受契约")
	Integer acceptContract(ContractReqDTO reqDto) throws BizException;
	
	/**
	 * 更新契约
	 *
	 * @param reqDto
	 * @return
	 * @throws BizException 异常
	 */
	@ApiModelProperty("更新契约")
	Integer addContract(ProxyContractAddReqDTO reqDto) throws BizException;
	
	/**
	 * 代理校验
	 *
	 * @param reqDTO
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiOperation(value = "代理校验")
	public CommonResp<ContractStatusRespDTO> checkProxy(QueryProxyByNameReqDTO reqDTO) throws BizException;
	
	
	/**
	 * 下级代理签订的契约-查询
	 *
	 * @param reqDto 下级代理签订的契约-查询入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("下级代理签订的契约-查询")
	CommonResp<List<ProxyContractRespDTO>> subAgentContract(SubProxyContractReqDTO reqDto) throws BizException;
	
	/**
	 * 查询最低契约比例
	 *
	 * @param reqDto 查询最低契约比例-入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("查询最低契约比例")
	CommonResp<List<MinContractConfigRespDTO>> lowestContractProportion(ProxyContractReqDTO reqDto) throws BizException;
	
	/**
	 * 查询契约规则
	 *
	 * @param reqDto 查询契约规则-入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("查询契约规则")
	CommonResp<List<ContractDetailRespDTO>> contractRule(ProxyRebateQueryParam reqDto) throws BizException;
	
	
	/**
	 * 代理详情-佣金契约&返点契约-查询
	 *
	 * @param reqDto 代理详情-佣金契约&返点契约-查询-查询入参
	 * @return 契约详情
	 * @throws BizException 异常
	 */
	@ApiModelProperty("代理详情-佣金契约&返点契约-查询")
	CommonResp<MyContractRespDTO> getMyContractByContractId(MyContractByContractIdReqDTO reqDto) throws BizException;
	
	
	/**
	 * 是否存在待签约-查询
	 *
	 * @param reqDto 是否存在待签约-查询入参
	 * @return 受影响行数
	 * @throws BizException 异常
	 */
	@ApiModelProperty("是否存在待签约-查询")
	CommonResp<Boolean> contractToBeSigned(QueryProxyByNameReqDTO reqDto) throws BizException;
	
	
	/**
	 * 更新代理契约 effectStatus 生效状态 为 -1代理未审核 -1状态的在契约管理页面不可见  1已生效
	 *
	 * @param proxyId 更新代理契约生效状态
	 * @return 是否成功
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("更新代理契约生效状态")
	Boolean updateEffectStatusByProxyId(Long proxyId,Integer effectStatus) throws BizException;
	
	/**
	 * 新增总代拒绝后，清除契约信息
	 *
	 * @param proxyName 签约代理账号
	 */
	@ApiModelProperty("新增总代拒绝后，清除契约信息")
	void removeProxyContract(String proxyName);

	/**
	 * 获取代理拥有的契约
	 *
	 * @param proxyId 签约代理id
	 */
	@ApiModelProperty("获取代理拥有的契约")
	Integer getNewContractModel(Long proxyId);

}
