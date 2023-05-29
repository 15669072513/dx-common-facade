package com.dx.facade.merchant.service;


import com.dx.entity.CommonResp;
import com.dx.facade.merchant.dto.MerchantVenueRpcDTO;

import java.util.Map;

/**
 * 商户游戏
 * @author kygo
 * @version 1.0.0
 */
public interface MerchantRpcGames {
    CommonResp<Map<String, MerchantVenueRpcDTO>> getVunueByMerchantId(Long merchantId);
}
