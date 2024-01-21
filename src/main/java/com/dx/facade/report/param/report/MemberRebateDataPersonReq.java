package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("会员个人返水明细请求参数")
public class MemberRebateDataPersonReq {

    @ApiModelProperty("报表日期")
    private Long reportDate;

    @ApiModelProperty("会员ID")
    private Long memberId;

}
