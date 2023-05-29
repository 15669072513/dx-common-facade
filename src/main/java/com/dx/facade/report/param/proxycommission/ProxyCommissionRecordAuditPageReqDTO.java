package com.dx.facade.report.param.proxycommission;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class ProxyCommissionRecordAuditPageReqDTO extends PageRequest {

    @ApiModelProperty(value = "开始时间",example = "2021-06-17 00:00:00", required = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Pattern(regexp = "^(?:19|20)[0-9][0-9]-(?:(?:0[1-9])|(?:1[0-2]))-(?:(?:[0-2][1-9])|(?:[1-3][0-1])) (?:(?:[0-2][0-3])|(?:[0-1][0-9])):[0-5][0-9]:[0-5][0-9]$", message = "时间格式不正确 示例：2021-05-05 00:00:00")
    @NotNull(message = "开始时间不能为空")
    private String beginTime;

    @ApiModelProperty(value = "结束时间",example = "2021-06-18 00:00:00", required = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Pattern(regexp = "^(?:19|20)[0-9][0-9]-(?:(?:0[1-9])|(?:1[0-2]))-(?:(?:[0-2][1-9])|(?:[1-3][0-1])) (?:(?:[0-2][0-3])|(?:[0-1][0-9])):[0-5][0-9]:[0-5][0-9]$", message = "时间格式不正确 示例：2021-05-05 00:00:00")
    @NotNull(message = "结束时间不能为空")
    private String endTime;

    @ApiModelProperty(value = "单号", example = "1111")
    private String orderNo;

    @ApiModelProperty(value = "订单状态", example = "1")
    private Integer orderStatus;
    @ApiModelProperty(value = "代理账号", example = "aa")
    private String proxyAccount;
}
