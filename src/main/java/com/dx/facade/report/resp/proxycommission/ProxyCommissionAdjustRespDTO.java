package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ProxyCommissionAdjustRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2022年3月12日 下午2:00:00
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionAdjustRespDTO {

    /**
     * 佣金月份
     */
    @ApiModelProperty(value = "佣金月份")
    private Date commissionDate;

    /**
     * 币种
     */
    @ApiModelProperty(value = "币种")
    private String  currency;

    /**
     * 商户名称
     */
    @ApiModelProperty("商户名称")
    private String merchantName;

    /**
     * 付款-用户账号
     */
    @ApiModelProperty(value = "付款-用户账号")
    private String outUserName;

    /**
     * 收到佣金
     */
    @ApiModelProperty(value = "收到佣金")
    private BigDecimal receiveCommission;

    /**
     * 操作人账号
     */
    @ApiModelProperty(value = "操作人")
    private String operateName;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", hidden = true)
    private String createdAt;

    /**
     * 操作备注
     */
    @ApiModelProperty(value = "操作备注")
    private String auditDesc;

}
