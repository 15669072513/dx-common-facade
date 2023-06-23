package com.dx.facade.report.resp.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

/**
 * 盈亏报表-会员盈亏 DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountRespDTO {

    @ApiModelProperty(value = "会员Id", dataType = "java.lang.String")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long playerId;

    @ApiModelProperty(value = "商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    /**
     * TODO 添加姓名
     */
    @ApiModelProperty("用户姓名")
    private String realName;

    @ApiModelProperty("会员姓名")
    private String userName;

    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty("账号类型中文名")
    private String accountTypeDesc;

    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "上级代理Id", dataType = "java.lang.String")
    private Long parentProxyId;

    @ApiModelProperty("上级代理")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty("所属商户")
    private String merchantName;

    @ApiModelProperty("主商户")
    private String topMerchantMame;

    @ApiModelProperty("VIP等级")
    private Integer vipLevel;

    @ApiModelProperty("有效状态（0-有效 1-无效）")
    private Integer status;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;

    /**
     * 会员标签
     */
    @ApiModelProperty(value = "会员标签")
    private String labelName;
    /**
     * windControlName
     */
    @ApiModelProperty(value = "风控层级名称", example = "1级")
    private String windControlName;

    @ApiModelProperty("注单量")
    private Long betCount;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount;

    @ApiModelProperty("调整金额")
    private BigDecimal artificialPatchAmount;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("首存金额")
    private BigDecimal firstDeposit;

    @ApiModelProperty(value = "首存金额时间")
    private LocalDateTime firstDepositDatetime;

    // 会员盈利率=投注盈亏/投注金额
    @ApiModelProperty(value = "会员盈利率")
    private BigDecimal netRate;

    public BigDecimal getNetRate() {
        BigDecimal netRate = betAmount.multiply(BigDecimal.valueOf(100)).divide(netAmount, 2, RoundingMode.HALF_UP);
        return netRate;
//        return netRate.toString();
    }
}
