package com.dx.facade.es.req;

import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GameRecordParamPC extends PageRequest {
    @ApiModelProperty(value = "会员id")
    private Long memberId;

    @ApiModelProperty("开始时间")
    private Long startTime;

    @ApiModelProperty("结束时间")
    private Long endTime;

    @ApiModelProperty(value = "注单状态 0-未结算 1已结算 2-不结算(如果是全部,则不传此参数)")
    private Integer obBetStatus;

    @ApiModelProperty(value = "场馆类型code,见BwVenueTypeEnum")
    private String venueTypeCode;

    @ApiModelProperty(value = "场馆code,见BwVenueEnum")
    private String venueCode;

    @ApiModelProperty("语言环境")
    private String language;
}

