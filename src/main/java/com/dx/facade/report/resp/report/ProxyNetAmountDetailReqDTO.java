package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProxyNetAmountDetailReqDTO implements Serializable {

    @ApiModelProperty(value = "代理Id",required = true)
    private Long proxyId;

    @ApiModelProperty(value = "统计时间yyyyMMdd或者yyyyMM", required = true, example = "20210926")
    private Integer staticDate;

    @ApiModelProperty(value = "时间类型,0:日,1:月",required = true)
    private Integer staticDateType;
}
