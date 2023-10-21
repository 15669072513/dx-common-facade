package com.dx.facade.report.param.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MemberRebateDReqDTO {
    /**
     * 商户
     */
    @ApiModelProperty(value = "商户")
    private Long merchantId;

    /**
     * 代理id
     */
    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id")
    private Long memberId;

    /**
     * 周期开始时间
     */
    @ApiModelProperty(value = "周期开始时间(yyyyMMdd)")
    private Long reportStartDate;

    /**
     * 周期结束时间
     */
    @ApiModelProperty(value = "周期结束时间(yyyyMMdd)")
    private Long reportEndDate;

    @ApiModelProperty("返佣状态(0-未结算 1=待发放 2-无返佣 3-已发放  4-已取消)")
    private Integer payoutStatus;
}

