package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * ProxyCommissionReceivePayRespDTO
 *
 * @author kygo
 * @version 1.0.0
 * @since 2022.04.18
 */
@Data
@ToString
public class ProxyCommissionReceivePayRespDTO {

    @ApiModelProperty(value = "佣金月份",example = "202202")
    private Integer reportYm;

    @ApiModelProperty(value = "交易时间", example = "2021-09-12 12:10:10")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime transDate;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "收付类型")
    private String transferType;

    @ApiModelProperty(value = "收付账号")
    private String transferAccount;

    @ApiModelProperty(value = "支付佣金",example = "100.00")
    private BigDecimal transAmount;
}
