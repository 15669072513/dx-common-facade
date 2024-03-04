package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 注单详情查询结果对象
 */
@Data
public class GameOrderRecordDetailResp implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    private String id;

    @ApiModelProperty("注单id")
    private String generatedId;

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
    private String clubId;
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
    private BigDecimal betAmount=BigDecimal.ZERO;
    /**
     * 有效投注（抽水金额）
     */
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount=BigDecimal.ZERO;
    /**
     *  盈亏的筹码
     */
    @ApiModelProperty("盈亏的金额")
    private BigDecimal netAmount=BigDecimal.ZERO;
    /**
     * 玩家ip
     */
    @ApiModelProperty("投注IP")
    private String loginIp;
    /**
     * 投注时间
     */
    @ApiModelProperty("投注时间")
    private String handBeginDate;
    /**
     * 游戏类型 （GameTypeEnum）
     */
    @ApiModelProperty("游戏类型 2001 德州游戏 2002 德州短牌局")
    private Integer gameType;

    @ApiModelProperty("场馆类型code(如zr,ty,qkl)")
    private String venueTypeCode;
    /**
     * 结束时间
     */
    @ApiModelProperty("结算时间")
    private String handEndDate;
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

    @ApiModelProperty("该类游戏总输赢")
    private BigDecimal netAmountSum=BigDecimal.ZERO;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("总代id")
    private Long topProxyId;

    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("玩家id")
    private Long memberId;

    @ApiModelProperty("会员账号")
    private String memberName;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("币种")
    private String memberCurrency;

    @ApiModelProperty(value = "二级类型 对应枚举GameRecordTypeEnum")
    private Integer betType;

    @ApiModelProperty(value = "二级类型对应枚举GameRecordTypeEnum")
    private String betTypeDesc;

    @ApiModelProperty(value = "一级类型 对应枚举GameRecordTypeEnum")
    private Integer parentOrderType;

    @ApiModelProperty(value = "一级类型 对应枚举GameRecordTypeEnum")
    private String parentOrderTypeDesc;

    @ApiModelProperty(value = "抽水贡献")
    private BigDecimal pumpContribution;
}
