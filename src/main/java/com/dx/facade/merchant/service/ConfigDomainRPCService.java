package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.merchant.req.ConfigDomainQueryReqDTO;
import com.dx.facade.merchant.resp.ConfigDomainQueryRespDTO;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-11-14 11:20:11
*/
public interface ConfigDomainRPCService {

    /**
     * 分页查询域名
     * @param reqDTO
     * @return
     */
    public CommonResp<PageResp<ConfigDomainQueryRespDTO, ?>> query4Page(final ConfigDomainQueryReqDTO reqDTO) throws BizException;

}
