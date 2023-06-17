package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 注单详情查询结果对象
 */
@Data
public class GameOrderRecordDetailResp implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    private Long id;
    /**
     * 用户类型 0 正式账号 1测试账号
     */
    @ApiModelProperty("用户类型 0 正式账号 1测试账号")
    private Integer accountType;
    /**
     * 游戏账号
     */
    @ApiModelProperty("游戏账号")
    private String playerName;
    /**
     * 场馆名称
     */
    @ApiModelProperty("场馆名称")
    private String venueName;
    /**
     * 俱乐部id
     */
    @ApiModelProperty("俱乐部id")
    private Long clubId;
    /**
     * 牌桌code
     */
    @ApiModelProperty("牌桌编码")
    private String tableCode;
    /**
     * 游戏名称
     */
    @ApiModelProperty("游戏名称")
    private String gameName;
    /**
     * 手牌code
     */
    @ApiModelProperty("手牌编码")
    private String handCode;
    /**
     * 投注金额
     */
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;
    /**
     * 有效投注（抽水金额）
     */
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;
    /**
     *  盈亏的筹码
     */
    @ApiModelProperty("盈亏的金额")
    private BigDecimal netAmount;
    /**
     * 玩家ip
     */
    @ApiModelProperty("投注IP")
    private String loginIp;
    /**
     * 投注时间
     */
    @ApiModelProperty("投注时间")
    private Long handBeginDate;
    /**
     * 结束时间
     */
    @ApiModelProperty("结算时间")
    private Long handEndDate;
    /**
     *  终端类型
     */
    @ApiModelProperty("终端类型")
    private Integer obDeviceType;
    /**
     * 结算状态 (0已结算 1未结算 2取消)
     */
    @ApiModelProperty("注单状态 0-未结算 1已结算 2-不结算")
    private Integer obBetStatus;


}
