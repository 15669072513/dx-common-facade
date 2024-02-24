package com.dx.facade.report.resp.report.proxy;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;


@Data
@ApiModel
public class ProxyIncomeAuditListReq extends LocalDatePageRequest {

    @ApiModelProperty("所属商户id")
    private String merchantId;

    @ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
    private Integer lockStatus;

    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty("订单号")
    private String orderNo;

    @ApiModelProperty("实发收益最大值")
    private BigDecimal maxIncomeAmount;

    @ApiModelProperty("实发收益最小值")
    private BigDecimal minIncomeAmount;

    @ApiModelProperty("审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过")
    private Integer auditStatus;

    @ApiModelProperty("代理账号")
    private String proxyName;

    /**
     * 周期起始日期
     */
    private Integer cycleStartDate;

    /**
     * 周期结束日期
     */
    private Integer cycleEndDate;


}
