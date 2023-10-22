package com.dx.facade.report.param.report;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
/**
 * 代理资金调整-非总代列表查询条件
 */
@Data
public class DxFundAdjustSettlementCommissionProxyRecordReqDTO {
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
     * 周期起始日期 202210
     */
    @ApiModelProperty("周期起始日期 20221001")
    private Integer cycleStartDate;

    /**
     * 周期结束日期202211
     */
    @ApiModelProperty("周期结束日期20221131")
    private Integer cycleEndDate;

    /**
     *
     * 代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;
    /**
     *
     * 直属上级
     */
    @ApiModelProperty(value = "直属上级")
    private String parentProxyName;

    /**
     * 剩余欠款
     */
    @ApiModelProperty("剩余欠款")
    private BigDecimal mixRemainingDebtAmount;
    /**
     * 剩余欠款
     */
    @ApiModelProperty("剩余欠款")
    private BigDecimal maxRemainingDebtAmount;

    /**
     * 剩余未收
     */
    @ApiModelProperty("剩余未收")
    private BigDecimal mixRemainingUncollectedAmount;
    /**
     * 剩余未收
     */
    @ApiModelProperty("剩余未收")
    private BigDecimal maxRemainingUncollectedAmount;




}
