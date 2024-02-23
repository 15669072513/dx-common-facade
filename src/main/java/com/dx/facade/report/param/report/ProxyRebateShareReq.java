package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProxyRebateShareReq", description = "收益明细请求参数")
public class ProxyRebateShareReq {

    @ApiModelProperty(value = "结算周期开始日期", example = "20231213")
    @NotNull(message = "查询时间不能为空")
    private Long cycleStartDate;

    @ApiModelProperty(value = "结算周期结束日期", example = "20231221")
    @NotNull(message = "查询时间不能为空")
    private Long cycleEndDate;

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "会员ID")
    private Long memberId;
}
