package com.dx.facade.report.param.report.business;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;

public class MemberReportReqDTO extends BusinessBasicReportReqDTO {

    @ApiModelProperty(value = "会员账号", example = "zw9z_string0001")
    private String playerName;

}
