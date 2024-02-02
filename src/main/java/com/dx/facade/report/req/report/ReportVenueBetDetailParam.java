package com.dx.facade.report.req.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 代理日盈亏查询请求参数
 *
 * @author flash
 * @since 2024月6日 下午18:00:05
 */
@Data
@ApiModel(value = "ReportVenueBetDetailParam", description = "中控后台-场馆盈亏-投注详情")
public class ReportVenueBetDetailParam extends LocalDatePageRequest {

    @ApiModelProperty("场馆code -- byqp, zr, cp, dj, ty, DZ")
    @NotNull
    private String venueCode;

    @ApiModelProperty(
            value = "排序列名，merchantId",
            example = "merchantId"
    )
    private String orderKey;

    @ApiModelProperty(
            value = "排序方式(1)：desc-降序 asc-升序",
            example = "asc"
    )
    private String orderType;



}
