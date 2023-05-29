package com.dx.facade.report.param.report.netamountday;


import com.dx.facade.report.param.base.LocalDatePageRequest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ApiModel("每日盈亏报表查询对象")
public class NetAmountDayReqDTO extends LocalDatePageRequest {
    @ApiModelProperty("商户Id")
    private String merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

}
