package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.merchant.dto.MerchantVenueRpcDTO;
import com.dx.facade.merchant.req.ConfigAppVersionQueryReqDTO;
import com.dx.facade.merchant.resp.ConfigAppVersionQueryRespDTO;

import java.util.Map;

/**
 @title app版本更新检查 RPC接口
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-12 20:15:33
*/
public interface ConfigAppVersionRPCService {

    public ConfigAppVersionQueryRespDTO loadAppVersion(ConfigAppVersionQueryReqDTO reqDTO);
}
