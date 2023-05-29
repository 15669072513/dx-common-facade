package com.dx.facade.merchant.service;


import com.dx.entity.CommonResp;
import com.dx.facade.auth.entity.Kvconfig;
import com.dx.facade.auth.entity.PersonConfig;

import java.util.List;

/**
 * 商户个性化配置
 * @author Yinter
 * @version 1.0.0
 */
public interface MerchantPersonRpcService {

    CommonResp<String> getValue(Long merchantId, String k);

    CommonResp<List<Kvconfig>> getValueList(Long merchantId, List<String> keys);

    CommonResp<List<PersonConfig>> getKValueList(String key);

}
