package com.dx.facade.game.dto;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 拉单结束异步通知DTO
 * 
 * @author karthus
 * @date 2022/10/11
 */
@Data
public class PullEndMqDto {

    /**
     * 商户id
     */
    private Long merchantId;
    /**
     * 用户id
     */
    private Long memberId;
    /**
     * 场馆编码
     */
    private String venueCode;

    /**
     * 有效投注额
     */
    private BigDecimal validBetAmount;

    /**
     * 单号
     */
    private String id;

    /**
     * 赔率是否有效:1有效0无效
     */
    private Integer oddsValid;

    /**
     * 结束时间=当前注单被结算的时间
     */
    private Long netAt;
}
