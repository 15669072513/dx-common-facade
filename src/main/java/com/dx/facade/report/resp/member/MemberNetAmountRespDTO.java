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

    @ApiModelProperty("会员昵称")
    private String nickName;

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
    private Long betCount=0l;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount=BigDecimal.ZERO;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount=BigDecimal.ZERO;


    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;

    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount=BigDecimal.ZERO;

    @ApiModelProperty("调整金额")
    private BigDecimal artificialPatchAmount=BigDecimal.ZERO;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit=BigDecimal.ZERO;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("首存金额")
    private BigDecimal firstDeposit=BigDecimal.ZERO;

    @ApiModelProperty(value = "首存金额时间")
    private LocalDateTime firstDepositDatetime;

    // 会员盈利率=投注盈亏/投注金额
    @ApiModelProperty(value = "会员盈利率")
    private BigDecimal netRate=BigDecimal.ZERO;

    @ApiModelProperty(value = "反水其他调整")
    private BigDecimal otherAdjustAmount = BigDecimal.ZERO;

    @ApiModelProperty("服务费-手牌")
    private BigDecimal serviceChargeHand;

    @ApiModelProperty("服务费-局抽")
    private BigDecimal serviceChargeRound;
    /**
     * 会员盈利率=投注盈亏/投注金额
     *
     * @return
     */
    @ApiModelProperty("会员盈利率")
    public BigDecimal getNetRate() {
        if(betAmount==null||betAmount.compareTo(BigDecimal.ZERO)==0){
            return BigDecimal.ZERO;
        }
        return netAmount.divide(betAmount, 4, RoundingMode.DOWN);
    }

}
