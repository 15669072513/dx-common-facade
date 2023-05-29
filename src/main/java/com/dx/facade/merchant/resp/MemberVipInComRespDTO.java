package com.dx.facade.merchant.resp;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Nichols
 */
@Data
@TableName("ob_player.ob_member_vip_income")
public class MemberVipInComRespDTO {

    @ApiModelProperty(value = "id")
    private Long id;
    /**
     * 序号（VIP等级）
     */
    @ApiModelProperty(value = "序号（VIP等级）")
    private String vipSerialNum;

    /**
     * 日提款次数
     */
    @ApiModelProperty(value = "日提款次数")
    private Integer dayWithdrawalNum;

    /**
     * 每日累计提款额度
     */
    @ApiModelProperty(value = "每日累计提款额度")
    private BigDecimal dayWithdrawalQuota;

    /**
     * 升级礼金
     */
    @ApiModelProperty(value = "升级礼金")
    private BigDecimal upgradeBonus;

    /**
     * 生日礼金
     */
    @ApiModelProperty(value = "生日礼金")
    private BigDecimal birthdayBonus;

    /**
     * 上半月红包
     */
    @ApiModelProperty(value = "上半月红包")
    private BigDecimal aboveMonthRedEnvelope;

    /**
     * 下半月红包
     */
    @ApiModelProperty(value = "下半月红包")
    private BigDecimal belowMonthRedEnvelope;

    @ApiModelProperty(value = "序号（VIP等级）")
    private String vipGradeName;

    /**
     * 存款额度
     */
    @ApiModelProperty(value = "存款额度")
    private BigDecimal depositLimit;

    /**
     * 每日反水上限
     */
    @ApiModelProperty(value = "每日反水上限")
    private BigDecimal dailyRebateCap;

}
