package com.dx.facade.report.req.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author grayson
 */
@Data
public class MemberRebateRecordDetailReportParam {
    @ApiModelProperty(value = "会员id", required = true)
    @NotNull(message = "会员id不能为空")
    private Long id;

    @ApiModelProperty(value = "返点日期，格式： 20230716", required = true)
    @NotNull(message = "返点日期")
    private Integer reportDate;

//    @ApiModelProperty(value = "1 团队  2 直属会员 ", required = true)
//    @NotNull(message = "类型")
//    private Integer reportType;

}