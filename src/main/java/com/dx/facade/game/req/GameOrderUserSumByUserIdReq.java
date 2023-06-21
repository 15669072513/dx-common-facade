package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 玩家牌桌查询对象
 */
@ApiModel("玩家牌桌查询对象")
@Data
public class GameOrderUserSumByUserIdReq extends BaseRequest {
    /**
     * 玩家id
     */
    @ApiModelProperty("玩家id")
    private List<Long> userIdList;
    /**
     * 俱乐部id
     */
    @ApiModelProperty("俱乐部id")
    private Long clubId;

}
