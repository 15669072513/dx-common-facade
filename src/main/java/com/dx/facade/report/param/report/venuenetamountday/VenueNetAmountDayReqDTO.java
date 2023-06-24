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
    @Deprecated
    @ApiModelProperty("场馆类型")
    private String venueType;


    @Deprecated
    @ApiModelProperty(value = "场馆名称")
    private String gameCode;

    // TODO 修改查询条件
    @ApiModelProperty(value = "场馆类型")
    private List<String> venueTypes;


    @ApiModelProperty(
            value = "排序列名，merchantId",
            example = "merchantId"
    )

    private String orderKey;
    @ApiModelProperty(
            value = "排序方式(1)：desc-降序 asc-升序",
            example = "asc"
    )
    private String sortType;


}
