package com.dx.facade.account.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author orbit
 * @datetime 2023-09-02 14:30
 * @desc 实时账单
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealtimeBillRespDTO implements Serializable {
    /**
     * 快照时间
     */
    private LocalDateTime snapshotTime;
    /**
     * 净资产
     */
    private BigDecimal netAsset;
    /**
     * 应还账款
     */
    private BigDecimal shouldRepay;
    /**
     * 可提现额
     */
    private BigDecimal withdrawAmount;
    /**
     * 中心钱包余额
     */
    private BigDecimal cashAvailable;
    /**
     * 信用余额
     */
    private BigDecimal creditAvailable;
    /**
     * 信用额度
     */
    private BigDecimal creditTotal;

    /**
     * 币种
     */
    private String currency;
}
