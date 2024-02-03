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
    private BigDecimal netAmount = BigDecimal.ZERO;

    @ApiModelProperty("保险输赢")
    private BigDecimal insuredNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("总输赢")
    private BigDecimal costTotal = BigDecimal.ZERO;

    @ApiModelProperty("总带入")
    private BigDecimal bringMidwayChip = BigDecimal.ZERO;

    @ApiModelProperty("总带出")
    private BigDecimal bringOutChipScore = BigDecimal.ZERO;

    @ApiModelProperty("总带入次数")
    private Long bringCount = 0L;

    @ApiModelProperty("牌桌id")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

    @ApiModelProperty("手数")
    private Long handCount;

    @ApiModelProperty(value = "抽水贡献")
    private BigDecimal pumpContribution;
}
