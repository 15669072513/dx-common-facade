package com.dx.facade.venue.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

import com.dx.facade.common.PageRequest;

@Data
public class GameVenueListReq extends PageRequest {

    @ApiModelProperty(value = "所属场馆(即bw_venue表的venue_code)")
    private String venueCode;

    @ApiModelProperty(value = "场馆类型")
    private String venueTypeCode;

    @ApiModelProperty(value = "设备类型", hidden = true)
    private Integer clientType;

    @ApiModelProperty(value = "排序类型(1-游戏名称 a-z 2.游戏名称z-a 3--热门 4--最新)")
    private Integer oderKey;

    @ApiModelProperty(value = "排序方式(ASC 和 DESC)",example = "DESC")
    private String orderBy;

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
}
