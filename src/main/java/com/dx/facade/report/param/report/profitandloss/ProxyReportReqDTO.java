package com.dx.facade.report.param.report.profitandloss;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.report.param.base.LocalDatePageRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-ProxyReportReqDTO", description = "代理报表对象")
public class ProxyReportReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;
    @ApiModelProperty(value = "代理类型")
    private Long proxyType;

    @ApiModelProperty("商户id")
    private Long merchantId;

    @ApiModelProperty("商户名")
    private String merchantName;

    @ApiModelProperty(value = "代理层级")
    private Long proxyLevel;

    @ApiModelProperty("最小投注金额")
    private BigDecimal minBetAmount;

    @ApiModelProperty("最大投注金额")
    private BigDecimal maxBetAmount;

}
