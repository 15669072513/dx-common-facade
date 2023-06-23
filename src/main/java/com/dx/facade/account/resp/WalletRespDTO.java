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
public class WalletRespDTO {

    @ApiModelProperty(value = "会员ID")
    private Long userId;

    @ApiModelProperty(value = "账户类型")
    private Integer walletType;

    @ApiModelProperty(value = "余额")
    private BigDecimal balance;

    @ApiModelProperty(value = "币种")
    private String currency;
}
