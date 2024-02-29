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
 * @description 代理返佣结算表
 * @date 2023-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "代理返佣明细表", description = "代理返佣明细表")
public class DwmCommissionDetailProxyDDTO implements Serializable {

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
    * 周期类型: 1-天 2-周 3-月
    */
    @ApiModelProperty("周期类型: 1-天 2-周 3-月")
    private int cycleType;

    /**
    * 周期名称 - 结算期数
    */
    @ApiModelProperty("周期名称 - 结算期数")
    private String cycleName;

    /**
    * 周期起始日期
    */
    @ApiModelProperty("周期起始日期")
    private Integer cycleStartDate;

    /**
    * 周期结束日期
    */
    @ApiModelProperty("周期结束日期")
    private Integer cycleEndDate;

    /**
    * 代理id
    */
    @ApiModelProperty("代理id")
    private Long proxyId;

    /**
    * 代理账号
    */
    @ApiModelProperty("代理账号")
    private String proxyName;

    /**
    * 币种
    */
    @ApiModelProperty("币种")
    private String currency;

    /**
     * 结算类型名称
     */
    @ApiModelProperty("结算类型名称")
    private String settlementName;
    /**
     * 结算类型
     */
    @ApiModelProperty("结算类型")
    private String settlementCode;

    /**
    * 团队返佣=代理冲正净输赢*团队返佣比例
    */
    @ApiModelProperty("团队返佣=代理冲正净输赢*团队返佣比例")
    private BigDecimal commissionAmount;

    /**
    * 上月结余
    */
    @ApiModelProperty("上月结余")
    private BigDecimal commissionLastAmount;

    /**
    * 返佣比例
    */
    @ApiModelProperty("返佣比例")
    private BigDecimal commissionRate;

    /**
    * 个人返佣金额
    */
    @ApiModelProperty("个人返佣金额")
    private BigDecimal personCommissionAmount;

    /**
    * 下级返佣金额
    */
    @ApiModelProperty("下级返佣金额")
    private BigDecimal childCommissionAmount;

    /**
    * 代理冲正净输赢=代理净输赢上期结余
    */
    @ApiModelProperty("代理冲正净输赢=代理净输赢上期结余")
    private BigDecimal rushAmount;

    /**
    * 代理净输赢=-(会员游戏盈亏场馆费会员返水会员返水其他调整)
    */
    @ApiModelProperty("代理净输赢=-(会员游戏盈亏场馆费会员返水会员返水其他调整)")
    private BigDecimal proxyNetwinAmount;

    /**
    * 直属会员返点金额
    */
    @ApiModelProperty("直属会员返点金额")
    private BigDecimal memberNetwinAmount;

    /**
    * 会员游戏盈亏(平台)
    */
    @ApiModelProperty("会员游戏盈亏(平台)")
    private BigDecimal platformNetAmount;

    /**
    * 场馆费用
    */
    @ApiModelProperty("场馆费用")
    private BigDecimal venueAmount;

    /**
    * 直属会员返点金额
    */
    @ApiModelProperty("直属会员返点金额")
    private BigDecimal memberRebateAmount;

    /**
    * 会员返点调整添加金额
    */
    @ApiModelProperty("会员返点调整添加金额")
    private BigDecimal memberRebateAddAmount;

    /**
    * 会员返点调整减少金额
    */
    @ApiModelProperty("会员返点调整减少金额")
    private BigDecimal memberRebateSubAmount;

    /**
    * 报表创建时间
    */
    @ApiModelProperty("报表创建时间")
    private LocalDateTime createdAt;

    /**
     * 手牌服务费贡献
     */
    @ApiModelProperty(value = "手牌服务费")
    private BigDecimal serviceChargeHand;

    /**
     * 局服务费贡献
     */
    @ApiModelProperty(value = "局服务费")
    private BigDecimal serviceChargeRound;

    @ApiModelProperty(value = "团队服务")
    private BigDecimal teamServiceAmount;

    @ApiModelProperty(value = "手牌服务费贡献")
    private BigDecimal serviceChargeHandContribution;

    /**
     * 局服务费贡献
     */
    @ApiModelProperty(value = "局服务费贡献")
    private BigDecimal serviceChargeRoundContribution;

    @ApiModelProperty(value = "团队服务贡献")
    private BigDecimal serviceAmountContribution;

    @ApiModelProperty(value = "手牌服务费贡献")
    private BigDecimal serviceChargeHandContribution;

    /**
     * 局服务费贡献
     */
    @ApiModelProperty(value = "局服务费贡献")
    private BigDecimal serviceChargeRoundContribution;

    /**
     * 局服务费贡献
     */
    @ApiModelProperty(value = "局服务费贡献")
    private BigDecimal serviceAmountContribution;
}