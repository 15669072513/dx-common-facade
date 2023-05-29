package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * ProxyCommissionPaymentRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午2:15:48
 */
@Data
@ToString
public class ProxyCommissionPaymentRespDTO {

    @ApiModelProperty(value = "交易时间", required = true, example = "2021-09-12 12:10:10")
    private LocalDateTime transDate;

    @ApiModelProperty(value = "订单号", required = true)
    private String orderNo;

    @ApiModelProperty(value = "支付佣金", required = true, example = "100.00")
    private BigDecimal transAmount;

    @ApiModelProperty(value = "收支状态(0-上级转入 1-支付下级)", required = true, example = "0")
    private Integer transStatus;

    @ApiModelProperty(value = "代理ID", required = true, dataType = "java.lang.String", example = "1")
    private Long proxyId;

    @ApiModelProperty(value = "代理账号", required = true, example = "soLong01")
    private String proxyAccount;
}
