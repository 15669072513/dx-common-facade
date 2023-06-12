package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.req.ClubParamConfigQueryReqDTO;
import com.dx.facade.merchant.resp.ClubParamConfigQueryRespDTO;

/**
 * 俱乐部相关RPC接口
 * 
 * @author bicycle
 *
 */
public interface ClubRPCService {
	/**
	 * 查询俱乐部参数配置
	 * 
	 * @param param
	 * @return
	 */
	 CommonResp<ClubParamConfigQueryRespDTO> getClubParamConfig(ClubParamConfigQueryReqDTO param);
}
