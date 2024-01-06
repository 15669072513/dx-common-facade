package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VirtualAccountSumRespDTO {

    @ApiModelProperty(value = "会员提款成功次数-本页合计")
    private Integer withdrawalSuccessNum;

    @ApiModelProperty(value = "会员提款被拒次数-本页合计")
    private Integer withdrawalFailNum;

    @ApiModelProperty(value = "会员提款总金额-本页合计")
    private BigDecimal withdrawalTotalAmount;

    @ApiModelProperty(value = "代理提款成功次数-本页合计")
    private Integer proxyWithdrawalSuccessNum;

    @ApiModelProperty(value = "代理提款被拒次数-本页合计")
    private Integer proxyWithdrawalFailNum;

    @ApiModelProperty(value = "代理提款总金额-本页合计")
    private BigDecimal proxyTotalAmount;

    @ApiModelProperty(value = "会员提款成功次数-全部合计")
    private Integer withdrawalSuccessNumAll;

    @ApiModelProperty(value = "会员提款被拒次数-全部合计")
    private Integer withdrawalFailNumAll;

    @ApiModelProperty(value = "会员提款总金额-全部合计")
    private BigDecimal withdrawalTotalAmountAll;

    @ApiModelProperty(value = "代理提款成功次数-全部合计")
    private Integer proxyWithdrawalSuccessNumAll;

    @ApiModelProperty(value = "代理提款被拒次数-全部合计")
    private Integer proxyWithdrawalFailNumAll;

    @ApiModelProperty(value = "代理提款总金额-全部合计")
    private BigDecimal proxyTotalAmountAll;

}
