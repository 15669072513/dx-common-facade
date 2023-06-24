package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel("俱乐部贡献-请求对象")
@Data
public class GameOrderClubSumReq extends BaseRequest {
    @ApiModelProperty("俱乐部id")
    private List<Long> clubIdList;
    @ApiModelProperty("会员id")
    private Long userId;
    @ApiModelProperty("俱乐部id")
    private Long clubId;
    @ApiModelProperty("代理id")
    private Long proxyId;
    @ApiModelProperty("手牌id")
    private List<Long> handIdList;
}
