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
@ApiModel(value = "com-bw-resp-report-DiscountReportListDTO", description = "活动优惠报表返回对象")
public class DiscountReportListDTO extends DiscountReportBaseDTO {

    /**
     * 主键
     */
    @ApiModelProperty(value = "优惠项目主键", example = "1")
    private Long discountId;

    @ApiModelProperty(value = "优惠项目", example = "VIP晋级优惠")
    private String discountName;

}
