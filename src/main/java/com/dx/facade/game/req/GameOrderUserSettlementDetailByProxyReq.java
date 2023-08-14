package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("代理后台-结算详情查询对象")
@Data
public class GameOrderUserSettlementDetailByProxyReq extends BaseRequest {
    @ApiModelProperty("游戏类型")
    private Long gameType;
    @ApiModelProperty("牌桌id")
    private Long tableId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("会员账号")
    private String playerName;

    @ApiModelProperty("代理id")
    private Long proxyId;

    @ApiModelProperty("代理账号")
    private String proxyUserName;

    @ApiModelProperty("手牌开始-起始时间")
    private String hStartTime;
    @ApiModelProperty("手牌开始-结束时间")
    private String hEndTime;

    @ApiModelProperty("手牌结束-起始时间")
    private String h2StartTime;
    @ApiModelProperty("手牌结束-结束时间")
    private String h2EndTime;


}
