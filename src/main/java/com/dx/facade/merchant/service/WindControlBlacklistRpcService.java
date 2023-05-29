package com.dx.facade.merchant.service;



/**
 @title 风控黑名单RPC接口
 @desc 仅包含检测终端信息是否在黑名单，黑名单类型包含两种分别为：IP地址与设备号
 @path
 @author gollum
 @version 1.0.0
 @since
*/
public interface WindControlBlacklistRpcService {

    /**
     * 检测终端信息是否在黑名单中
     * @param merchantId 商户唯一标识
     * @param typeId 类型唯一标识，1，登录IP，2：注册IP，3：登录设备，4：注册设备
     * @param terminalInfo 终端信息。当type_id为1或2时记录IP地址，当type_id为3或4时记录设备Id
     * @return
     */
    public Boolean checkDuplicate( final Long merchantId, final Integer typeId, final String terminalInfo ) ;
}
