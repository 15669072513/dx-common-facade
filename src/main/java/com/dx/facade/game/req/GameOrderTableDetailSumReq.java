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

}
