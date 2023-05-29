package com.dx.facade.report.resp.discount;


import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-bw-resp-report-DiscountReportDetailDTO", description = "活动优惠报表详情对象")
public class DiscountReportDetailDTO extends DiscountReportBaseDTO {

    @ApiModelProperty(value = "日期", required = true, example = "2011-02-11")
    private String staticsDate;
}
