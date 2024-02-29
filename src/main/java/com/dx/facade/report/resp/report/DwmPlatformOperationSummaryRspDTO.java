package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("平台运营状况概述合计")
public class DwmPlatformOperationSummaryRspDTO {

    @ApiModelProperty("新增用户")
    protected int newMemberNum = 0;

    @ApiModelProperty("有效新用户")
    protected int newEffecactiveMemberNum = 0;

    @ApiModelProperty("日活跃用户")
    protected int activeMemberNum = 0;

    @ApiModelProperty("德州保险")
    protected BigDecimal dx21Amount = BigDecimal.ZERO;

    @ApiModelProperty("德州服务费")
    protected BigDecimal dx11Amount = BigDecimal.ZERO;

    @ApiModelProperty("投注额")
    protected BigDecimal betAmount = BigDecimal.ZERO;

    @ApiModelProperty("有效投注额")
    protected BigDecimal validBetAmount = BigDecimal.ZERO;

    @ApiModelProperty("平台输赢")
    protected BigDecimal netAmount = BigDecimal.ZERO;

    @ApiModelProperty("返点模式输赢")
    protected BigDecimal rebateNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("占成模式输赢")
    protected BigDecimal commissionNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("盈利率")
    protected BigDecimal netRate = BigDecimal.ZERO;

    @ApiModelProperty("平台运营成本-德州保险")
    protected BigDecimal dx22Amount = BigDecimal.ZERO;

    @ApiModelProperty("平台运营成本-德州服务费")
    protected BigDecimal dx12Amount = BigDecimal.ZERO;

    @ApiModelProperty("综合场馆")
    protected BigDecimal multiVenueAmount = BigDecimal.ZERO;

    @ApiModelProperty("占成返点")
    protected BigDecimal payoutRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("团队返点")
    protected BigDecimal payoutCommissionAmount = BigDecimal.ZERO;

    @ApiModelProperty("返点率")
    protected BigDecimal rebateRate = BigDecimal.ZERO;

    @ApiModelProperty("预估场馆费用")
    protected BigDecimal preVenueAmount = BigDecimal.ZERO;

    @ApiModelProperty("净利润")
    protected BigDecimal netProfit = BigDecimal.ZERO;

    @ApiModelProperty("净利润率")
    protected BigDecimal netProfitRate = BigDecimal.ZERO;
}
