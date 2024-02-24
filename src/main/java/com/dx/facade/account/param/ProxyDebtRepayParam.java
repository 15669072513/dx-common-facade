package com.dx.facade.account.param;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ProxyDebtRepayParam {

    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 商户名称
     */
    private String merchantName;
    /**
     * 用户ID(即会员ID或代理ID)
     */
    private Long userId;
    /**
     * 用户账号(即会员或代理账号)
     */
    private String userName;
    /**
     * 用户类型：0会员，1代理
     */
    private Integer userType;
    /**
     * 借还款记录类型：1借款，2还款
     */
    private Integer recordType;
    /**
     * 借还款金额
     */
    private BigDecimal amount;
    /**
     * 借还款货币
     */
    private String currency;
    /**
     * 借还款操作人
     */
    private String operator;

    /**
     * 备注
     */
    private String remark;
}
