package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.MerchantGameUrlRecordRespDTO;

/**
 * 包网商户初代配置表 服务实现类
 */
public interface MerchantGameUrlRpcService {
    CommonResp<MerchantGameUrlRecordRespDTO> getMerchantGameUrl(Long merchantId);
}
