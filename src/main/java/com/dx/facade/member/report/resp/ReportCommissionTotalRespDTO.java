package com.dx.facade.member.report.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 下午17:02:54
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("佣金收付报表分页查询合计接口响应数据传输对象")
public class ReportCommissionTotalRespDTO implements Serializable {


    @ApiModelProperty(value = "应付佣金(CNY)", required = true, example = "2343")
    private BigDecimal paymentInCNY;

    @ApiModelProperty(value = "应付佣金(VND)", required = true, example = "2343")
    private BigDecimal paymentInVND;

    @ApiModelProperty(value = "应付佣金(THB)", required = true, example = "2343")
    private BigDecimal paymentInTHB;

    @ApiModelProperty(value = "实付佣金(CNY)", required = true, example = "2343")
    private BigDecimal realPCommissionInCNY;

    @ApiModelProperty(value = "实付佣金(VND)", required = true, example = "2343")
    private BigDecimal realPCommissionInVND;

    @ApiModelProperty(value = "实付佣金(THB)", required = true, example = "2343")
    private BigDecimal realPCommissionInTHB;

    @ApiModelProperty(value = "剩余欠款(CNY)", required = true, example = "2343")
    private BigDecimal notPayAmountInCNY;

    @ApiModelProperty(value = "剩余欠款(VND)", required = true, example = "2343")
    private BigDecimal notPayAmountInVND;

    @ApiModelProperty(value = "剩余欠款(THB)", required = true, example = "2343")
    private BigDecimal notPayAmountInTHB;

    @ApiModelProperty(value = "应收佣金(CNY)", required = true, example = "2343")
    private BigDecimal paymentCommissionInCNY;

    @ApiModelProperty(value = "应收佣金(VND)", required = true, example = "2343")
    private BigDecimal paymentCommissionInVND;

    @ApiModelProperty(value = "应收佣金(THB)", required = true, example = "2343")
    private BigDecimal paymentCommissionInTHB;

    @ApiModelProperty(value = "实收佣金(CNY)", required = true, example = "2343")
    private BigDecimal realRCommissionInCNY;

    @ApiModelProperty(value = "实收佣金(VND)", required = true, example = "2343")
    private BigDecimal realRCommissionInVND;

    @ApiModelProperty(value = "实收佣金(THB)", required = true, example = "2343")
    private BigDecimal realRCommissionInTHB;

    @ApiModelProperty(value = "剩余未收(CNY)", required = true, example = "2343")
    private BigDecimal totalChildCommissionAmountInCNY;

    @ApiModelProperty(value = "剩余未收(VND)", required = true, example = "2343")
    private BigDecimal totalChildCommissionAmountInVND;

    @ApiModelProperty(value = "剩余未收(THB)", required = true, example = "2343")
    private BigDecimal totalChildCommissionAmountInTHB;
}
