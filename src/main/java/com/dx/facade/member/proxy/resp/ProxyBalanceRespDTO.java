package com.dx.facade.member.proxy.resp;

import com.dx.facade.account.resp.WalletRespDTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "代理余额返回参数", description = "代理余额返回参数")
public class ProxyBalanceRespDTO {

    @ApiModelProperty("额度钱包余额对象")
    private WalletRespDTO quotaBalance;

    @ApiModelProperty("佣金钱包余额对象")
    private WalletRespDTO commissionBalance;
}