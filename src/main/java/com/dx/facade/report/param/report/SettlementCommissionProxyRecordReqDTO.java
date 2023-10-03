package com.dx.facade.report.param.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SettlementCommissionProxyRecordReqDTO  extends LocalDatePageRequest {
    /**
     * 商户id
     */
    @ApiModelProperty("商户id")
    private Long merchantId;
    /**
     * 周期起始日期
     */
    @ApiModelProperty("周期起始日期")
    private Integer startTime;

    /**
     * 周期结束日期
     */
    @ApiModelProperty("周期结束日期")
    private Integer cycleEndDate;
    /**
     * 返佣状态(0-未结算 1=待发放 2-无返佣 3-已发放  4-已取消)
     */
    @ApiModelProperty("返佣状态(0-未结算 1=待发放 2-无返佣 3-已发放  4-已取消)")
    private int payoutStatus;
    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    private Long proxyId;
    /**
     * 代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;



}
