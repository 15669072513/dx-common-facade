package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameOrderUserFlowWaterReq extends BaseRequest  {
    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("会员范围")
    private Integer userRange;
}
