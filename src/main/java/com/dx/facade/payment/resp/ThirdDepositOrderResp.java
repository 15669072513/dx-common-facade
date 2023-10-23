package com.dx.facade.payment.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThirdDepositOrderResp {

    @ApiModelProperty("查询结果，true查询成功，false三方返回查询失败")
    private boolean result;

    @ApiModelProperty("订单状态 ThirdDepositOrderStatus")
    private Integer orderStatus;

    @ApiModelProperty("订单金额")
    private BigDecimal orderAmount;

    @ApiModelProperty("实付金额")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "虚拟币地址")
    private String virtualAddress;

    @ApiModelProperty(value = "虚拟币协议")
    private Integer virtualProtocol;

    @ApiModelProperty("返回信息")
    private String message;

    @ApiModelProperty("备注")
    private String remark;

    private ThirdDepositOrderResp(boolean result){
        this.result = result;
    }

    public static ThirdDepositOrderResp fail(){
        return new ThirdDepositOrderResp(false);
    }

}
