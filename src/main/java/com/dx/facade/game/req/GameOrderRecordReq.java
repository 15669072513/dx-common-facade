package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 游戏记录查询对象
 */
@ApiModel("德信-游戏记录查询对象")
@Data
public class GameOrderRecordReq extends BaseRequest {
    @ApiModelProperty("注单id")
    private String id;
    @ApiModelProperty("3方注单")
    private String generatedId;

    private Long proxyId;

    @ApiModelProperty("游戏账号")
    private String playerName;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("游戏类型")
    private String gameType;

    @ApiModelProperty("手牌id")
    private String handId;

    @ApiModelProperty("手牌Code")
    private String handCode;

    @ApiModelProperty("俱乐部id")
    private Long clubId;

    @ApiModelProperty("牌桌id")
    private String tableId;

    @ApiModelProperty("牌桌Code")
    private String tableCode;

    @ApiModelProperty(value = "注单类型 1 俱乐部游戏 2保险")
    private Integer betType;

    @ApiModelProperty(value = "父类型 全部则为空 对应枚举GameRecordTypeEnum")
    private Integer parentOrderType;

    @ApiModelProperty(value = "子类(如果父类选全部，子类如果是全部则为空，"
        + "如果选择了父类，子类全部则传所有的子类) 对应枚举GameRecordTypeEnum")
    private List<Integer> subOrderTypeList;

    @ApiModelProperty(value = "投注开始时间 yyyy-MM-dd HH:mm:ss")
    private String betStartTime;

    @ApiModelProperty(value = "投注结束时间 yyyy-MM-dd HH:mm:ss")
    private String betEndTime;

    @ApiModelProperty(value = "结算开始时间 yyyy-MM-dd HH:mm:ss")
    private String settlementStartTime;

    @ApiModelProperty(value = "结算结束时间 yyyy-MM-dd HH:mm:ss")
    private String settlementEndTime;

    @ApiModelProperty(value = "牌桌开始时间 yyyy-MM-dd HH:mm:ss")
    private String tableStartTime;

    @ApiModelProperty(value = "牌桌结束时间 yyyy-MM-dd HH:mm:ss")
    private String tableEndTime;

    @ApiModelProperty(value = "投注IP")
    private String ip;

    @ApiModelProperty(value = "投注金额开始值")
    private BigDecimal betAmountStart;

    @ApiModelProperty(value = "投注金额结束值")
    private BigDecimal betAmountEnd;


    @ApiModelProperty(value = "输赢金额开始值")
    private BigDecimal netAmountStart;

    @ApiModelProperty(value = "输赢金额结束值")
    private BigDecimal netAmountEnd;

}
