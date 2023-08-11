package com.dx.facade.report.param.rebate;


import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RebateDayListReqDTO  extends LocalDatePageRequest {

    @ApiModelProperty(value = "日期，比如20210531")
    private Integer staticsDate;


    @ApiModelProperty(value = "会员ID")
    private Long memberId;


}
