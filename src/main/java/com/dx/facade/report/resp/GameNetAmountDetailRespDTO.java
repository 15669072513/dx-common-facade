package com.dx.facade.report.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class GameNetAmountDetailRespDTO {

    @ApiModelProperty("详情list")
    private List<GameNetAmountRespDTO> record;

    @ApiModelProperty("汇总")
    private GameNetAmountSummaryRespDTO summary;
}
