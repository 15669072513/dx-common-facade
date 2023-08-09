package com.dx.facade.merchant.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;


/**
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyReBateRecordPageParam extends PageRequest implements Serializable {

    @ApiModelProperty(value = "开始结算周期:yyyy-MM-dd",example = "2021-08-04")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate cycleStartDate;

    @ApiModelProperty(value = "截止算周期:yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate cycleEndDate;

    @ApiModelProperty(value = "开始领取时间yyyy-MM-dd",example = "2021-08-04")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate receiveStartDate;

    @ApiModelProperty(value = "截止领取时间yyyy-MM-dd",example = "2021-08-04")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate receiveEndDate;

    @ApiModelProperty(value="订单号")
    private String orderNo;

    @ApiModelProperty(value="代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "直属上级")
    private String parentProxyAccount;

    @ApiModelProperty(value = "所属商户Id")
    private String merchantId;

//    @ApiModelProperty(value = "代理层级Id")
//    private List<Long> proxyLevelId;
//
//    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
//    private List<Integer> accountType;

    @ApiModelProperty(value="客户端状态(0-未结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)")
    private Integer clientStatus;

//    @ApiModelProperty(value = "团队返点最小金额")
//    private BigDecimal rebateAmountMin;
//
//    @ApiModelProperty(value = "团队返点最大金额")
//    private BigDecimal rebateAmountMax;
//
//    @ApiModelProperty(value = "团队流水最小")
//    private BigDecimal totalBetAmountMin;
//
//    @ApiModelProperty(value = "团队流水最大")
//    private BigDecimal totalBetAmountMax;
//
//    @ApiModelProperty(value = "个人返点最小")
//    private BigDecimal personRebateAmountMin;
//
//    @ApiModelProperty(value = "个人返点最大")
//    private BigDecimal personRebateAmountMax;
//
//    @ApiModelProperty(value = "排序方式(个人返点-1 下级总返点-2 团队总返点-3 团队总流水-4 流水纠正-5 实际流水-6 活跃人数-7 有效活跃人数-8 发放时间-9 领取时间-10 结算周期-11)")
//    private Integer orderKey;
//
//    @ApiModelProperty(value = "排序方式(asc-正序 desc-逆序)")
//    private String orderType;

}
