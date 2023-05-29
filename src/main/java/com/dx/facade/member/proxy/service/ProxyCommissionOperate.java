package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.facade.member.proxy.po.ObProxyCommissionOperatePO;

/**
 @title 佣金操作记录
 @desc 佣金操作记录
 @path
 @author kygo
 @version 1.0.0
 @since 2022年01月27日
 */
public interface ProxyCommissionOperate {

    /**
     * @title 佣金操作记录
     * @desc
     * @author kygo
     * @version 1.0.0
     * @since 2022年01月27日
     * @param operate
     */
    CommonResp saveProxyCommissionOperate(ObProxyCommissionOperatePO operate);
}
