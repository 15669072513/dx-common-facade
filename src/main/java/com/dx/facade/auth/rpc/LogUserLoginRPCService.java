package com.dx.facade.auth.rpc;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.auth.pojo.req.LogUserLoginQueryReqDTO;
import com.dx.facade.auth.pojo.resp.LogUserLoginQueryRespDTO;

/**
 @title 登录记录RPC业务接口
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-08 17:04:01
*/
public interface LogUserLoginRPCService {

    /**
     * 分页查询登录记录
     * @param reqDTO
     * @return
     */
    public CommonResp<PageResp<LogUserLoginQueryRespDTO, ?>> query4Page(LogUserLoginQueryReqDTO reqDTO);
}
