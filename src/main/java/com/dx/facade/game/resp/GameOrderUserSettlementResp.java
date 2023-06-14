package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class GameOrderUserSettlementResp {
    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("会员昵称")
    private String nickName;
    @ApiModelProperty("开始时间")
    private LocalDateTime beginDate;
    @ApiModelProperty("结束时间")
    private LocalDateTime endDate;
    @ApiModelProperty("游戏输赢")
    private BigDecimal netChipSum;
    @ApiModelProperty("总带入")
    private BigDecimal bringMidwayChip;
    @ApiModelProperty("总带入次数")
    private BigDecimal bringCount;
}
