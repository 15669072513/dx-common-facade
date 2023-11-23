package com.dx.facade.report.param.rebate;


import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Data
public class DwmMemBerRebateDReq extends LocalDatePageRequest {

    @ApiModelProperty(value = "派发开始时间", required = true, example = "2023-08-17 00:00:00")
    private String payoutStartTime;

    @ApiModelProperty(value = "派发结束时间", required = true, example = "2023-08-19 23:59:59")
    private String payoutEndTime;


    @ApiModelProperty(value = "派发开始时间", required = false, example = "20210617")
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Integer reportStartTime;

    @ApiModelProperty(value = "派发结束时间", required = false, example = "20210617")
    @DateTimeFormat(pattern="yyyyMMdd")
    private Integer reportEndTime;


    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户")
    private String merchantName;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "会员昵称")
    private String nickName;

    @ApiModelProperty(value = "会员账号")
    private String userName;


    @ApiModelProperty(value = "日期，比如20210531")
    private Integer reportDate;



}
