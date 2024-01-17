package com.dx.facade.report.req.report;

import com.dx.facade.common.PageRequest;
import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * 代理日盈亏查询请求参数
 *
 * @author flash
 * @since 2024月6日 下午18:00:05
 */
@Data
@ApiModel(value = "ReportDateCompareParam", description = "中控后台-数据日报列表查询")
public class ReportDateCompareParam extends LocalDatePageRequest {

    @ApiModelProperty("商户Id")
    private Long merchantId;

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
