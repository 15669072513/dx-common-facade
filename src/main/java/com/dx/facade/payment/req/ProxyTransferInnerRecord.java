package com.dx.facade.payment.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 代理自身账号余额转账记录表
 * </p>
 *
 * @author agan
 * @since 2021-06-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyTransferInnerRecord {

    /**
     * id
     */
    private Long id;

    /**
     * 单号
     */
    private String orderNo;

    /**
     * 商户id
     */
    private Long merchantId;

    /**
     * 代理id
     */
    private Long proxyId;

    /**
     * 代理账号
     */
    private String proxyName;

    /**
     * 代理真实姓名
     */
    private String realName;

    /**
     * 风控层级名称
     */
    private String windControlName;

    /**
     * 状态(0=待处理 1=成功 2=失败)
     */
    private Integer orderStatus;

    /**
     * 转账金额
     */
    private BigDecimal amount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 完成时间
     */
    private LocalDateTime payoutTime;


}
