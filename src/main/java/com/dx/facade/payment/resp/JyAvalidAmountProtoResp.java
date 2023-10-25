package com.dx.facade.payment.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 佳运支付查询区间虚拟币数据返回值
 * @author flop
 */

@Data
public class JyAvalidAmountProtoResp {

    @ApiModelProperty(value = "协议id")
    private Integer protocol;

    @ApiModelProperty(value = "最小充值 金额")
    private BigDecimal minimumAmount;

    @ApiModelProperty(value = "最大充值金额")
    private BigDecimal maximumAmount;

    @ApiModelProperty(value = "固定名称")
    private String protocolName;

}
