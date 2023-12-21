package com.dx.facade.game.resp;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GameRecordUserHandResp {
    private static final long serialVersionUID = 1L;

    /**
     * 牌桌主键
     */
    private Long tableId;

    /**
     * 牌桌编码
     */
    private String tableCode;

    /**
     * 牌桌类型
     */
    private Long tableType;

    /**
     *手牌开始时间
     */
    private Long handBeginDate;

    /**
     *手牌结束时间
     */
    private Long handEndDate;

    /**
     *牌桌开始时间
     */
    private Long tableBeginDate;

    /**
     *牌桌创建时间
     */
    private Long tableCreateDate;

    /**
     * 牌局主键，自增
     */
    private String handId;

    /**
     * 牌局code，按业务规则生成
     */
    private String handCode;

    /**
     * 公牌信息
     */
    private String publicCards;

    /**
     * 俱乐部主键
     */
    private Long clubId;

    /**
     * 俱乐部名称
     */
    private String clubName;

    /**
     * 小盲注
     */
    private BigDecimal sbBlindScore=BigDecimal.ZERO;

    /**
     * 大盲注
     */
    private BigDecimal bbBlindScore=BigDecimal.ZERO;

    /**
     * 庄家位置
     */
    private Integer button;

    /**
     * 小盲位置
     */
    private Integer sbChairId;

    /**
     * 大盲位置
     */
    private Integer bbChairId;

    /**
     * 局次
     */
    private Integer handNum;

    /**
     * 抽水金额
     */
    private BigDecimal pumpingAmount=BigDecimal.ZERO;

    /**
     * 总底池
     */
    private BigDecimal totalPotAmount=BigDecimal.ZERO;

    /**
     * 商户id
     */
    private Long merchantId;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 商户路径
     */
    private String merchantPath;


    /**
     * 上级商户id
     */
    private Long parentMerchantId;

    /**
     * 上级商户路径
     */
    private String parentMerchantPath;

    /**
     * 总商户id
     */
    private Long topMerchantId;

    /**
     * 总商户名称
     */
    private String topMerchantName;

    /**
     * 代理等级
     */
    private Integer proxyLevel;

    /**
     * 上级代理id
     */
    private Long parentProxyId;

    /**
     * 上级代理账号
     */
    private String parentProxyName;

    /**
     * 上级代理路径
     */
    private String parentProxyPath;

    /**
     * 总代id
     */
    private Long topProxyId;

    /**
     * 总代账号
     */
    private String topProxyName;

    /**
     * 参与用户ID
     */
    private Long userId;

    /**
     * 参与用户名称
     */
    private String userName;

    /**
     * 参与用户昵称
     */
    private String nickName;

    /**
     * 用户头像
     */
    private String userHeadUrl;

    /**
     * 初期金额
     */
    private BigDecimal beginAmount=BigDecimal.ZERO;

    /**
     * 中途带入金额
     */
    private BigDecimal bringMidwayAmount=BigDecimal.ZERO;

    /**
     * 期末金额
     */
    private BigDecimal endAmount=BigDecimal.ZERO;

    /**
     * 参与用户手牌
     */
    private String handCard;


    /**
     * 有效底池
     */
    private BigDecimal effectivepool=BigDecimal.ZERO;

    /**
     * 保险盈亏
     */
    private BigDecimal insuredNetAmount;

    /**
     * 会员输赢汇总
     */
    private BigDecimal netAmount=BigDecimal.ZERO;

    /**
     * 盈利筹码
     */
    private BigDecimal winAmount=BigDecimal.ZERO;

    /**
     * 游戏投注金额
     */
    private BigDecimal betAmount=BigDecimal.ZERO;

    /**
     * 保险投注金额
     */
    private BigDecimal insuredBetAmount=BigDecimal.ZERO;

    /**
     * 有效投注金额
     */
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    /**
     * 保险有效投注金额
     */
    private BigDecimal insuredValidBetAmount=BigDecimal.ZERO;

    /**
     * 抽水贡献
     */
    private BigDecimal pumpContribution=BigDecimal.ZERO;

    /**
     * 带入次数
     */
    private Long bringCount=0L;

    /**
     * 主动入池次数
     */
    private Long activeBringPoolNumber = 0L;

    /**
     * Walks手牌数
     */
    private Long walksHandNumber = 0L;

    /**
     * 翻牌前加注次数
     */
    private Long preFlopRaiseNumber = 0L;

    /**
     * 翻牌前的游戏手数
     */
    private Long preFlopHandNumber = 0L;
}
