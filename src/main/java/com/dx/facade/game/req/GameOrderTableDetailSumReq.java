package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 牌局详情查询对象
 */
@ApiModel("牌局详情查询对象")
@Data
public class GameOrderTableDetailSumReq extends BaseRequest {
    /**
     * 牌桌id
     */
    @ApiModelProperty("牌桌id")
    private Long tableId;

    @ApiModelProperty(value = "页面来源：1.牌桌解散战绩查询(1.6.0局抽新增)", required = false)
    private Integer pageSource;

}
