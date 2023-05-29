package com.dx.facade.merchant.service;


import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.merchant.req.BannerPageAppParam;
import com.dx.facade.merchant.req.ConfigStartPageAppParam;
import com.dx.facade.merchant.resp.ConfigBannerAppResp;
import com.dx.facade.merchant.resp.ConfigStartPageAppResp;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author fitz
 * @version 1.0.0
 */
public interface BwConfigPublicRpcService {

	@ApiModelProperty(value="banner配置分页查询")
	CommonResp<List<ConfigBannerAppResp>> queryBannerAppList(BannerPageAppParam param) throws BizException;

	@ApiModelProperty(value="场馆图配置/APP闪屏页分页查询")
	CommonResp<List<ConfigStartPageAppResp>> queryStartAppList(ConfigStartPageAppParam param) throws BizException;



}
