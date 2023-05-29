package com.dx.facade.report.param.report.venuenetamountday;

import com.dx.facade.report.param.base.LocalDatePageRequest;

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
@ApiModel("场馆详情请求参数")
public class VenueNetAmountDayDetailReqDTO extends LocalDatePageRequest {

    @ApiModelProperty("场馆")
    private String gameCode;

    @ApiModelProperty("商户Id")
    private String merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;


}
