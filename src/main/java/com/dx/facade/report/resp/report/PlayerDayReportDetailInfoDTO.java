package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDayReportDetailInfoDTO {

    @ApiModelProperty("集合-list")
    private List<PlayerDayReportDetailDTO> record;

    @ApiModelProperty("汇总")
    private PlayerDayReportDetailDTO summary;

}
