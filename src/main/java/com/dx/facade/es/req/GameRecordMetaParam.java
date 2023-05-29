package com.dx.facade.es.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameRecordMetaParam {
    @ApiModelProperty("开始时间")
    private Long startTime;

    @ApiModelProperty("结束时间")
    private Long endTime;

    @ApiModelProperty("注单状态(0未结算,1已结算)")
    private Integer obBetStatus;

    @ApiModelProperty("注单状态(0未结算,1已结算)")
    private Long memberId;

    @ApiModelProperty("语言环境")
    private String language;
}
