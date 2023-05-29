package com.dx.facade.member.report.resp;

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
 @title 待审佣金分页查询接口响应数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月28日 00:15:18
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("待审佣金分页查询接口响应数据传输对象")
public class ProxyCommissionAduitListRespDTO implements Serializable {

    @ApiModelProperty(value = "唯一标识")
    private Long id;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "审核员")
    private String auditOperator;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "日期：yyyy-mm")
    private String date;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "账号状态")
    private Integer accountStatus;

    @ApiModelProperty(value = "拥金金额")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "拥金金额")
    private LocalDateTime applyDate;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过")
    private Integer orderStatus;

}
