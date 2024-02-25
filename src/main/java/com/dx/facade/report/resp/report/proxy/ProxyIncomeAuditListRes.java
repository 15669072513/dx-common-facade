package com.dx.facade.report.resp.report.proxy;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("资金-代理收益返回")
public class ProxyIncomeAuditListRes {

    @ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
    private Integer lockStatus;

    @ApiModelProperty("订单号")
    private String orderNo;

    @ApiModelProperty(value = "结算周期开始时间", example = "2021-06-17")
    private Integer startTime;

    @ApiModelProperty(value = "结算周期结束时间", example = "2021-06-17")
    private Integer endTime;

    @ApiModelProperty("代理账号")
    private String proxyName;

    @ApiModelProperty(value = "代理层级")
    private Integer proxyLevel;

    @ApiModelProperty("直属上级")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty("德州服务费返点")
    private BigDecimal dxServiceFeeRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("德州保险分成")
    private BigDecimal dxInsurancePartsAmount = BigDecimal.ZERO;

    @ApiModelProperty("其他场馆返点")
    private BigDecimal otherVenueRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("其他场馆分成")
    private BigDecimal otherVenuePartsAmount = BigDecimal.ZERO;

    @ApiModelProperty("本期应发")
    private BigDecimal currentIncomeAmount = BigDecimal.ZERO;

    @ApiModelProperty("调整收益")
    private BigDecimal adjustIncomeAmount = BigDecimal.ZERO;

    @ApiModelProperty("实发收益")
    private BigDecimal realIncomeAmount = BigDecimal.ZERO;

    @ApiModelProperty("审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过")
    private Integer auditStatus;

    @ApiModelProperty("锁定时间")
    private LocalDateTime lockTime;

    @ApiModelProperty(value = "审核人")
    private String auditName;

    @ApiModelProperty("申请时间")
    private LocalDateTime applyTime;
}
