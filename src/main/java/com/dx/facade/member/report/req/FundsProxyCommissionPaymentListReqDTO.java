package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 @title 佣金收付分页接口请求数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月27日 22:49:23
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("佣金收付分页接口请求数据传输对象")
public class FundsProxyCommissionPaymentListReqDTO implements Serializable {

    @ApiModelProperty(value = "所属商户ID")
    private String merchantId;

    @ApiModelProperty(value = "付款开始时间", example = "2021-09-09 09:12:21")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "付款结束时间", example = "2021-10-09 09:12:21")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "佣金月份:yyyy-MM", example = "2021-10")
    private String transMonth;

    @ApiModelProperty(value = "付款代理名称（转出代理名称）", example = "zale111")
    private String transOutProxyName;

    @ApiModelProperty(value = "付款代理层级（转出代理层级Id）", example = "1")
    private Integer transOutProxyLevelId;

    @ApiModelProperty(value = "订单号", example = "PY673511360535687229")
    private String orderNo;

    @ApiModelProperty(value = "收款代理名称 (转入代理名称)", example = "zale1111")
    private String transInProxyName;

    @ApiModelProperty(value = "排序方式(1-代理层级 2-支付佣金 3-付款时间)")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式(asc-正序 desc-逆序)")
    private String orderType;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private int dataAreaType;
}
