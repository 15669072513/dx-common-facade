package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 游戏记录查询对象
 */
@ApiModel("德信-游戏记录查询对象")
@Data
public class GameOrderAggReq extends BaseRequest {

    @ApiModelProperty("注单id")
    private Long id;

}
