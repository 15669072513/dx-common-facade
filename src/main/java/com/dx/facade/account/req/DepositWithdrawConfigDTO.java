package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yinter
 */

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepositWithdrawConfigDTO {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty("厂商类型，1：入款，2：出款")
    private Integer paymentMerchantType;
}
