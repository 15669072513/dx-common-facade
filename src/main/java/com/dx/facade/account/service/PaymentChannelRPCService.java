package com.dx.facade.account.service;

import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.PaymentChannelConfigRespDTO;
import com.dx.facade.account.resp.PaymentChannelListRespDTO;
import com.dx.facade.account.resp.PaymentChannelRespDTO;
import com.dx.facade.account.resp.PaymentMerchantConfigResp;

import java.util.List;

public interface PaymentChannelRPCService {

    void changePaymentChannelConfig(MerchantPaymentChannelAddReqDTO addPaymentChannelConfigReq);

    PageResp<PaymentChannelListRespDTO, ?> queryPaymentChannelConfig(PageReq<QueryPaymentMerchantConfigReq> pageReq);

    void updatePaymentChannelConfig(MerchantPaymentChannelUpdateReqDTO updatePaymentChannelConfigReq);

    /**
     * 会员/代理获取充值渠道列表
     * @param param
     * @return
     */
    List<PaymentChannelRespDTO> getPaymentChannelListByUser(ClientPaymentChannelParamDTO param);

    /**
     * 根据id获取通道信息
     * @param
     * @return
     */
    PaymentChannelRespDTO getPaymentChannelById(Long id);

    Boolean isDuplicate(String channelName,Long merchantId,Integer type);
}
