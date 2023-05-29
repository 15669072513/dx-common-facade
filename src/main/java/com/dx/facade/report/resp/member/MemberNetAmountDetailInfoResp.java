package com.dx.facade.report.resp.member;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountDetailInfoResp {

    @ApiModelProperty("会员盈亏详情-list")
    private List<MemberNetAmountDetailRespDTO> record;

    @ApiModelProperty("会员盈亏详情-汇总")
    private MemberNetAmountDetailSummaryRespDTO summary;
}
