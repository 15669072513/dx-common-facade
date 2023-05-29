package com.dx.facade.merchant.service;


import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.MerchantCustomerRecordRespDTO;

public interface MerchantCustomerRpcService {
    CommonResp<MerchantCustomerRecordRespDTO> getMerchantCustomer(Long merchantId);
}
