package com.dx.facade.texas.dto;

import com.dx.enums.ChipScoreEnum;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author cutoff
 * @description 筹码变动
 * @date 2023/8/1 11:41:49
 */
@Data
public class DxChipScoreChangeDto implements Serializable {
    private static final long serialVersionUID = -7232391198886541199L;

    /**
     * 用户userId
     */
    private Long userId;

    /**
     * 钱包类型
     */
    private Integer walletType;

    /**
     * 筹码变动类型 1-从中心钱包转入 2-转入中心钱包 3-带入牌桌 4-带出牌桌 5-投注 6-结算
     *
     * @see ChipScoreEnum.ChangeTypeEnum
     */
    private Integer changeType;

    /**
     * 牌桌ID
     */
    private Long tableId;

    /**
     * 牌桌名字
     */
    private String tableName;

    /**
     * 币种 USDT
     */
    private String currency;

    /**
     * 账变前余额
     */
    private BigDecimal changeBefore;

    /**
     * 变动的筹码
     */
    private BigDecimal amount;

    /**
     * 账变后余额
     */
    private BigDecimal changeAfter;

    /**
     * 事件ID
     */
    private Long eventId;

    /**
     * 事件Time
     */
    private Long eventTime;

    /**
     * 事件类型 0-牌桌 1-手牌
     */
    private Integer eventType;


    /**
     * 第一手编号
     */
    private String handCode;

}
