package com.dx.facade.account.service;

import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.req.AddPaymentMerchantConfigReq;
import com.dx.facade.account.req.QueryPaymentMerchantConfigReq;
import com.dx.facade.account.req.UpdatePaymentMerchantConfigReq;
import com.dx.facade.account.resp.PaymentMerchantConfigResp;

import java.util.List;

public interface PaymentMerchantConfigRPCService {

    Boolean isDuplicate(String channelName);

    void addPaymentMerchantConfig(AddPaymentMerchantConfigReq addPaymentMerchantConfigReq);

    PaymentMerchantConfigResp queryPaymentMerchantConfigById(Long id);

    List<PaymentMerchantConfigResp> queryEnabledPaymentMerchantConfig(Integer paymentMerchantType);

    List<PaymentMerchantConfigResp> queryPaymentMerchantConfig(QueryPaymentMerchantConfigReq queryPaymentMerchantConfigReq);

    PageResp<PaymentMerchantConfigResp, ?> queryPaymentMerchantConfig(PageReq<QueryPaymentMerchantConfigReq> pageReq);

    void updatePaymentMerchantConfig(UpdatePaymentMerchantConfigReq updatePaymentMerchantConfigReq);
}
