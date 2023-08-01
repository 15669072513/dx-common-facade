package com.dx.facade.texas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author cutoff
 * @description 筹码变动
 * @date 2023/8/1 11:41:49
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DxTransferInChipScoreDto implements Serializable {
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
     * 变动的筹码
     */
    private BigDecimal amount;

    /**
     * 事件ID
     */
    private Long eventId;

    /**
     * 事件Time
     */
    private Long eventTime;

    /**
     * 第一手编号
     */
    private String handCode;

}
