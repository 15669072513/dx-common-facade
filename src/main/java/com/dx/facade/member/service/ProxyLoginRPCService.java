package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.ProxyLoginParamDTO;

/**
 * 代理 业务RPC接口
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/5/11
 */
public interface ProxyLoginRPCService {

    /**
     * 登陆接口
     *
     * @param proxyLoginParam 登录参数
     * @return 代理对象
     * @throws Exception 业务异常
     */
    CommonResp<Boolean> proxyLogin(ProxyLoginParamDTO proxyLoginParam) throws BizException;
}
