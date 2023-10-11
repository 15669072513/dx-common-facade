package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ProxyRebateAuditedRespDTO {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "顶级代理id")
    private String topProxyId;

    @ApiModelProperty(value = "顶级代理账号")
    private String topProxyName;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户账号")
    private String merchantName;

    @ApiModelProperty(value = "单号")
    private String orderNo;

    @ApiModelProperty(value = "账号状态")
    private Integer accountStatus;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 3-二审通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "报表日期")
    private Integer reportDate;

    @ApiModelProperty(value = "返点金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "代理层级名称")
    private String proxyLevelName;

    @ApiModelProperty(value = "报表创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "审核账号")
    private String audit1Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime audit1Time;

    @ApiModelProperty(value = "审核备注")
    private String audit1Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit1Cost;

    @ApiModelProperty(value = "审核账号")
    private String audit2Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit2Result;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "审核备注")
    private String audit2Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;

    @ApiModelProperty(value = "周期名称")
    private String cycleName;

    @ApiModelProperty(value = "周期起始日期")
    private Integer cycleStatrtDate;

    @ApiModelProperty(value = "周期结束日期")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "当前货币")
    private String currency;
}