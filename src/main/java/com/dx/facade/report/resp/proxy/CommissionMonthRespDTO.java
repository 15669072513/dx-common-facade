package com.dx.facade.report.resp.proxy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "业务报表>佣金报表分页返回", description = "业务报表>佣金报表分页返回")
public class CommissionMonthRespDTO implements Serializable {

    @ApiModelProperty("月份")
    private String month;

    @ApiModelProperty(value = "总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "充提锁定状态 0-未锁定 1-登陆锁定")
    private Integer paymentLockStatus;

    @ApiModelProperty(value = "所属商户名称")
    private String merchantName;

    @ApiModelProperty(value = "所属商顶级户名称")
    private String topMerchantName;

    @ApiModelProperty(value = "币种")
    private String  currency;

    @ApiModelProperty("发放佣金")
    private BigDecimal commission;

    @ApiModelProperty("总投注人数")
    private Integer betPersonCount;

    @ApiModelProperty("总注单量")
    private Integer betCount;

    @ApiModelProperty("总投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("总有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("总投注盈亏")
    private BigDecimal netAmount;
}
