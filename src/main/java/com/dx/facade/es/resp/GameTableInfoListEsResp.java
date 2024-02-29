package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author buyin
 * @data 2023/7/14 13:57
 */
@Data
public class GameTableInfoListEsResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    private String handId;

    @ApiModelProperty("牌局code，业务生成")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

    @ApiModelProperty("牌桌类型 2001:德州局 2002:短牌局")
    private Long tableType;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("俱乐部主键")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;

    @ApiModelProperty("流水订单号，流水信息主键")
    private String orderNo;

    @ApiModelProperty("游戏ID")
    private Long gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("游戏类型 2001:德州局 2002:短牌局")
    private Integer gameType;

    @ApiModelProperty("玩家ID")
    private Long userId;

    @ApiModelProperty("玩家名称")
    private String playerName;

    @ApiModelProperty("牌桌创建时间")
    private Long tableCreateDate;

    @ApiModelProperty("牌局开始时间")
    private Long handBeginDate;

    @ApiModelProperty("牌局结束时间")
    private Long handEndDate;

    @ApiModelProperty("'参与用户ID集合'")
    private String userIds;

    @ApiModelProperty("参与用户名称集合")
    private String userNames;

    @ApiModelProperty("局次")
    private Integer handNum=0;

    @ApiModelProperty("期初金额汇总")
    private BigDecimal firstBringChip=BigDecimal.ZERO;

    @ApiModelProperty("中途带入金额汇总")
    private BigDecimal bringMidwayChip=BigDecimal.ZERO;

    @ApiModelProperty("期末余额汇总")
    private BigDecimal afterChip=BigDecimal.ZERO;

    @ApiModelProperty("公牌信息")
    private String globalPokerCode;

    @ApiModelProperty("有效底池")
    private BigDecimal effectivePool=BigDecimal.ZERO;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("1 进行中 2已结束")
    private Integer tableStatus;

    @ApiModelProperty("抽水金额")
    private BigDecimal pumpAmount=BigDecimal.ZERO;

    @ApiModelProperty("会员输赢汇总")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("总保险盈亏")
    private BigDecimal insuredNetAmount=BigDecimal.ZERO;

    @ApiModelProperty("总牌桌盈亏")
    private BigDecimal costTotal=BigDecimal.ZERO;

    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("庄家位置")
    private Integer button;

    @ApiModelProperty("小盲位置")
    private Integer sbChairId;

    @ApiModelProperty("大盲位置")
    private Integer bbChairId;

    @ApiModelProperty("创建时间")
    private Long createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private Long updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;

    @ApiModelProperty("牌桌冻结服务费")
    private BigDecimal tableFreezeFee = BigDecimal.ZERO;
}

