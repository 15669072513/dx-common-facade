package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
public class DxSettlementCommissionProxyRecordReqDTO {
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
    private Integer cycleStartDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty("周期结束日期")
    private Integer cycleEndDate;
    /**
     * 返佣状态(0-未结算 1=待发放 2-无返佣 3-已发放  4-已取消)
     */
    @ApiModelProperty("返佣状态(0-未结算 1=待发放 2-无返佣 3-已发放  4-已取消)")
    private Integer payoutStatus;

    private List<Integer> payoutStatusList;
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


    /**
     * 团队返佣金额
     */
    @ApiModelProperty("团队返佣金额")
    private BigDecimal mixCommissionAmount;

    /**
     * 团队返佣金额
     */
    @ApiModelProperty("团队返佣金额")
    private BigDecimal maxCommissionAmount;

    /**
     * 审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过
     */
    @ApiModelProperty("审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过")
    private Integer orderStatus;

    private List<Integer> orderStatusList;

    /**
     * 总代账号
     */
    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "查询类型：1待一审，2待二审", example = "1")
    //@Range(min = 1, max = 2, message = "查询类型参数不合法")
    private Integer qryType;

    @ApiModelProperty("返佣状态(0-未结算 1=待发放 2-无返佣 3-已发放  4-已取消)")
    private Integer payoutStatusNeZero;

    @ApiModelProperty("排序通配符")
    private String orderStr;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty(value = "周期开始时间(yyyyMMdd)")
    private Long reportStartDate;

    @ApiModelProperty(value = "周期结束时间(yyyyMMdd)")
    private Long reportEndDate;

    @ApiModelProperty("层级级别  0总代 ")
    private Integer proxyLevel;

    @ApiModelProperty("锁单状态 0：未锁单，1已锁单")
    private Integer lockStatus;


}
