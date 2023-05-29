package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AddPaymentMerchantBankParam {
    @ApiModelProperty("银行id")
    private String bankId;
    @ApiModelProperty("银行简写")
    private String bankShortName;
}
