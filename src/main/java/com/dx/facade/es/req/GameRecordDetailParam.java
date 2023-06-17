package com.dx.facade.es.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameRecordDetailParam {
    @ApiModelProperty("开始时间")
    private Long startTime;

    @ApiModelProperty("结束时间")
    private Long endTime;

    @ApiModelProperty("注单状态(0未结算,1已结算 2 取消)")
    private Integer obBetStatus;

    @ApiModelProperty("会员id")
    private Long memberId;

    @ApiModelProperty("场馆code")
    private String venueCode;

    @ApiModelProperty("语言环境")
    private String language;
}
