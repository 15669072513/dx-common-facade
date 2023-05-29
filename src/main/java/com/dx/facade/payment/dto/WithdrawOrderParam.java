package com.dx.facade.payment.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WithdrawOrderParam {


    @ApiModelProperty(value="会员ID")
    private Long userId;

    @ApiModelProperty(value="会员/代理类型")
    private Integer userType;

}
