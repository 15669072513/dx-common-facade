package com.dx.facade.report.param.report.venuenetamountday;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("场馆盈亏-场馆名称下拉列表-查询对象")
public class VenueNameReqDTO {

    @ApiModelProperty("场馆类型")
    private String venueType;

}
