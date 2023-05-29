package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ProxyCommissionDetailVo
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年11月20日 下午8:18:57
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionDetailVO implements Serializable {

    @ApiModelProperty("代理账号")
    private String proxyAccount;

    @ApiModelProperty("代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty("代理层级")
    private Long proxyLevelId;

    @ApiModelProperty("代理等级")
    private String proxyLevelName;

    @ApiModelProperty("代理vip等级")
    private Integer proxyVipLevel;

    @ApiModelProperty("代理vip等级名称")
    private String proxyVipLevelName;

    @ApiModelProperty("返佣金额")
    private BigDecimal commissionAmount;

}
