package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("代理后台-结算详情查询对象")
@Data
public class GameOrderUserSettlementDetailByProxyResp {
    @ApiModelProperty("会员id")
    private String userId;
    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("会员昵称")
    private String nickName;
    @ApiModelProperty("开始时间")
    private Long beginDate;
    @ApiModelProperty("结束时间")
    private Long endDate;
    @ApiModelProperty("游戏输赢")
    private BigDecimal netAmountSum;
    @ApiModelProperty("总带入")
    private BigDecimal bringMidwayChip;
    @ApiModelProperty("总带入次数")
    private Long bringCount;
}
