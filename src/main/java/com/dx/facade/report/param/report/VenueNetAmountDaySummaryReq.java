package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.dx.facade.report.param.base.LocalDatePageRequest;

/**
 * @author string
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="VenueNetAmountDaySummaryReq",description="场馆盈亏合计请求对象", parent = LocalDatePageRequest.class)
public class VenueNetAmountDaySummaryReq extends LocalDatePageRequest {


    @ApiModelProperty(value = "场馆编码集合", example = "['zr','ty']")
    private List<String> gameCodeList;
    
}
