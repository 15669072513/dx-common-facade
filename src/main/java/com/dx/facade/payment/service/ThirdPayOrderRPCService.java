package com.dx.facade.payment.service;

import com.dx.exception.BizException;
import com.dx.facade.account.resp.*;
import com.dx.facade.payment.resp.CallThirdWithdrawResp;

public interface ThirdPayOrderRPCService {

    /**
     * 调用三方支付查询基础汇率
     * @param config
     * @return
     * @throws BizException
     */
    JyBaseFreeDataRespDTO queryBaseFree(PaymentMerchantRespDTO config)throws BizException;


    /**
     * 调用三方支付查询基础汇率
     * @return
     * @throws BizException
     */
    JyBaseFreeDataRespDTO queryBaseFree()throws BizException;

    /**
     * 调用三方支付发起存款
     * @param order
     * @param config
     * @return
     * @throws BizException
     */
    SubmitPayRespDTO createDeposit(DepositOrderRespDTO order, PaymentMerchantRespDTO config, PaymentChannelRespDTO channel)throws BizException;

    /**
     * 调用三方支付发起提款
     * @param order
     * @return
     * @throws BizException
     */
    CallThirdWithdrawResp createWithdraw(WithdrawOrderRespDTO order, PaymentChannelRespDTO channel, PaymentMerchantRespDTO merchant) throws BizException;

}
