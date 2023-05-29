package com.dx.facade.proxy.service;


import com.dx.entity.CommonResp;

import com.dx.entity.PageResp;
import com.dx.facade.proxy.req.SelectProxyDomainInfoReqDTO;
import com.dx.facade.proxy.req.SelectProxyDomainReqDTO;
import com.dx.facade.proxy.resp.SelectProxyDomainRespDTO;

import java.util.List;

/**
 @title 相关相关接口
 @desc 代理推广链接接口
 @path
 @author kygo
 @version 1.0.0
 @since
 */
public interface PromoteDomainRpcService {
    public CommonResp<List<SelectProxyDomainRespDTO>> selectProxyDomainApp(SelectProxyDomainInfoReqDTO dto);

    CommonResp<PageResp<SelectProxyDomainRespDTO, ?>> selectProxyDomain(SelectProxyDomainReqDTO var1);

    CommonResp<SelectProxyDomainRespDTO> newProxyDomain(SelectProxyDomainReqDTO dto);
}
