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

    @ApiModelProperty("上级代理id")
    private String parentProxyId;
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    private String playerName;
    @ApiModelProperty("会员昵称")
    private String nickName;
    @ApiModelProperty("开始时间")
    private Long handBeginDate;
    @ApiModelProperty("结束时间")
    private Long handEndDate;

    @ApiModelProperty("打牌输赢")
    private BigDecimal netAmount;

    @ApiModelProperty("保险输赢")
    private BigDecimal insuredNetAmount;

    @ApiModelProperty("总输赢")
    private BigDecimal costTotal;

    @ApiModelProperty("总带入")
    private BigDecimal bringMidwayChip;

    @ApiModelProperty("总带出")
    private BigDecimal bringOutChipScore;

    @ApiModelProperty("总带入次数")
    private Long bringCount;
}
