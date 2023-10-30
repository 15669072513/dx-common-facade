package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @description 会员返佣结算表
 * @date 2023-09-26
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "团队会员返水数据", description = "团队会员返水数据")
public class DxSettlementCommissionMemberRecordRspDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    /**
     * 报表日期
     */
    @ApiModelProperty("报表日期")
    private Integer reportYm;

    /**
     * 周期名称 - 结算期数
     */
    @ApiModelProperty("周期名称 - 结算期数")
    private String cycleName;

    /**
     * 会员id
     */
    @ApiModelProperty("会员id")
    private Long memberId;

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
     * 上级代理id
     */
    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currency;

    /**
     * 个人返佣金额
     */
    @ApiModelProperty("个人返水")
    private BigDecimal personCommissionAmount;

    @ApiModelProperty("返佣状态(0-未结算 1=已结算（数据不会在进行统计变动） 2-待发放  3-已发放 ,4，已过期(返佣废弃当前状态)，5：无返佣 6-已取消)")
    private Integer payoutStatus;

}