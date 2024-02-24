package com.dx.facade.report.req.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author grayson
 */
@Data
public class RebateRecordDetailReportParam {
    @ApiModelProperty(value = "会员id", required = true)
    @NotNull(message = "会员id不能为空")
    private Long id;

    @ApiModelProperty(value = "返点日期，格式： 20230716", required = true)
    @NotNull(message = "返点日期")
    private Integer reportDate;

    //    @ApiModelProperty(value = "1 团队  2 直属会员 ", required = true)
//    @NotNull(message = "类型")
//    private Integer reportType;
    @ApiModelProperty("平台标识： 0-非平台 1-平台 2-全部")
    private Integer platformFlag;

}