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
public class GameOrderRecordDetailVenueResp implements Serializable {
    /**
     * 会员账号状态（1-正常，2-登录锁定，3-游戏锁定，4-充提锁定）
     */
    @ApiModelProperty("会员账号状态（1-正常，2-登录锁定，3-游戏锁定，4-充提锁定）")
    private Integer accountStatus;
    /**
     * 用户类型 0 正式账号 1测试账号
     */
    @ApiModelProperty("用户类型 0 正式账号 1测试账号")
    private Integer accountType;
    /**
     * 会员账号
     */
    @ApiModelProperty("会员账号")
    private String userName;
    /**
     * 游戏账号
     */
    @ApiModelProperty("游戏账号")
    private String playerName;
    /**
     * 上级代理账号
     */
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;
    /**
     * 总代账号
     */
    @ApiModelProperty("总代账号")
    private String topProxyName;
    /**
     * 主键id
     */
    @ApiModelProperty("注单号")
    private Long id;
    /**
     * 流水订单号
     */
    @ApiModelProperty("三方订单号")
    private String orderNo;
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
    @ApiModelProperty("牌桌号")
    private Long tableCode;
    /**
     * 牌桌名称
     */
    @ApiModelProperty("牌桌名称")
    private String tableName;
    /**
     * 手牌code
     */
    @ApiModelProperty("手牌号")
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
    @ApiModelProperty("输赢金额")
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
     * 结算状态 (0已结算 1未结算 2取消)
     */
    @ApiModelProperty("注单状态 0-未结算 1已结算 2-不结算")
    private Integer obBetStatus;
    /**
     *  终端类型
     */
    @ApiModelProperty("投注终端")
    private Integer obDeviceType;
    /**
     * 创建时间
     */
    @ApiModelProperty("同步时间")
    private Long createAt;


}
