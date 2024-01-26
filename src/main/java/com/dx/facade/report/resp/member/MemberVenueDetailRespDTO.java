package com.dx.facade.report.resp.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@ApiModel("会员场馆盈亏明细")
public class MemberVenueDetailRespDTO {
    @ApiModelProperty("会员场馆盈利明细详情列表")
    private List<MemberVenueRespDTO> memberVenueDetailList;

    @ApiModelProperty("会员场馆盈利明细详情明细")
    private Map<String, MemberVenueRespDTO> memberVenueDetailMap;

    @ApiModelProperty("本页统计")
    private MemberVenueSummaryRespDTO summaryRespDTO;
}
