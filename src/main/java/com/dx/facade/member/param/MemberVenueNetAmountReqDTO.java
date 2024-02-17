package com.dx.facade.member.param;

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
@ApiModel("会员场馆盈亏查询报表")
public class MemberVenueNetAmountReqDTO {

    @ApiModelProperty(value = "会员Id")
    private Long playerId;

    /**
     * 日期,比如20210531
     */
    @ApiModelProperty(value = "固定时间")
    private Integer staticsDate;

    /**
     * 日期,比如20210531
     */
    @ApiModelProperty(value = "起始时间")
    private Integer startDate;

    /**
     * 日期,比如20210531
     */
    @ApiModelProperty(value = "终止时间")
    private Integer endDate;
}
