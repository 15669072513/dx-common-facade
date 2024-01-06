package com.dx.facade.report.req.report;

import com.dx.facade.common.PageRequest;
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
public class ReportDateCompareParam extends PageRequest {

    @ApiModelProperty(value = "开始日期", required = true, example = "20210601")
    @NotNull(message = "开始日期参数不能为空")
    private Integer startDate;

    @ApiModelProperty(value = "结束日期", required = true, example = "20210602")
    @NotNull(message = "结束日期参数不能为空")
    private Integer endDate;

    @ApiModelProperty("所属商户")
    @NotNull(message = "结束日期参数不能为空")
    private String merchantName;


}
