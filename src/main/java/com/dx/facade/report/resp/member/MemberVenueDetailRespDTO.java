package com.dx.facade.report.resp.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@ApiModel("会员场馆盈亏明细")
public class MemberVenueDetailRespDTO {
    @ApiModelProperty("会员场馆盈利明细详情")
    private List<MemberVenueRespDTO> memberVenueDetailList;


    @ApiModelProperty("本页统计")
    private MemberVenueSummaryRespDTO summaryRespDTO;
}
