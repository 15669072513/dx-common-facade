package com.dx.facade.report.param.rebate;


import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class DwmMemBerRebateDReq extends LocalDatePageRequest {

    @ApiModelProperty(value = "派发开始时间", required = true, example = "2021-06-17")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate payoutStartTime;

    @ApiModelProperty(value = "派发结束时间", required = true, example = "2021-06-17")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate payoutEndTime;


    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户")
    private String merchantName;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "订单号")
    private String nickName;

    @ApiModelProperty(value = "订单号")
    private String userName;


    @ApiModelProperty(value = "日期，比如20210531")
    private Integer reportDate;



}
