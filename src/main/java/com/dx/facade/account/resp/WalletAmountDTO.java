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

    @ApiModelProperty("现金钱包额度")
    private BigDecimal cash;

    @ApiModelProperty("冻结额度")
    private BigDecimal frozen;

    @ApiModelProperty("可用额度")
    private BigDecimal creditAvailable;

    @ApiModelProperty("信用总额")
    private BigDecimal creditTotal;

    @ApiModelProperty("应还借款：信用总额 - 信用余额")
    private BigDecimal borrowAmount;

    @ApiModelProperty("应还账款：= 应还借款 - 现金余额，最小为0")
    private BigDecimal shouldRepay;

    @ApiModelProperty("团队授信总额")
    private BigDecimal teamCreditTotal;

    @ApiModelProperty("占成欠款")
    private BigDecimal proxyDebt;

    @ApiModelProperty("币种")
    private String currency;
}
