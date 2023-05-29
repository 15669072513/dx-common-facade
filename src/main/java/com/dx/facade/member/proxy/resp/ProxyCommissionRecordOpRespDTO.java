package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyCommissionRecordOpRespDTO implements Serializable {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "月份")
    private Integer reportYm;

    @ApiModelProperty(value = "商户号id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "币种")
    private String currency;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "上级代理id(代发佣金用到)")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;

    @ApiModelProperty(value = "上级代理佣金余额(代发佣金用到)")
    private BigDecimal parentCommissionBalance;

    @ApiModelProperty(value = "代理层级name")
    private String proxyLevelName;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "实际收益")
    private BigDecimal realPersonCommissionAmount;

    @ApiModelProperty(value = "应付佣金")
    private BigDecimal totalChildCommissionAmount;

    //  应付 -  未付 =  实付
    @ApiModelProperty(value = "实付佣金")
    private BigDecimal realPayAmount;

    @ApiModelProperty(value = "剩余欠款")
    private BigDecimal notPayAmount;

    @ApiModelProperty(value = "直属代理")
    private String parentProxyAccount;

    @ApiModelProperty(value = "应收佣金")
    private BigDecimal commissionAmount;

    // (应收 - 未收)
    @ApiModelProperty(value = "实收佣金")
    private BigDecimal realReceiveAmount;

    @ApiModelProperty(value = "剩余未收")
    private BigDecimal notRecviedAmount;

    @ApiModelProperty(value = "客户端状态(0-已取消 1-未结清 2-已结清(已发放) 3-无佣金)")
    private Integer payoutStatus;

    @ApiModelProperty(value = "非总代佣金取消标志 0-未取消 1-已取消")
    private Integer cancelFlag;
}