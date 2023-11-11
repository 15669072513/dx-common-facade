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


    @ApiModelProperty("现金余额对象")
    private WalletRespDTO centerWalletBalance;

    @ApiModelProperty("现金钱包冻结余额对象")
    private WalletRespDTO centerWalletLockBalance;
    
    @ApiModelProperty("信用钱包余额对象")
    private WalletRespDTO creditWalletBalance;
    
    @ApiModelProperty("信用额度对象")
    private WalletRespDTO creditQuota;
    
}
