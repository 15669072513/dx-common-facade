package com.dx.facade.report.resp.pay;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "com-ob-member-resp-MemberRebateReportSummaryReps", description = "会员返水列表汇总对象")
@Data
public class MemberRebateReportSummaryRpcRepsDTO implements Serializable {

    @ApiModelProperty(value = "有效投注额(CNY)", required = true, example = "2343")
    private BigDecimal validBetAmountInCNY;

    @ApiModelProperty(value = "有效投注额(VND)", required = true, example = "2343")
    private BigDecimal validBetAmountInVND;

    @ApiModelProperty(value = "有效投注额(THB)", required = true, example = "2343")
    private BigDecimal validBetAmountInTHB;

    @ApiModelProperty(value = "返水金额(CNY)", required = true, example = "2343")
    private BigDecimal rebateAmountInCNY;

    @ApiModelProperty(value = "返水金额(VND)", required = true, example = "2343")
    private BigDecimal rebateAmountInVND;

    @ApiModelProperty(value = "返水金额(THB)", required = true, example = "2343")
    private BigDecimal rebateAmountInTHB;

}
