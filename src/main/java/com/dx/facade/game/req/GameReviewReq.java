package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("游戏回顾查询对象")
@Data
public class GameReviewReq extends BaseRequest {
    /**
     * 牌桌id
     */
    @ApiModelProperty("牌桌id")
    private Long tableId;
    /**
     * 局次（牌桌第多少局）
     */
    @ApiModelProperty("局次")
    private Integer roundNo;
    /**
     * 登录会员id
     */
    @ApiModelProperty("登录会员id")
    private Long userId;
}
