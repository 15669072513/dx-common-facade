package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 @title 待审佣金分页查询接口请求数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月28日 00:11:23
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("待审佣金分页查询接口请求数据传输对象")
public class FundsProxyCommissionAduitListReqDTO implements Serializable {

    @ApiModelProperty(value = "商户Id ")
    private Long merchantId;

    @ApiModelProperty(value = "付款开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "付款结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "审核账号")
    private String auditOperator;

    @ApiModelProperty(value = "最小拥金")
    private BigDecimal commissionAmountMin;

    @ApiModelProperty(value = "最大拥金")
    private BigDecimal commissionAmountMax;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 3-二审通过")
    private Integer orderStatus;
}
