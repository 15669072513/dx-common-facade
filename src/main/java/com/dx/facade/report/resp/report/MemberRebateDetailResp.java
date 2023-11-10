package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemberRebateDetailResp {
    /**
     * 报表日期
     */
    @ApiModelProperty(value = "报表日期")
    private String reportDate;

    @ApiModelProperty(value = "币种")
    private String currency;
//    /**
//     * 返点比例
//     */
//    @ApiModelProperty(value = "返点比例")
//    private BigDecimal rebateRate;

    /**
     * 个人返点
     */
    @ApiModelProperty(value = "个人返点")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "派发状态 (0-未结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)")
    private Integer payoutStatus;
//
//    /**
//     * 返点比例
//     */
//    @ApiModelProperty(value = "会员返点比例")
//    private BigDecimal memberRebateAmount;


    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id")
    private Long memberId;

    /**
     * 会员账号
     */
    @ApiModelProperty(value = "会员账号")
    private String memberName;

    /**
     * 直属上级代理
     */
    @ApiModelProperty(value = "直属上级代理")
    private String parentProxyName;

}
