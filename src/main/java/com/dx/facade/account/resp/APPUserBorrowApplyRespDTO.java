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
@ApiModel(value = "PC/APP借款页响应数据", description = "PC/APP借款页响应数据")
public class APPUserBorrowApplyRespDTO {

    @ApiModelProperty(value = "收款钱包 1: 中心钱包")
    private Integer receiveWalletType;

    @ApiModelProperty(value = "剩余信用额度")
    private BigDecimal creditBalance;


}
