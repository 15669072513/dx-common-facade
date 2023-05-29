package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.proxy.req.*;
import com.dx.facade.member.proxy.resp.AddProxyAuditRecordRespDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * 代理 业务RPC接口
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/5/11
 */
public interface ProxyNewAddAndAuthRpcService {
	
	
	/**
	 * 新增非总代
	 *
	 * @param reqDTO 新增非总代入参
	 * @return 返回信息
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty(value = "新增非总代")
	CommonResp<String> addUnGeneralProxy(AddUnGeneralProxyReqDTO reqDTO) throws BizException;
	
	/**
	 * 新增总代
	 *
	 * @param reqDTO 新增总代参数
	 * @return 审核单号
	 * @throws BizException 异常
	 */
	@ApiModelProperty(value = "新增总代")
	CommonResp<String> addGeneralProxy(AddGeneralProxyReqDTO reqDTO) throws BizException;
	
	
	/**
	 * 新增代理审核记录分页查询
	 *
	 * @param pageReq 新增代理审核记录分页查询入参
	 * @return 审核记录
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty(value = "新增代理审核记录分页查询")
	CommonResp<PageResp<AddProxyAuditRecordRespDTO, Void>> selectAddProxyAuthPageList(PageReq<AddProxyAuditRecordReqDTO> pageReq) throws BizException;
	
	
	/**
	 * 锁单&解锁新增代理审核记录
	 *
	 * @param reqDTO 锁单 入参
	 * @return 受影响行数
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty(value = "锁单&解锁新增代理审核记录")
	CommonResp<Boolean> lockProxyAuditRecord(LockProxyAuditRecordReqDTO reqDTO) throws BizException;
	
	/**
	 * 审核新增代理审核记录
	 *
	 * @param reqDTO 审核新增代理审核记录
	 * @return 受影响行数
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty(value = "审核新增代理审核记录")
	CommonResp<Boolean> auditProxyAuditRecord(AuthProxyAuditRecordReqDTO reqDTO) throws BizException;
	
	/**
	 * App端 新增下级代理
	 *
	 * @param reqDTO 新增下级代理参数
	 * @return 信息
	 * @throws BizException 异常
	 */
	@ApiModelProperty(value = "App端 新增下级代理")
	CommonResp<String> addLowerProxyFromApp(AddLowerProxyReqDTO reqDTO) throws BizException;
	
	
	/**
	 * 新增代理维护 代理契约ID
	 *
	 * @param reqDTO 代理ID
	 * @throws BizException 异常
	 */
	@ApiModelProperty(value = "新增代理维护 代理契约ID")
	void setContractIdByProxyId(SetProxyContractIdReqDTO reqDTO) throws BizException;
	
	/**
	 * 新增代理审核待办数量
	 *
	 * @param path 商戶路径
	 * @return 待办数量
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty(value = "新增代理审核待办数量")
	Integer getPendingCount(String path) throws BizException;
	
}
