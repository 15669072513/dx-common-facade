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
@ApiModel(value = "PC/APP信用额度页数据", description = "PC/APP信用额度页数据")
public class APPUserCreditQuotaRespDTO {

    @ApiModelProperty(value = "剩余信用额度")
    private BigDecimal creditBalance;


    @ApiModelProperty(value = "当前总信用额度")
    private BigDecimal creditQuota;


}
