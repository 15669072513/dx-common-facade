package com.dx.facade.es.resp;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GameRecordDjAndTyDetailDto {

    @ApiModelProperty("赛事详情")
    private String eventDetails;

    @ApiModelProperty("盘口详情")
    private String handicapDetails;

    @ApiModelProperty("注单详情")
    private String betDetails;

    @ApiModelProperty("结算时间")
    private Long netAt;

    @ApiModelProperty("结算时间(yyyy-MM-dd HH:mm:ss")
    private String netAtString;

    @ApiModelProperty("游戏名称")
    private String gameTypeName;

    @ApiModelProperty("赛事")
    private String event;

    @ApiModelProperty("玩法")
    private String playName;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("阶段")
    private String marketType;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount = BigDecimal.ZERO;

    @ApiModelProperty("赔率")
    private String oddsValues;

    @ApiModelProperty("比赛对阵")
    private String matchInfo;
    @ApiModelProperty("联赛名称")
    private String matchName;
    @ApiModelProperty("投注类型1 ：早盘赛事 ，2： 滚球盘赛事，3： 冠军盘赛事，4： 虚拟赛事，5： 电竞赛事")
    private Integer matchType;
    @ApiModelProperty("让球值")
    private String handicap;
    @ApiModelProperty("电竞团队名称")
    private String sportName;
    @ApiModelProperty("基准分")
    private String scoreBenchmark;
    @ApiModelProperty("投注项名称")
    private String playOptionName;

}
