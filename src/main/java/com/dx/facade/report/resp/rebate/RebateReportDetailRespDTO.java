package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author gollum
 * @version 1.0.0
 * @title 返水报表
 * @desc 返水报表导出的Excel
 * @path 报表 返水报表
 * @since 2021年10月11日 17:51:00
 */
@Data
public class RebateReportDetailRespDTO extends RebateReportBaseRespDTO {

    @ApiModelProperty(value = "日期", required = true, example = "2011-02-11")
    private String staticsDate;
    
}
