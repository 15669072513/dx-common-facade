package com.dx.facade.report.param.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProfitAndLossReq", description = "盈亏详情列表请求对象")
public class ProfitAndLossReq {

    @ApiModelProperty(value = "本期账单开始日期", example = "20231213")
    private Integer periodStDate;
    @ApiModelProperty(value = "本期账单结束日期", example = "20231221")
    private Integer PeriodEnDate;
    @ApiModelProperty(value = "本期账单结束日期", example = "")
    private String BwVenueType;
    @ApiModelProperty(value = "本期账单结束日期", example = "20231221")
    private String profitLossTab;
    @ApiModelProperty(value = "会员id")
    private Long memberId;
}
