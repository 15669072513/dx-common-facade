package com.dx.facade.auth.rpc;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.auth.pojo.req.DelIpWhitelistReqDTO;
import com.dx.facade.auth.pojo.req.LoginIpWhitelistPageReqDTO;
import com.dx.facade.auth.pojo.req.SaveIpWhitelistReqDTO;
import com.dx.facade.auth.pojo.resp.LoginIpWhitelistPageRespDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * 用户登录IP白名单管理 RPC接口
 *
 * @author fitz
 */
public interface UserLoginIpWhitelistRpcService {
	
	
	/**
	 * 新增-用户登录IP白名单
	 *
	 * @param reqDto 新增用户登录IP白名单 入参
	 * @return 无返回数据
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("新增用户登录IP白名单")
	CommonResp<Void> saveIpWhitelist(SaveIpWhitelistReqDTO reqDto) throws BizException;
	
	/**
	 * 删除用户登录IP白名单
	 *
	 * @param reqDTO 删除用户登录IP白名单 入参
	 * @return 无返回数据
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("删除用户登录IP白名单")
	CommonResp<Void> delIpWhitelist(DelIpWhitelistReqDTO reqDTO) throws BizException;
	
	
	/**
	 * 登录IP白名单分页查询
	 *
	 * @param reqDTO 登录IP白名单分页查询 入参
	 * @return 登录IP白名单分页查询 集合
	 */
	@ApiModelProperty("登录IP白名单分页查询")
	CommonResp<PageResp<LoginIpWhitelistPageRespDTO, Void>> selectLoginIpWhitelistPage(LoginIpWhitelistPageReqDTO reqDTO);
	
	
}
