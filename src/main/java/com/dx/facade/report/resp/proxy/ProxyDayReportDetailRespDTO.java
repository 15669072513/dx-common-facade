package com.dx.facade.report.resp.proxy;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-ProxyDayReportDetailRespDTO", description = "代理报表详细对象")
public class ProxyDayReportDetailRespDTO implements Serializable {

    @ApiModelProperty(value = "统计日期")
    private String staticsDate;

    @ApiModelProperty(value = "会员首存总额")
    private BigDecimal memberFirstDepositAmount;

    @ApiModelProperty(value = "会员首存人数")
    private Integer memberFirstDepositNum;

    @ApiModelProperty(value = "会员注册首存人数")
    private Integer memberRegisterAndFirstDepositNum;

    @ApiModelProperty(value = "会员存款总额")
    private BigDecimal memberDepositAmount;

    @ApiModelProperty(value = "会员存款次数")
    private BigDecimal memberDepositTimes;

    @ApiModelProperty(value = "会员取款总额")
    private BigDecimal memberWithdrawAmount;

    @ApiModelProperty(value = "会员取款次数")
    private BigDecimal memberWithdrawTimes;

    @ApiModelProperty(value = "会员存取款差")
    private BigDecimal memberDepositWithdrawDifferAmount;

    @ApiModelProperty(value = "会员投注盈亏")
    private BigDecimal memberNetAmount;

    @ApiModelProperty(value = "全部下级代理人数")
    private Integer underProxyNum;

    @ApiModelProperty(value = "直属下级代理人数")
    private Integer directlyUnderProxyNum;

    @ApiModelProperty(value = "全部下级会员人数")
    private Integer underMemberNum;

    @ApiModelProperty(value = "直属下级会员人数")
    private Integer directlyUnderMemberNum;

    @ApiModelProperty(value = "当前币种")
    private String currency;

}
