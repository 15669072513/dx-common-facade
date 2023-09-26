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
 * @datetime 2023-09-25 13:39
 * @desc 提现相关信息响应DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WithdrawInfoRespDTO implements Serializable {
    /**
     * 会员代理ID
     */
    private Long userId;
    /**
     * 用户类型:0-会员，1-代理
     */
    private Integer userType;
    /**
     * 可提现净资产
     */
    private BigDecimal withdrawAsset;
    /**
     * 今日提现次数
     */
    private Integer withdrawCountToday;
    /**
     * 每天最大提现次数
     */
    private Integer withdrawCountMaxToday;
    /**
     * 今日可用提现额度
     */
    private BigDecimal withdrawAvailableToday;
    /**
     * 当前取款限制类型
     */
    private Integer withdrawLimitType;
    /**
     * 剩余可提现金额
     */
    private BigDecimal withdrawRemainAmount;
    /**
     * 已完成有效流水
     */
    private BigDecimal completeBillAmount;
    /**
     * 所需有效流水
     */
    private BigDecimal validBillAmount;
    /**
     * 流水开始时间
     */
    private LocalDateTime billStartTime;

}
