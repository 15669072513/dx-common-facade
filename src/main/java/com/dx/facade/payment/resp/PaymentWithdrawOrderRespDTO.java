package com.dx.facade.payment.resp;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author orbit
 * @datetime 2023-07-28 18:40
 * @desc 信用盘提现请求返回DTO
 */
@Builder
@Data
public class PaymentWithdrawOrderRespDTO implements Serializable {

    /**
     * 提现订单号
     */
    private String orderNo;
    /**
     * 体现金额
     */
    private BigDecimal amount;
    /**
     * 客户端体现状态（app中展示用）
     */
    private Integer clientOrderStatus;
}
