package com.dx.facade.report.resp.report.proxy;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * .
 *
 * @author: Ellon
 * @date: 2024-02-22 17:20
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ZhanchengRateInfo", description = "收益比例弹框")
public class ZhanchengRateInfo {
    @ApiModelProperty("默认比例")
    private BigDecimal rate;
    @ApiModelProperty("PM电竞比例")
    private BigDecimal pmdjNetRate = BigDecimal.ZERO;
    @ApiModelProperty("PM彩票比例")
    private BigDecimal pmcpNetRate = BigDecimal.ZERO;
    @ApiModelProperty("博雅棋牌比例")
    private BigDecimal pmqpNetRate = BigDecimal.ZERO;
    @ApiModelProperty("PM真人比例")
    private BigDecimal pmzrNetRate = BigDecimal.ZERO;
    @ApiModelProperty("PM体育比例")
    private BigDecimal pmtyNetRate = BigDecimal.ZERO;

}
