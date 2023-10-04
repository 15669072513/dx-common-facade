package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemberRebateAuditReqDTO {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private Integer dataAreaType;

    @ApiModelProperty(value = "返点开始周期(yyyyMMdd)")
    private Integer cycleStartDate;

    @ApiModelProperty(value = "返点结束周期(yyyyMMdd)")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "订单号", example = "y202104181029521234")
    private String orderNo;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "审核员")
    private String lockAccount;

    @ApiModelProperty(value = "当前操作人")
    private String operAccount;

    @ApiModelProperty(value = "最小返点金额")
    private BigDecimal minRebateAmount;

    @ApiModelProperty(value = "最大返点金额")
    private BigDecimal maxRebateAmount;

    @ApiModelProperty(value = "审核状态")
    private Integer orderStatus;

}
