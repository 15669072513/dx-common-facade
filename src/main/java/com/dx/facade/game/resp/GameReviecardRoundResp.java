package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class GameReviecardRoundResp {
    @ApiModelProperty("手牌编码")
    private String id="";

    @ApiModelProperty("俱乐部Id")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;

    @ApiModelProperty("牌桌类型 2001:德州局 2002:短牌局")
    private Long gameType;

    @ApiModelProperty("总底池金额")
    private BigDecimal potAmount;

    @ApiModelProperty("手牌时间")
    private String handEndDateStr;

    @ApiModelProperty(value = "当前玩家座位类型,参考枚举:TexasSeatTypeEnum")
    private Integer currentSeatCode;

    @ApiModelProperty("牌桌设置的最大人数")
    private Long maxSeatCount;

    @ApiModelProperty("牌桌实际参与的人数")
    private Long joinCount;

    @ApiModelProperty("玩家牌局数量")
    private Long userHandCount=0L;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    @ApiModelProperty("公共牌信息")
    private List<Integer> publicCards =new ArrayList<>();

    @ApiModelProperty("手牌号")
    private Integer roundNo;
}
