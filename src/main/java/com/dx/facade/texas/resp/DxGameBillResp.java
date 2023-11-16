package com.dx.facade.texas.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author cutoff
 * @description 实时账单数据
 * @date 2023/10/17 20:33:04
 */
@Data
public class DxGameBillResp implements Serializable {

    private static final long serialVersionUID = -815345488749761929L;
    /***
     * 昵称
     */
    private String nickName;
    /***
     * 头像
     */
    private String topImagesUrl;

    /***
     * 牌桌id
     */
    private Long tableId;

    /***
     *  用户id
     */
    private Long userId;

    /***
     * 这一局当前剩余筹码
     */
    private BigDecimal chipScore = BigDecimal.ZERO;

    /**
     * 总带入筹码
     */
    private BigDecimal totalBringScore = BigDecimal.ZERO;

    /**
     * 盈亏筹码  当前筹码-开始前筹码
     */
    private BigDecimal profitLossAmount = BigDecimal.ZERO;

    /***
     * 默认币种：USDT
     */
    private final String currency = "USDT";

    /**
     * 用户局次统计
     */
    private int userRoundNo = 0;
}
