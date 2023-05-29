package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProxyCommissionOnAuditRecordReqDTO implements Serializable {

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "商户号")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private Integer dataAreaType;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "锁单人")
    private String lockAccount;

    @ApiModelProperty(value = "当前操作人")
    private String operatorAccount;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "最小拥金")
    private BigDecimal commissionAmountMin;

    @ApiModelProperty(value = "最大拥金")
    private BigDecimal commissionAmountMax;

    @ApiModelProperty(value = "佣金月份-开始")
    private Integer reportYmStart;

    @ApiModelProperty(value = "佣金月份-结束")
    private Integer reportYmEnd;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 3-二审通过")
    private Integer orderStatus;

}
