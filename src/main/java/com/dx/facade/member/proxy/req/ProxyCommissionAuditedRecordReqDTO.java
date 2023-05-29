package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.dx.facade.report.param.base.MultiplyMerchantLocalDateReq;

/**
 * 资金->资金审核记录->佣金审核记录reqdto
 *
 * @author kygo
 * @version 1.0.0
 * @since 2021.9.23
 */
@Data
public class ProxyCommissionAuditedRecordReqDTO extends MultiplyMerchantLocalDateReq {

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value="佣金开始月份，格式：yyyyMM")
    private Integer startMonth;

    @ApiModelProperty(value="佣金结束月份，格式：yyyyMM")
    private Integer endMonth;

    @ApiModelProperty(value="总代理账号")
    private String topProxyName;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 3-二审通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "团队佣金最小值")
    private BigDecimal teamCommissionMin;

    @ApiModelProperty(value = "团队佣金最大值")
    private BigDecimal teamCommissionMax;

}
