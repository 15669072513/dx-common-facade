package com.dx.facade.merchant.service;

import com.dx.exception.BizException;

/**
 @title 活动会员域名配置RPC接口
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2023-04-12 16:49:37
*/
public interface ConfigMemberDomainRPCService {

    /**
     * 根据会员id获取一个带有邀请码的域名
     * @param userId
     * @return
     */
    public String getRandOne(final Long userId) throws BizException;
}
