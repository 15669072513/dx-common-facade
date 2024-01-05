package com.dx.facade.report.resp.venuenetamountday;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * 本版本结构是 重构 中控后台-报表-场馆盈亏
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewVenueNetAmountRespDTO {

    @ApiModelProperty("日期")
    private String staticsDate;

    @ApiModelProperty("场馆盈亏数据列表")
    private List<VenueNetAmountDayRespDTO> venueNetAmountDayRespDTOS;


}
