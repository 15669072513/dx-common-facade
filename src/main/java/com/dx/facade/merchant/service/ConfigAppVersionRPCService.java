package com.dx.facade.merchant.service;

import com.dx.facade.merchant.req.ConfigAppVersionQueryReqDTO;
import com.dx.facade.merchant.resp.ConfigAppVersionQueryRespDTO;

/**
 @title app版本更新检查 RPC接口
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-12 20:15:33
*/
public interface ConfigAppVersionRPCService {
	/**
	 * 根据版本号、终端类型、状态查询App版本信息
	 * 
	 * @param reqDTO
	 * @return
	 */
    public ConfigAppVersionQueryRespDTO loadAppVersion(ConfigAppVersionQueryReqDTO reqDTO);
}
