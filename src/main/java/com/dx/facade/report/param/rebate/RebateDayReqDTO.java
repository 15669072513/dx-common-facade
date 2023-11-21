package com.dx.facade.report.param.rebate;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RebateDayReqDTO {

    @ApiModelProperty(value = "日期，比如20210531")
    private Integer staticsDate;

    @ApiModelProperty(value = "类型  1 团队 2 下级会员")
    private Integer reportType;

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "会员ID")
    private Long memberId;

    @ApiModelProperty(value = "平台标识： 0-非平台 1-平台，2-全部（聚合）")
    private Integer platFormFlag;

}
