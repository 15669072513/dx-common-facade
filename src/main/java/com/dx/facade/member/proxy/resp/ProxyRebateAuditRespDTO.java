package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ProxyRebateAuditRespDTO {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "代理层级ID")
    private Integer proxyLevelId;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "货币符号")
    private String currency;

    @ApiModelProperty(value = "单号")
    private String orderNo;
    
    @ApiModelProperty(value = "账号状态")
    private Integer accountStatus;

    @ApiModelProperty(value = "账号状态")
    private Integer  paymentLockStatus;

    @ApiModelProperty(value = "账号状态")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "风控")
    private String windControlName;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 3-二审通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "当前锁单时间")
    private LocalDateTime lockTime;

    @ApiModelProperty(value = "当前锁单账号Id")
    private Long lockAccountId;

    @ApiModelProperty(value = "当前锁单账号")
    private String lockAccount;

    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月")
    private Integer cycleType;

    @ApiModelProperty(value = "周期名称")
    private String cycleName;

    @ApiModelProperty(value = "周期起始日期")
    private Integer cycleStatrtDate;

    @ApiModelProperty(value = "周期结束日期")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "返点金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "报表日期")
    private Integer reportDate;

    @ApiModelProperty(value = "报表创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "审核账号")
    private String audit1Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime audit1Time;

    @ApiModelProperty(value = "审核账号")
    private String audit2Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit2Result;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime audit2Time;
}