package com.dx.facade.operate.service;


import com.dx.entity.CommonResp;
import com.dx.facade.operate.entity.MerchantSysMsg;

/**
 * 系统消息配置
 * @author morman
 * @version 1.0.0
 */
public interface MerchantSysMsgRpcService {

    CommonResp<MerchantSysMsg> getSysMsg(Long merchantId, String k);

}
