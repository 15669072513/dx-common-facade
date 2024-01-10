package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("德州-数据日报-财务通道参数")
public class DxReportDFinancialDTO {
    @ApiModelProperty("类别：0-官方，1-代理，3-全部")
    private String dataType;
    @ApiModelProperty("出入金参数：payIn-充值，payOut-提现")
    private String payType;
    @ApiModelProperty("日报期数")
    private LocalDate report;
    @ApiModelProperty("商户ID")
    private Long merchantId;
    @ApiModelProperty("日报期数-开始时间")
    private Integer startDate;
    @ApiModelProperty("日报期数-结束时间")
    private Integer endTime;
}
