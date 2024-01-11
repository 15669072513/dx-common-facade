package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Dealer
 * @description: 代理返点和返佣信息
 * @date 2023/10/28
 * @copyright
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyRebateResponseData implements Serializable {

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "个人返点")
    private BigDecimal rebate;

    @ApiModelProperty(value = "团队返佣")
    private BigDecimal teamRebate;
}
