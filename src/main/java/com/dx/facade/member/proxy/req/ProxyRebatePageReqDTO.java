package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

import com.dx.facade.report.param.base.MultiplyMerchantLocalDateReq;

@Data
public class ProxyRebatePageReqDTO extends MultiplyMerchantLocalDateReq {
    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月,默认1")
    private Integer cycleType = 1;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "开始周期(yyyymmdd)")
    private Long cycleStartDate;

    @ApiModelProperty(value = "结束周期(yyyymmdd)")
    private Long cycleEndDate;

    @ApiModelProperty(value = "领取开始日期:yyyy-MM-dd mm:hh:ss")
    private String receiveStartDate;

    @ApiModelProperty(value = "领取结束日期:yyyy-MM-dd mm:hh:ss")
    private String receiveEndDate;

    @ApiModelProperty(value = "派发状态 (0-未结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)")
    private Integer payoutStatus;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value="总代账号")
    private String topProxyAccount;

    @ApiModelProperty(value="代理层级")
    private Integer proxyLevel;

    @ApiModelProperty(value = "直属上级")
    private String parentProxyAccount;

    @ApiModelProperty(value = "直属id")
    private Long parentProxyId;

    @ApiModelProperty(value = "代理层级Id")
    private List<Long> proxyLevelId;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private List<Integer> accountType;

    @ApiModelProperty(value = "团队返点最小金额")
    private BigDecimal rebateAmountMin;

    @ApiModelProperty(value = "团队返点最大金额")
    private BigDecimal rebateAmountMax;

    @ApiModelProperty(value = "团队流水最小")
    private BigDecimal totalBetAmountMin;

    @ApiModelProperty(value = "团队流水最大")
    private BigDecimal totalBetAmountMax;

    @ApiModelProperty(value = "个人返点最小")
    private BigDecimal personRebateAmountMin;

    @ApiModelProperty(value = "个人返点最大")
    private BigDecimal personRebateAmountMax;

    @ApiModelProperty(value = "排序方式(个人返点-1 下级总返点-2 团队总返点-3 团队总流水-4 流水纠正-5 实际流水-6 活跃人数-7 有效活跃人数-8 发放时间-9 领取时间-10)")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式(asc-正序 desc-逆序)")
    private String orderType;

}
