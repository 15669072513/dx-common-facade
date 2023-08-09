package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WalletAmountDTO implements Serializable {

    @ApiModelProperty("商户id")
    private String merchantId;

    @ApiModelProperty("用户id")
    private String userId;

    @ApiModelProperty("中心钱包额度")
    private BigDecimal cash;

    @ApiModelProperty("冻结额度")
    private BigDecimal frozen;

    @ApiModelProperty("信用余额")
    private BigDecimal creditAvailable;

    @ApiModelProperty("信用总额")
    private BigDecimal creditTotal;

    @ApiModelProperty("币种")
    private String currency;
}
