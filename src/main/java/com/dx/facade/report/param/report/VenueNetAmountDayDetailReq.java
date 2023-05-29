package com.dx.facade.report.param.report;

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
@ApiModel(value = "VenueNetAmountDayDetailReq", description = "场馆盈亏详情列表请求对象", parent = LocalDatePageRequest.class)
public class VenueNetAmountDayDetailReq extends LocalDatePageRequest {


    @ApiModelProperty(value = "场馆编码", example = "zr", required = true)
    private String gameCode;

}
