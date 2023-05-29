package com.dx.facade.report.resp.discount;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@ApiModel(value = "com-ob-resp-report-DiscountReportBaseDTO", description = "活动优惠报表基础对象，包括所有数量及币种")
public abstract class DiscountReportBaseDTO implements Serializable {

    @ApiModelProperty(value = "优惠金额(CNY)", required = true, example = "2343")
    private BigDecimal discountAmountInCNY;

    @ApiModelProperty(value = "优惠金额(VND)", required = true, example = "2343")
    private BigDecimal discountAmountInVND;

    @ApiModelProperty(value = "优惠金额(THB)", required = true, example = "2343")
    private BigDecimal discountAmountInTHB;

    @ApiModelProperty(value = "优惠次数", required = true, example = "23")
    private Long discountCount;

    @ApiModelProperty(value = "调整优惠金额(CNY)", required = true, example = "2343")
    private BigDecimal adjustAmountInCNY;

    @ApiModelProperty(value = "调整优惠金额(VND)", required = true, example = "2343")
    private BigDecimal adjustAmountInVND;

    @ApiModelProperty(value = "调整优惠金额(THB)", required = true, example = "2343")
    private BigDecimal adjustAmountInTHB;

    @ApiModelProperty(value = "调整优惠次数", example = "10")
    private Long adjustCount;

    @ApiModelProperty(value = "总优惠(CNY)", required = true, example = "2343")
    private BigDecimal totalDiscountInCNY;

    @ApiModelProperty(value = "总优惠(VND)", required = true, example = "2343")
    private BigDecimal totalDiscountInVND;

    @ApiModelProperty(value = "总优惠(THB)", required = true, example = "2343")
    private BigDecimal totalDiscountInTHB;

}
