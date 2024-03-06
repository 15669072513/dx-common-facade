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
@ApiModel(value = "ProxyRebateTeamReq", description = "团队收益请求参数")
public class ProxyRebateTeamReq {

    @ApiModelProperty(value = "结算周期开始日期", example = "20231213")
    private String cycleStartDate;

    @ApiModelProperty(value = "结算周期结束日期", example = "20231221")
    private String cycleEndDate;

    @ApiModelProperty(value = "状态(0-全部 1-待发放 3-已发放 5-无收益 6-已取消)", example = "0")
    private Integer payoutStatus;

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "总代理ID")
    private Long parentProxyId;

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @Min(value = 1, message = "当前页最小值不能小于1")
    protected Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认10条", required = true, example = "10")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    protected Long pageSize = 10L;
}
