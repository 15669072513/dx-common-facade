package com.dx.facade.report.param.report.venuenetamountday;

import com.dx.facade.report.param.base.LocalDatePageRequest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("场馆盈亏-查询对象")
public class VenueNetAmountDayReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("商户Id")
    private String merchantId;

    @ApiModelProperty("场馆类型")
    private String venueType;

    @ApiModelProperty(value = "场馆名称")
    private String gameCode;

    @ApiModelProperty(value = "场馆名称")
    private List<String> gameCodes;
}
