package com.dx.facade.member.param;

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
@ApiModel("会员盈亏详情接口")
public class MemberNetAmountDetailReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("所属商户")
    private String merchantId;

    @ApiModelProperty("会员Id")
    private Long playerId;

    @ApiModelProperty(value = "上级代理Id", dataType = "java.lang.String")
    private Long parentProxyId;
}
