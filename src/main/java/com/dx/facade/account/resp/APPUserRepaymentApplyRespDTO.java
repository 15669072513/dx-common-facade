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
@ApiModel(value = "PC/APP还款页响应数据", description = "PC/APP还款页响应数据")
public class APPUserRepaymentApplyRespDTO {

    @ApiModelProperty(value = "还款钱包 1: 中心钱包")
    private Integer repaymentWalletType;

    @ApiModelProperty(value = "应还借款")
    private BigDecimal shouldRepayment;

}
