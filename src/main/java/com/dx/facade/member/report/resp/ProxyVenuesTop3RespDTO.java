package com.dx.facade.member.report.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 @title 获取TOP3场馆接口响应数据传输对象
 @desc 汇总代理的下级会员前3输赢、投注的平台
 @computer 代理场管费日报表中输赢为前3的数据
 @path ob_proxy_venue_d
 @author gollum
 @version 1.0.0
 @since 2021年09月28日 09:45:49
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("获取TOP3场馆接口响应数据传输对象")
public class ProxyVenuesTop3RespDTO {

    @ApiModelProperty(value = "平台名称")
    private String venueName;

    @ApiModelProperty(value = "投注金额")
    private BigDecimal totalBetAmount;

    @ApiModelProperty(value = "有效投注")
    private BigDecimal totalValidBetAmount;

    @ApiModelProperty(value = "会员输赢")
    private BigDecimal totalNetAmount;
}