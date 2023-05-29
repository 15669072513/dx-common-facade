package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyCommissionRecordSumTotalRespDTO {

    @ApiModelProperty("总输赢额")
    private BigDecimal totalNetAmount;
    @ApiModelProperty("场馆费")
    private BigDecimal totalPlatformAmount;
    @ApiModelProperty("活动彩金")
    private BigDecimal totalActivityAmount;
    @ApiModelProperty("返水")
    private BigDecimal totalRebateAmount;
    @ApiModelProperty("账号调整")
    private BigDecimal totalAdjustAmount;
    @ApiModelProperty("补单输赢")
    private BigDecimal totalPatchNetAmount;
    @ApiModelProperty("净输赢")
    private BigDecimal totalPureAmount;
    @ApiModelProperty("上月结余")
    private BigDecimal totalLastAmount;
    @ApiModelProperty("冲正后净输赢")
    private BigDecimal totalRushAmount;

    @ApiModelProperty("等级专享")
    private BigDecimal rewardAmount;
    @ApiModelProperty("返佣总额")
    private BigDecimal commissionAmount;
}
