package com.dx.facade.account.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author orbit
 * @datetime 2023-09-15 21:22
 * @desc 批量查询结果DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchWalletAmountRespDTO implements Serializable {
    /**
     * 会员ID
     */
    private Long userId;
    /**
     * 会员现金余额
     */
    private BigDecimal memberCash;
    /**
     * 会员可用额度
     */
    private BigDecimal memberCreditAvailable;
    /**
     * 会员信用额度（总额）
     */
    private BigDecimal memberCreditTotal;
    /**
     * 代理现金余额
     */
    private BigDecimal proxyCash;
    /**
     * 代理可用额度
     */
    private BigDecimal proxyCreditAvailable;
    /**
     * 代理信用额度（总额）
     */
    private BigDecimal proxyCreditTotal;
}
