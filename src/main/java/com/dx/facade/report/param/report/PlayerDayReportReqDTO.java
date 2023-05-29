package com.dx.facade.report.param.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author
 */
@Data
@ApiModel("会员报表列表页-请求对象")
public class PlayerDayReportReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("商户Id")
    private String merchantId;

    @ApiModelProperty(value = "会员账号", example = "zw9z_string0001")
    private String playerName;

    @ApiModelProperty(value = "上级代理", example = "zw9z_string0000")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;

}
