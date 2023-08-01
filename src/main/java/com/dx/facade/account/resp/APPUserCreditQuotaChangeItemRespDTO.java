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
@ApiModel(value = "PC/APP信用额度调整数据", description = "PC/APP信用额度调整数据")
public class APPUserCreditQuotaChangeItemRespDTO {

    @ApiModelProperty(value = "调整时间")
    private String changeTime;

    @ApiModelProperty(value = "调整额度")
    private BigDecimal changeValue;

    @ApiModelProperty(value = "调整后总额度")
    private BigDecimal totalQuota;

}
