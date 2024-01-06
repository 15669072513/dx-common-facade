package com.dx.facade.report.req.report;

import com.dx.facade.common.PageRequest;
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
@ApiModel(value = "ReportVenueNetAmountDayParam", description = "数据对比-有效投注额/场馆输赢")
public class ReportVenueNetAmountDayParam extends PageRequest {

    @ApiModelProperty(value = "日期", required = true, example = "20240106")
    private String staticsDate;
}
