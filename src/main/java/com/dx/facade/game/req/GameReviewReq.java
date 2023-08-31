package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@ApiModel("游戏回顾查询对象")
@Data
public class GameReviewReq extends BaseRequest {
    /**
     * 牌桌id
     */
    @ApiModelProperty("牌桌id")
    @NotNull(message = "牌桌id不能为空")
    private Long tableId;

    /** 手牌code */
    @ApiModelProperty("手牌code")
    private String handCode;
    /**
     * 局次（牌桌第多少局）
     */
    @ApiModelProperty("局次")
    @NotNull(message = "局次不能为空")
    private Integer roundNo;
    /**
     * 登录会员id
     */
    @ApiModelProperty("登录会员id")
    private Long userId;

    @ApiModelProperty("平台标识 1，app  2,代理 3,中控")
    private Integer platFormId;
}
