package com.dx.facade.report.resp.report;


import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-bw-resp-report-PlayerDayReportResp", description = "会员报表分页返回对象")
public class PlayerDayReportResp implements Serializable {

    private static final long serialVersionUID = 2842841229033375496L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "会员ID")
    private Long playerId;
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "上级代理Id", dataType = "java.lang.String")
    private Long parentProxyId;
    @ApiModelProperty(value = "会员账号")
    private String playerName;
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;
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
    // todo  private String accountStatus; 账号状态（1正常，2登录锁定，3游戏锁定，4充提锁定）
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
    private Long depositTimes;
    @ApiModelProperty("总取款")
    private BigDecimal withdrawAmount;
    @ApiModelProperty("取款次数")
    private Long withdrawTimes;
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

    @ApiModelProperty(value = "标签id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long labelId;

    @ApiModelProperty(value = "标签名称")
    private String labelName;

    @ApiModelProperty(value = "风控层级id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long windControlId;

    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    /**
     * 净盈亏 = 投注盈亏+返水盈亏+优惠金额+其他金额
     *
     * @return
     */
    @ApiModelProperty("净盈亏")
    public BigDecimal getNetProfit() {
        return netAmount.add(returnWaterAmount).add(discountAmount).add(otherAdjustAmount);
    }
}
