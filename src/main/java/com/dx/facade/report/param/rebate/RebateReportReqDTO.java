package com.dx.facade.report.param.rebate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RebateReportReqDTO {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    @ApiModelProperty("结算开始日期")
    private Date audit1Date;

    @ApiModelProperty("结算结束日期")
    private Date audit2Date;

    @ApiModelProperty("代理账号")
    private String proxyAccount;

    @ApiModelProperty("直属上级")
    private String proxyPatent;

    @ApiModelProperty("代理等级")
    private Integer proxyLevel;

    @ApiModelProperty("代理类型")
    private Integer proxyType;

    @ApiModelProperty("账号状态")
    private Integer accountStatus;

    @ApiModelProperty("领取开始日期")
    private Date payoutStartDate;

    @ApiModelProperty("领取结束日期")
    private Date payoutEedDate;

    @ApiModelProperty("风控层级")
    private Integer riskLeve;

    @ApiModelProperty("领取状态 0=待结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点")
    private Integer payoutStatus;

    @ApiModelProperty("团队返点最小")
    private BigDecimal teamRebateMin;

    @ApiModelProperty("团队返点最大")
    private BigDecimal teamRebateMax;

    @ApiModelProperty("团队总流水最小")
    private BigDecimal teamBetMin;

    @ApiModelProperty("团队总流水最大")
    private BigDecimal teamBetMax;

    @ApiModelProperty("个人返点最小")
    private BigDecimal proxyRebateMin;

    @ApiModelProperty("个人返点最大")
    private BigDecimal proxyRebateMax;

    @ApiModelProperty("订单号")
    private String lockAaccount;
}
