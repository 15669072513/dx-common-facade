package com.dx.facade.report.resp.proxycommission;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;

@Data
public class ProxyCommissionRecordPageRespDTO {

    @ApiModelProperty("订单号")
    private String orderNo;
    @ApiModelProperty("订单状态")
    private Integer orderStatus;
    @ApiModelProperty("报表创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createdTime;
    @ApiModelProperty("代理账号")
    private String proxyAccount;
    @ApiModelProperty("代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;
    @ApiModelProperty("代理状态（1正常，2登录锁定，3充提锁定）")
    private Integer accountStatus;
    @ApiModelProperty("风控层级名称")
    private String windControlName;
    @ApiModelProperty("当前代理等级名字")
    private String currentLevel;
    @ApiModelProperty("总输赢额")
    private BigDecimal totalNetAmount;
    @ApiModelProperty("场馆费")
    private BigDecimal totalPlatformAmount;
    @ApiModelProperty("活动彩金")
    private BigDecimal totalActivityAmount;
    @ApiModelProperty("返水")
    private BigDecimal totalRebateAmount;
    @ApiModelProperty("账号调整")
    private BigDecimal totalAdjustAmount;
    @ApiModelProperty("补单输赢")
    private BigDecimal totalPatchNetAmount;
    @ApiModelProperty("净输赢")
    private BigDecimal totalPureAmount;
    @ApiModelProperty("上月结余")
    private BigDecimal totalLastAmount;
    @ApiModelProperty("冲正后净输赢")
    private BigDecimal totalRushAmount;

    @ApiModelProperty("佣金比例")
    private BigDecimal commissionRate;
    @ApiModelProperty("等级专享")
    private BigDecimal rewardAmount;
    @ApiModelProperty("返佣总额")
    private BigDecimal commissionAmount;

    @ApiModelProperty("实际金额")
    private BigDecimal actualCommission;
    @ApiModelProperty("专享比例")
    private BigDecimal exclusiveRatio;
    @ApiModelProperty(value = "本月活跃用户")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long monthActiveNum;
    @ApiModelProperty(value = "本月新增活跃用户")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long monthActiveNumNew;

}
