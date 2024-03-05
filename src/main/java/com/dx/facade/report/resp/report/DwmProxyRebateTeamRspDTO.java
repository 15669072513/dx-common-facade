package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DwmProxyRebateTeamRspDTO", description = "团队收益返回值")
public class DwmProxyRebateTeamRspDTO {
    @ApiModelProperty("序号")
    private String level;
    @ApiModelProperty("周期起始时间")
    private String cycleStartDate;
    @ApiModelProperty("周期结束时间")
    private String cycleEndDate;
    @ApiModelProperty("报表日期")
    private String reportDate;
    @ApiModelProperty("直属上级代理ID")
    private Long parentProxyId;
    @ApiModelProperty("直属上级代理")
    private String parentProxyName;
    @ApiModelProperty("代理ID")
    private Long proxyId;
    @ApiModelProperty("代理")
    private String proxyName;
    @ApiModelProperty("状态(1-待发放 3-已发放 5-无收益 6-已取消)")
    private int payoutStatus;
    @ApiModelProperty("德州-俱乐部个人返点")
    protected BigDecimal clubRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("德州-保险个人占成")
    protected BigDecimal insureSplitAmount = BigDecimal.ZERO;
    @ApiModelProperty("其他场馆个人返点")
    protected BigDecimal otherRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("其他场馆个人占成")
    protected BigDecimal otherSplitAmount = BigDecimal.ZERO;
    @ApiModelProperty("本期个人收益")
    protected BigDecimal incomeAmount = BigDecimal.ZERO;
    @ApiModelProperty("收益调整")
    protected BigDecimal adjustAmount = BigDecimal.ZERO;
    @ApiModelProperty("调整后个人收益")
    protected BigDecimal realRebateAmount = BigDecimal.ZERO;
}
