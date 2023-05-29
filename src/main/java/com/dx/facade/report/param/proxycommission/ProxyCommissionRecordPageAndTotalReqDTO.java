package com.dx.facade.report.param.proxycommission;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.dx.facade.common.PageRequest;

/**
 * @author agan
 */
@Data
public class ProxyCommissionRecordPageAndTotalReqDTO extends PageRequest {

    @ApiModelProperty(value = "月份")
    @Pattern(
            regexp ="^(?:19|20)[0-9][0-9]-(?:(?:0[1-9])|(?:1[0-2]))-(?:(?:[0-2][1-9])|(?:[1-3][0-1])) (?:(?:[0-2][0-3])|(?:[0-1][0-9])):[0-5][0-9]:[0-5][0-9]$",
            message = "时间格式不正确 示例：2021-05-05")
    @NotNull(message = "月份不能为空")
    private String createAtEnd;

    @ApiModelProperty(value = "单号", example = "1111")
    private String orderNo;

    @ApiModelProperty(value = "订单状态", example = "1")
    private Integer orderStatus;
    @ApiModelProperty(value = "代理账号", example = "aa")
    private String proxyAccount;

    @ApiModelProperty(value = "开始时间,一个月开始的第一天",hidden = true)
    private String beginTime;

    @ApiModelProperty(value = "结束时间,一个月开始的最后",hidden = true)
    private String endTime;

    @ApiModelProperty("排序方式：desc-降序 asc-升序")
    private String orderType;
}
