package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class SettlementCommissionProxyRecordReqDTO{
    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    protected Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    protected Long pageSize = 20L;
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

    /** 上级代理id */
    @ApiModelProperty(value = "上级代理ID")
    private Long parentProxyId;

    /**
     * 代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;



}
