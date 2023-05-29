package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateWithdrawalParam {

    @ApiModelProperty(value = "商户号id")
    private Long merchantId;

    @ApiModelProperty(value = "银行卡号")
    private String cardNumber;

    @ApiModelProperty(value = "绑定会员ID")
    private Long userId;

    @ApiModelProperty(value = "会员提款成功次数")
    private Integer withdrawalSuccessNum;

    @ApiModelProperty(value = "会员提款被拒次数")
    private Integer withdrawalFailNum;

    @ApiModelProperty(value = "会员成功提款总金额")
    private BigDecimal withdrawalTotalAmount;

    @ApiModelProperty(value = "最后成功提款时间")
    private LocalDateTime lastWithdrawalTime;

    @ApiModelProperty(value = "代理提款成功次数")
    private Integer proxyWithdrawalSuccessNum;

    @ApiModelProperty(value = "代理提款被拒次数")
    private Integer proxyWithdrawalFailNum;

    @ApiModelProperty(value = "代理成功提款总金额")
    private BigDecimal proxyWithdrawalTotalAmount;
}
