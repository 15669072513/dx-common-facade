package com.dx.facade.report.param.rebate;


import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DwdBetMemberRecordDReq extends LocalDatePageRequest {

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "会员ID")
    private Long memberId;

    @ApiModelProperty(value = "日期，比如20210531")
    private Integer reportDate;



}
