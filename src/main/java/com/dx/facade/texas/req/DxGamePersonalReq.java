package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <p>
 * 游戏个人信息Req
 * </p>
 * @author broadway
 * @since 2023-08-05
 */
@Data
public class DxGamePersonalReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("当前用户id")
    private Long currentUserId;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("牌桌类型 2001:德州局 2002:短牌局")
    private Long tableType;

    @ApiModelProperty("牌桌ID")
    private Long tableId;

    @ApiModelProperty("重跑标记：0 按注单 1 按行为数据")
    private Integer isRecord = 0;
}
