package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@ApiModel("游戏回顾查询对象")
@Data
public class GameRecordHandReq extends BaseRequest {
    /**
     * 牌桌id
     */
    @ApiModelProperty("牌桌id")
    @NotNull(message = "牌桌id不能为空")
    private Long tableId;

    @ApiModelProperty("登录会员id")
    private Long userId;
}
