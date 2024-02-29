package com.dx.facade.report.param.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "PlatformOperationReq", description = "平台运营状况概述请求对象", parent = LocalDatePageRequest.class)
public class PlatformOperationReq {

    @ApiModelProperty(value = "排序类型")
    private String orderType;

    @ApiModelProperty(value = "排序字段")
    private String orderKey;

    @ApiModelProperty(value = "查询范围 0:全量数据 1:统计日期", example = "1")
    private Integer dataAreaType;

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @Min(value = 1, message = "当前页最小值不能小于1")
    protected Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认10条", required = true, example = "10")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    protected Long pageSize = 10L;

    @ApiModelProperty(value = "报表查询开始日期", example = "20231213")
    @NotNull(message = "查询时间不能为空")
    private Long startTime;

    @ApiModelProperty(value = "报表查询结束日期", example = "20231221")
    @NotNull(message = "查询时间不能为空")
    private Long endTime;

}
