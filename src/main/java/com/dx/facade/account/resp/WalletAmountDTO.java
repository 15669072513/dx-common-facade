package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WalletAmountDTO implements Serializable {


    private String merchantId;

    private String userId;
    /**
     * 中心钱包额度
     */
    private BigDecimal cash;
    /**
     * 冻结额度
     */
    private BigDecimal frozen;
    /**
     * 信用余额
     */
    private BigDecimal creditAvailable;
    /**
     * 信用总额
     */
    private BigDecimal creditTotal;

    /**
     * 币种
     */
    private String currency;
}
