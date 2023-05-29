package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.MerchantConfigRecordRespDTO;

/**
 * 包网商户初代配置表 服务实现类
 */
public interface MerchantConfigRpcService {
    CommonResp<MerchantConfigRecordRespDTO> getMerchantConfig(Long merchantId);
}
