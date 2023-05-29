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
@ApiModel("会员报表-统计日期-详情")
public class PlayerDayReportDetailReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("商户Id")
    private Long merchantId;

    @ApiModelProperty(value = "会员ID", example = "100001", required = true)
    private Long playerId;

    @ApiModelProperty(value = "上级代理Id", example = "100001", required = true)
    private Long parentProxyId;
}
