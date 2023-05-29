package com.dx.facade.report.param.report;

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

    @ApiModelProperty("风控等级")
    private String windControlName;

    @ApiModelProperty("账户状态")
    private Integer accountLockStatus;

    @ApiModelProperty("登入状态")
    private Integer loginLockStatus;
    
    @ApiModelProperty("返佣金额")
    private BigDecimal commissionAmount;

}
