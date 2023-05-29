package com.dx.facade.report.param.proxydayreport;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import com.dx.facade.report.param.base.LocalDateRequest;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyDayReportRegisterReqDTO extends LocalDateRequest implements Serializable {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "注册开始时间", example = "2021-06-17")
    private String registerStartTime;

    @ApiModelProperty(value = "注册结束时间", example = "2021-06-17")
    private String registerEndTime;

    @ApiModelProperty(value = "账号类型  2-商务，3-正式，5-置换", example = "[2,3]", allowableValues = "[2,3,5]")
    private Integer accountType;

}
