package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author orbit
 * @datetime 2024-02-21 16:12
 * @desc 代理个人欠款还款返回对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("代理个人还款返回对象")
public class ProxyDebtDoRepayRespDTO implements Serializable {
    @ApiModelProperty(value = "还款金额", position = 1, example = "88.88")
    private BigDecimal amount;
    @ApiModelProperty(value = "订单号", position = 2, example = "98988788778788")
    private String eventId;
}
