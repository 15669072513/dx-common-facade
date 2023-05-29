package com.dx.facade.report.param.report;

import com.dx.facade.common.PageRequest;

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
@ApiModel("佣金报表请求参数")
public class CommissionRecordReqDTO extends PageRequest {

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "统计月份", example = "1")
    private Integer reportYm;
}
