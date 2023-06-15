package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameOrderUserReq extends BaseRequest  {
    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("代理id")
    private Long proxyId;
    @ApiModelProperty("会员范围 0 全部会员 1直属会员")
    private Integer userRange;
}
