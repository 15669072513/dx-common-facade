package com.dx.facade.report.param.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class MemberRebateDReqDTO {
    /**
     * 商户
     */
    @ApiModelProperty(value = "商户")
    private Long merchantId;

    /**
     * 代理id
     */
    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id")
    private Long memberId;

    /**
     * 周期开始时间
     */
    @ApiModelProperty(value = "周期开始时间(yyyyMMdd)")
    private Long reportStartDate;

    /**
     * 周期结束时间
     */
    @ApiModelProperty(value = "周期结束时间(yyyyMMdd)")
    private Long reportEndDate;

    @ApiModelProperty("返佣状态(0-未结算 1=已结算（数据不会在进行统计变动） 2-待发放  3-已发放 ,4，已过期(返佣废弃当前状态)，5：无返佣 6-已取消)")
    private Integer payoutStatus;

    private List<Integer> payoutStatusList;

    /**
     * 会员账号
     */
    @ApiModelProperty("会员账号")
    private String memberName;
    /**
     * 上级代理账号
     */
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    /**
     * 代理id
     */
    @ApiModelProperty(value = "上级代理id")
    private Long parentProxyId;



    @ApiModelProperty("0:返佣查询接口，1：非返佣查询接口")
    private Integer commissionFlag;

}

