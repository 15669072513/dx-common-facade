package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author einson
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberVipPromotionResp implements Serializable {
    /** id */
    @ApiModelProperty("主键id")
    private Long id;

    /** 商户ID */
    @ApiModelProperty("商户ID")
    private Long merchantId;

    /** 序号（VIP等级） */
    @ApiModelProperty("序号（VIP等级）")
    private String vipSerialNum;

    /** 最低转账额度 */
    @ApiModelProperty("最低转账额度")
    private BigDecimal lowestTransferQuota;

    /** 红利比例 */
    @ApiModelProperty("红利比例")
    private BigDecimal bonusRatio;

    /** 最高奖金 */
    @ApiModelProperty("最高奖金")
    private BigDecimal highestBonus;

    /** 流水倍数 */
    @ApiModelProperty("流水倍数")
    private Integer waterMultiple;

    /** 参与次数（0-仅限1次、1-每周1次、2-每月1次） */
    @ApiModelProperty("参与次数（0-仅限1次、1-每周1次、2-每月1次）")
    private Integer participateNum;

    /** 参与场馆 */
    @ApiModelProperty("参与场馆")
    private String participateVenue;

    /** 游戏分类 */
    @ApiModelProperty("游戏分类")
    private String gameName;

    @ApiModelProperty("VIP等级名称")
    private String vipGradeName;

    /** 配置开关 0关 1开 */
    @ApiModelProperty("配置开关")
    private Integer state;
}