package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Dealer
 * @description:
 * @date 2023/08/01
 * @copyright
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "PC/APP我的钱包页返回数据", description = "PC/APP我的钱包页返回数据")
public class APPUserWalletSummaryInfoDTO {

    @ApiModelProperty(value = "资产信息-净资产")
    private BigDecimal netAssets;

    @ApiModelProperty(value = "资产信息-钱包余额")
    private BigDecimal walletBalance;

    @ApiModelProperty(value = "资产信息-应还借款")
    private BigDecimal shouldRepayment;

    @ApiModelProperty(value = "资产信息-冻结中")
    private BigDecimal freeze;

    @ApiModelProperty(value = "提现模块-剩余可提现金额")
    private BigDecimal withdrawAvailable;

    @ApiModelProperty(value = "信用钱包-应还借款")
    private BigDecimal creditShouldRepayment;

    @ApiModelProperty(value = "信用钱包-剩余信用额度")
    private BigDecimal creditBalance;

    @ApiModelProperty(value = "中心钱包-余额")
    private BigDecimal centerWalletBalance;

    @ApiModelProperty(value = "场馆钱包-余额合计")
    private BigDecimal venueWalletBalanceSummary;

}
