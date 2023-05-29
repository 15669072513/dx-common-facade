package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 本月佣金 净输赢
 *
 * @author laway
 */
@Data
@Builder
public class MonthProxyCommissionRespDTO {

    @ApiModelProperty(value = "本月佣金")
    private BigDecimal monthCommissionAmount;

    @ApiModelProperty(value = "本月净输赢金额")
    private BigDecimal monthNetWinAmount;

}
