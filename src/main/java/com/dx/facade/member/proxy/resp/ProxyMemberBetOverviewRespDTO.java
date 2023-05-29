package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 代理详情-成员投注信息
 *
 * @author laway
 */
@Data
@Builder
public class ProxyMemberBetOverviewRespDTO {

    @ApiModelProperty("今日活动")
    private BigDecimal todayActivityAmount;
    @ApiModelProperty("今日反水")
    private BigDecimal todayReturnWaterAmount;
    @ApiModelProperty("今日总派彩")
    private BigDecimal todayPayAmount;
    @ApiModelProperty("今日总投注")
    private BigDecimal todayBetAmount;
    @ApiModelProperty("今日总有效投注")
    private BigDecimal todayValidAmount;
    @ApiModelProperty("今日总输赢")
    private BigDecimal todayNetAmount;

    @ApiModelProperty("本月活动")
    private BigDecimal monthActivityAmount;
    @ApiModelProperty("本月反水")
    private BigDecimal monthReturnWaterAmount;
    @ApiModelProperty("本月总派彩")
    private BigDecimal monthPayAmount;
    @ApiModelProperty("本月总投注")
    private BigDecimal monthBetAmount;
    @ApiModelProperty("本月总有效投注")
    private BigDecimal monthValidAmount;
    @ApiModelProperty("本月总输赢")
    private BigDecimal monthNetAmount;


}
