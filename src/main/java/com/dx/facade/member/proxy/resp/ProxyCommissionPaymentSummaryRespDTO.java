package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * ProxyCommissionPaymentSummaryRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午2:15:48
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionPaymentSummaryRespDTO {

    @ApiModelProperty(value = "已结佣金", required = true, example = "100.00")
    private BigDecimal paidAmount;

    @ApiModelProperty(value = "未结佣金", required = true, example = "0")
    private BigDecimal unPayAmount;
}
