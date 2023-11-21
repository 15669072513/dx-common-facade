package com.dx.facade.report.param.member;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyMemberNetVenueListReqDTO {

    @ApiModelProperty(value = "开始时间",required = true)
    private Integer startDate;

    @ApiModelProperty(value = "结束时间",required = true)
    private Integer endDate;

    @ApiModelProperty(value = "会员ID", required = true)
    private Long memberId;

//    @ApiModelProperty(value = "f", required = true)
    private Long parentProxyId;
}
