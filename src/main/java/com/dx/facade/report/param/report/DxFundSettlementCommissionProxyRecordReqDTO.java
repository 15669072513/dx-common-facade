package com.dx.facade.report.param.report;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 代理资金记录-代理返佣记录查询
 */
@Data
public class DxFundSettlementCommissionProxyRecordReqDTO {
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
     /**
     * 发放时间 2022-12-12 11:11:11
     */
    @ApiModelProperty("发放时间 ->2022-12-12 11:11:11")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime payoutTimeStart;

    /**
     * 发放时间
     */
    @ApiModelProperty("发放时间  ->2022-12-13 11:11:11")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime payoutTimeEnd;
    /**
     *
     * 代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;
    /**
     *
     * 上级代理名称
     */
    @ApiModelProperty("上级代理名称")
    private String parentProxyName;
    /**
     *
     * 订单号
     */
    @ApiModelProperty("订单号")
    private String orderNo;

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
     * 个人返佣金额
     */
    @ApiModelProperty("个人返佣金额")
    private BigDecimal personaMixCommissionAmount;

    /**
     * 个人返佣金额
     */
    @ApiModelProperty("个人返佣金额")
    private BigDecimal personaMaxCommissionAmount;
    /**
     * 客户端状态：已发放、已取消、无返佣。
     */
    @ApiModelProperty("客户端状态：已发放、已取消、无返佣。")
    private BigDecimal payoutStatus;
    /**
     * 客户端状态：已发放、已取消、无返佣。
     */
    @ApiModelProperty("客户端状态：已发放、已取消、无返佣。")
    private List<Integer> payoutStatusList;

}
