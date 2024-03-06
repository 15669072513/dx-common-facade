package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameOrderInfoRespDTO {

    @ApiModelProperty(value = "0:成功,1:失败")
    private Integer status;

    @ApiModelProperty(value = "订单的额度")
    private BigDecimal tradeAmount;

    @ApiModelProperty(value = "订单号")
    private String orderId;

    @ApiModelProperty(value = "账变类型(1 增加额度, 2 减少额度)")
    private Integer tradeType;
}
