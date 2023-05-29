package com.dx.facade.report.resp.discount;


import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-DiscountReportSummaryDTO", description = "活动优惠报表汇总对象")
public class DiscountReportSummaryDTO extends DiscountReportBaseDTO {
}
