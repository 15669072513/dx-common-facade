package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 游戏个人信息Req
 * </p>
 * @author broadway
 * @since 2023-08-05
 */
@Data
public class DxGamePersonalTableReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id集合")
    private List<Long> userIds;

    @ApiModelProperty("牌桌类型 2001:德州局 2002:短牌局")
    private Long tableType;

    @ApiModelProperty("牌桌id")
    private Long tableId;
}
