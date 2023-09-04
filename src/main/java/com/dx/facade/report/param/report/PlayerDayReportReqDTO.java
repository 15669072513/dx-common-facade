package com.dx.facade.report.param.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author
 */
@Data
@ApiModel("会员报表列表页-请求对象")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDayReportReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("商户Id")
    private String merchantId;

    @ApiModelProperty(value = "会员账号", example = "zw9z_string0001")
    private String playerName;

    @ApiModelProperty(value = "上级代理", example = "zw9z_string0000")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;


    @ApiModelProperty(value = "注册开始时间", required = true, example = "2021-06-17")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    protected LocalDate registerStartTime;

    @ApiModelProperty(value = "注册结束时间", required = true, example = "2021-06-17")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    protected LocalDate registerEndTime;

    @ApiModelProperty("账号类型(1-试玩，2-商务，3-正式，4-测试，5-置换)")
    private Integer accountType;

    @ApiModelProperty("最小注单量")
    private Long minBetCount;

    @ApiModelProperty("最大注单量")
    private Long maxBetCount;

    @ApiModelProperty("最小净盈亏")
    private BigDecimal minBetAmount;

    @ApiModelProperty("最大投注金额")
    private BigDecimal maxBetAmount;

    @ApiModelProperty("最小投注盈亏")
    private BigDecimal minNetAmount;

    @ApiModelProperty("最大投注盈亏")
    private BigDecimal maxNetAmount;

    @ApiModelProperty("最小净盈亏")
    private BigDecimal minNetProfit;

    @ApiModelProperty("最大净盈亏")
    private BigDecimal maxNetProfit;

    @ApiModelProperty("最小净盈亏")
    private BigDecimal minValidBetAmount;

    @ApiModelProperty("最大净盈亏")
    private BigDecimal maxValidBetAmount;


}
