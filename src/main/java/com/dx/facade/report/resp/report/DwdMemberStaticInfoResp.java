package com.dx.facade.report.resp.report;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员列表》会员统计》全量统计
 */
@ApiModel(description = "会员统计全量统计对象")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DwdMemberStaticInfoResp {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "会员ID")
    private Long playerId;

    @ApiModelProperty("会员账号")
    private String playerName;
    @ApiModelProperty("会员姓名")
    private String realName;

    @ApiModelProperty("账号类型（1-正式，2-商务，3-置换）")
    private Integer accountType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "上级代理ID")
    private Long parentProxyId;
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;
    @ApiModelProperty("总代账号")
    private String topProxyName;
    @ApiModelProperty("主商户")
    private String topMerchantName;
    @ApiModelProperty("所属商户")
    private String merchantName;
    @ApiModelProperty("VIP等级")
    private Integer vipLevel;
    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;
    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;
    @ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;
    @ApiModelProperty("注册时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime registerAt;
    @ApiModelProperty("币种")
    private String currency;
    @ApiModelProperty("首存金额")
    private BigDecimal firstDepositAmount;
    @ApiModelProperty("首存时间")
    private String firstDepositTime;
    @ApiModelProperty("总存款")
    private BigDecimal depositAmount;
    @ApiModelProperty("存款次数")
    private Integer depositTimes;
    @ApiModelProperty("总取款")
    private BigDecimal withdrawAmount;
    @ApiModelProperty("取款次数")
    private Integer withdrawTimes;
    @ApiModelProperty("存取差")
    private BigDecimal depositWithdrawDifferAmount;
    @ApiModelProperty("注单量")
    private Long betCount;
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;
    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;
    @ApiModelProperty("返水金额")
    private BigDecimal returnWaterAmount;
    @ApiModelProperty("优惠总额")
    private BigDecimal discountAmount;
    @ApiModelProperty("其他调整")
    private BigDecimal otherAdjustAmount;
    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit;
    @ApiModelProperty("上级转入")
    private BigDecimal proxyAssistDepositAmount;
    @ApiModelProperty("转入次数")
    private Long proxyAssistDepositTimes;
    @ApiModelProperty("佣金转回")
    private BigDecimal proxyTransferInnerAmount;
    @ApiModelProperty("转回次数")
    private Long proxyTransferInnerTimes;
    @ApiModelProperty("转代次数")
    private Long switchProxyCount;

    @ApiModelProperty("代理上分金额")
    private BigDecimal proxyUpAmount;
    @ApiModelProperty("代理上分次数")
    private Long proxyUpTimes;
    @ApiModelProperty("代理下分金额")
    private BigDecimal proxyDownAmount;
    @ApiModelProperty("代理下分次数")
    private Long proxyDownTimes;
    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额
     *
     * @return
     */
    public BigDecimal getNetProfit() {
        netAmount=netAmount==null?BigDecimal.ZERO:netAmount;
        returnWaterAmount=returnWaterAmount==null?BigDecimal.ZERO:returnWaterAmount;
        discountAmount=discountAmount==null?BigDecimal.ZERO:discountAmount;
        otherAdjustAmount=otherAdjustAmount==null?BigDecimal.ZERO:otherAdjustAmount;
        return netAmount.add(returnWaterAmount).add(discountAmount).add(otherAdjustAmount);
    }



}
