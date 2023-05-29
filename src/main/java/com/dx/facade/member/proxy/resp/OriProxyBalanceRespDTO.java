package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author
 */
@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OriProxyBalanceRespDTO {

    @ApiModelProperty("佣金钱包余额")
    private BigDecimal commissionBalance;

    @ApiModelProperty("额度钱包余额")
    private BigDecimal quotaBalance;

    @ApiModelProperty("币种")
    private BigDecimal currency;


}
