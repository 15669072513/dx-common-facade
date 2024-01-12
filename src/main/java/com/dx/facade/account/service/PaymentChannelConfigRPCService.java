package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.PaymentChannelConfigRespDTO;
import com.dx.facade.account.resp.PaymentMerchantConfigResp;

import java.util.List;

public interface PaymentChannelConfigRPCService {

    void changePaymentChannelConfig(AddPaymentChannelConfigReq addPaymentChannelConfigReq);

    PageResp<PaymentChannelConfigRespDTO, ?> queryPaymentChannelConfig(PageReq<QueryPaymentChannelConfigReq> pageReq);

    void updatePaymentChannelConfig(UpdatePaymentChannelConfigReq updatePaymentChannelConfigReq);

    /**
     * 会员/代理获取充值渠道列表
     * @param param
     * @return
     */
    List<PaymentMerchantConfigResp> getPaymentChannelListByUser(ClientPaymentChannelParamDTO param);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    CommonResp<PaymentChannelConfigRespDTO> getById(Long id);
}
