package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyCommissionRecordAuditedRespDTO implements Serializable {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @ApiModelProperty(value = "代理姓名")
    private String proxyName;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "总代账号")
    private String topProxyName;


    @ApiModelProperty(value = "所属商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "所属商户")
    private String merchantName;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "报表日期，每月一条")
    private Integer reportDate;

    @ApiModelProperty(value = "结算年月")
    private Integer reportYm;

    @ApiModelProperty(value = "总拥金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "佣金加减")
    private BigDecimal adjustCommissionAmount;

    @ApiModelProperty(value = "报表创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "审核账号")
    private String audit1Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "审核备注")
    private String audit2Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;

    @ApiModelProperty(value = "币种")
    private String currency;
}