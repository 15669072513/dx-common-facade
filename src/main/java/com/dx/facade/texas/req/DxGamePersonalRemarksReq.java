package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * <p>
 * 游戏个人信息备注Req
 * </p>
 * @author broadway
 * @since 2024-01-27
 */
@Data
public class DxGamePersonalRemarksReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("设置备注的用户id集合")
    private List<Long> remarkUserIds;
}
