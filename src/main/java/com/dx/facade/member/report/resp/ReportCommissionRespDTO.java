package com.dx.facade.member.report.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 下午17:02:54
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("佣金收付报表分页查询接口响应数据传输对象")
public class ReportCommissionRespDTO implements Serializable {

    /**
     * 代理Id
     */
    @ApiModelProperty(value = "代理Id", example = "597177528301953024")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    /**
     * 代理帐号
     */
    @ApiModelProperty(value = "代理帐号", example = "zale11")
    private String proxyAccount;

    /**
     * 代理类型，（1-正式，2-商务，3-置换）
     */
    @ApiModelProperty(value = "代理类型", example = "1")
    private Integer accountType;

    /**
     * 代理层级
     */
    @ApiModelProperty(value = "代理层级", example = "2")
    private String proxyLevelCaption;

    /**
     * 直属上级，parent_proxy_id
     */
    @ApiModelProperty(value = "直属上级", example = "zale111")
    private String parentProxyName;

    @ApiModelProperty(value = "顶级代理")
    private String topProxyName;

    @ApiModelProperty(value = "所属商户名称")
    private String merchantName;

    @ApiModelProperty(value = "顶级商户名称")
    private String topMerchantName;

    /**
     * 帐号状态
     * account_status
     */
    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定", example = "1")
    private Integer accountLockStatus;

    /**
     * 登录锁定状态
     * account_status
     */
    @ApiModelProperty(value = "登录锁定状态 0-未锁定 1-登录锁定", example = "1")
    private Integer loginLockStatus;

    /**
     * 实际收益
     * real_person_commission_amount
     */
    @ApiModelProperty(value = "实际收益", example = "1142.00")
    private BigDecimal realPersonCommissionAmount;

    /**
     * 应付佣金
     */
    @ApiModelProperty(value = "应付佣金", example = "1000.00")
    private BigDecimal payment;

    /**
     * 实付佣金
     */
    @ApiModelProperty(value = "实付佣金", example = "800.00")
    private BigDecimal realPCommission;

    /**
     * 剩余欠款
     * not_pay_amount
     */
    @ApiModelProperty(value = "剩余欠款", example = "200.00")
    private BigDecimal notPayAmount;

    /**
     * 应收佣金
     */
    @ApiModelProperty(value = "应收佣金", example = "2142.00")
    private BigDecimal paymentCommission;

    /**
     * 实收佣金
     */
    @ApiModelProperty(value = "实收佣金", example = "2142.00")
    private BigDecimal realRCommission;

    /**
     * 剩余未收
     * total_child_commission_amount
     */
    @ApiModelProperty(value = "剩余未收", example = "0.00")
    private BigDecimal totalChildCommissionAmount;

    @ApiModelProperty(value = "当前代理币种", example = "CNY")
    private String currency;
}
