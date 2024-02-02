package com.dx.facade.report.param.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "PlatformOperationReq", description = "平台运营状况概述请求对象", parent = LocalDatePageRequest.class)
public class PlatformOperationReq extends LocalDatePageRequest {

    @ApiModelProperty(value = "排序类型")
    private String orderType;

    @ApiModelProperty(value = "排序字段")
    private String orderKey;

    @ApiModelProperty(value = "查询范围 0:全量数据 1:统计日期", example = "1")
    private Integer dataAreaType;

}
