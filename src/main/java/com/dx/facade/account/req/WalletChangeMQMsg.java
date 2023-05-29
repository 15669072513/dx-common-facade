package com.dx.facade.account.req;

import com.dx.enums.ConstantEnums;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class WalletChangeMQMsg {

    private Long merchantId;

    private Long userId;

    @ApiModelProperty("0：非存取，1：存，2：取")
    private ConstantEnums.UserType userType;

    @ApiModelProperty("0：非存取，1：存，2：取")
    private Integer flag;

    @ApiModelProperty("本次金额")
    private BigDecimal currentAmount;

    @ApiModelProperty("中心钱包余额")
    private BigDecimal cash;
}
