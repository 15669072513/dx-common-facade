package com.dx.facade.report.resp.report.proxy;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Data
@ApiModel
public class ProxyIncomeAuditListReq  {

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

    @ApiModelProperty("审核状态  1-一审拒绝  3-二审拒绝 4-二审通过")
    private List<Integer> auditStatus;

    @ApiModelProperty("客户端状态 1:待发放 3：已发放 5：无收益 6：已取消")
    private List<Integer> payoutStatusList;

    @ApiModelProperty("代理账号")
    private String proxyName;

    /**
     * 周期起始日期
     */
    @ApiModelProperty(value = "周期开始时间", required = true, example = "20240215")
    @NotNull(message = "时间周期参数开始时间不能为空")
    private Integer cycleStartDate;


    /**
     * 周期结束日期
     */
    @ApiModelProperty(value = "周期结束时间", required = true, example = "20240228")
    @NotNull(message = "时间周期参数结束不能为空")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    protected Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    protected Long pageSize = 20L;

    @ApiModelProperty(value = "发放开始时间",example = "20240215")
    private Integer receiveStartDate;

    @ApiModelProperty(value = "发放截止时间",example = "20240228")
    private Integer receiveEndDate;

    @ApiModelProperty(value = "本期应发最小值")
    private BigDecimal personRebateAmountMin;

    @ApiModelProperty(value = "本期应发最大值")
    private BigDecimal personRebateAmountMax;

    @ApiModelProperty(value = "直属上级")
    private String parentProxyAccount;

}
