package com.dx.facade.payment.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 佳运支付查询区间数据返回值
 * @author flop
 */

@Data
public class JyAvalidAmountResp {

    @ApiModelProperty(value = "支付方式")
    private Long payTypeId;

    @ApiModelProperty(value = "最小充值 金额")
    private BigDecimal minimumAmount;

    @ApiModelProperty(value = "最大充值金额")
    private BigDecimal maximumAmount;

    @ApiModelProperty(value = "固定金额")
    private List<BigDecimal> fixedAmountList;

    @ApiModelProperty(value = "虚拟币金额")
    private List<JyAvalidAmountProtoResp> protocolList;
}
