package com.dx.facade.payment.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CallThirdWithdrawResp {

    @ApiModelProperty("状态 ThirdWithdrawOrderStatus")
    private Integer status;

    @ApiModelProperty("第三方支付返回的结果")
    private String message;
}
