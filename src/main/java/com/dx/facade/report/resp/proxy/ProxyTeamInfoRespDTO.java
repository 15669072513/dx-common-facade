package com.dx.facade.report.resp.proxy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 @title 获取代理团队信息接口响应数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月28日 00:46:52
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("获取代理团队信息接口响应数据传输对象")
public class ProxyTeamInfoRespDTO implements Serializable {

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "下级代理人数")
    private Integer underProxyNum;

    @ApiModelProperty(value = "直属下级代理人数")
    private Integer directlyUnderProxyNum;

    @ApiModelProperty(value = "下级会员人数")
    private Integer underMemberNum;

    @ApiModelProperty(value = "直属下级会员人数")
    private Integer directlyUnderMemberNum;

    @ApiModelProperty(value = "累计首存人数")
    private Integer totalFirstDepositNum;

    @ApiModelProperty(value = "累计首存金额")
    private BigDecimal totalFirstDepositAmount;

    @ApiModelProperty(value = "有效会员人数")
    private Integer effectiveNum;

    @ApiModelProperty(value = "今日活跃会员人数")
    private Integer todayActiveNum;

    @ApiModelProperty(value = "今日新增会员人数")
    private Integer todayNewMemberNum;

    @ApiModelProperty(value = "今日有效活跃会员人数")
    private Integer todayEffecactiveNum;

    @ApiModelProperty(value = "今日新增有效活跃会员人数")
    private Integer todayNewActiveNum;

    @ApiModelProperty(value = "今日有效活跃会员人数")
    private Integer todayNewEffecactiveNum;

    @ApiModelProperty(value = "本月新增会员人数")
    private Integer monthNewMemberNum;

    @ApiModelProperty(value = "本月活跃会员人数")
    private Integer monthActiveNum;

    @ApiModelProperty(value = "本月新增活跃会员人数")
    private Integer monthNewActiveNum;

    @ApiModelProperty(value = "本月有效活跃会员人数")
    private Integer monthEffecactiveNum;

    @ApiModelProperty(value = "本月新增有效活跃会员人数")
    private Integer monthNewEffecactiveNum;

    @ApiModelProperty(value = "今日会员总投注金额")
    private BigDecimal todayBetAmount;

    @ApiModelProperty(value = "今日会员总派彩额")
    private BigDecimal todayPayAmount;

    @ApiModelProperty(value = "今日会员总有效投注金额")
    private BigDecimal todayValidBetAmount;

    @ApiModelProperty(value = "今日会员总输赢金额")
    private BigDecimal todayNetAmount;

    @ApiModelProperty(value = "今日会员总优惠金额(活动+福利)")
    private BigDecimal todayDiscountAmount;

    @ApiModelProperty(value = "今日会员总活动金额")
    private BigDecimal todayActiveAmount;

    @ApiModelProperty(value = "今日会员总福利金额")
    private BigDecimal todayRewardAmount;

    @ApiModelProperty(value = "今日会员总返水金额")
    private BigDecimal todayRebateAmount;

    @ApiModelProperty(value = "今日会员总账户调整金额")
    private BigDecimal todayAcctadjustAmount;

    @ApiModelProperty(value = "今日会员总账户加额")
    private BigDecimal todayAdjustAddAmount;

    @ApiModelProperty(value = "今日会员总账户减额")
    private BigDecimal todayAdjustSubAmount;

    @ApiModelProperty(value = "今日会员总净输赢金额")
    private BigDecimal todayNetwinAmount;

    @ApiModelProperty(value = "本月会员总投注金额")
    private BigDecimal monthBetAmount;

    @ApiModelProperty(value = "本月会员总有效投注金额")
    private BigDecimal monthValidBetAmount;

    @ApiModelProperty(value = "本月会员总派彩额")
    private BigDecimal monthPayAmount;

    @ApiModelProperty(value = "本月会员总输赢金额")
    private BigDecimal monthNetAmount;

    @ApiModelProperty(value = "本月会员总优惠金额(活动+福利)")
    private BigDecimal monthDiscountAmount;

    @ApiModelProperty(value = "本月会员总活动金额")
    private BigDecimal monthActiveAmount;

    @ApiModelProperty(value = "本月会员总福利金额")
    private BigDecimal monthRewardAmount;

    @ApiModelProperty(value = "本月会员总返水金额")
    private BigDecimal monthRebateAmount;

    @ApiModelProperty(value = "本月会员总账户调整金额")
    private BigDecimal monthAcctadjustAmount;

    @ApiModelProperty(value = "本月会员总账户加额")
    private BigDecimal monthAdjustAddAmount;

    @ApiModelProperty(value = "本月会员总账户减额")
    private BigDecimal monthAdjustSubAmount;

    @ApiModelProperty(value = "本月会员总净输赢金额")
    private BigDecimal monthNetwinAmount;


    /**
     * 团队概览
     */

    @ApiModelProperty("直属会员转出")
    private Integer directlyMemberTransferOutNum;
    @ApiModelProperty("直属会员转入")
    private Integer directlyMemberTransferInNum;

    /**
     * 团队新增
     */
    @ApiModelProperty("今日下级代理新增")
    private Integer todayNewProxyNum;
    @ApiModelProperty("今日直属代理新增")
    private Integer todayNewDirectlyProxyNum;
    @ApiModelProperty("本月下级代理新增")
    private Integer monthNewProxyNum;
    @ApiModelProperty("本月直属代理新增")
    private Integer monthNewDirectlyProxyNum;
    @ApiModelProperty("今日直属会员新增")
    private Integer todayNewDirectlyMemberNum;
    @ApiModelProperty("本月直属会员新增")
    private Integer monthNewDirectlyMemberNum;

    /**
     * 会员盈亏信息
     */
    @ApiModelProperty("总投注金额")
    private BigDecimal totalBetAmount;
    @ApiModelProperty("总有效投注")
    private BigDecimal totalValidBetAmount;
    @ApiModelProperty("总投注盈亏")
    private BigDecimal totalNetAmount;
    @ApiModelProperty("总净盈亏")
    private BigDecimal totalRushAmount;

    @ApiModelProperty("总返水")
    private BigDecimal totalBetRebateAmount;
    @ApiModelProperty("总活动优惠")
    private BigDecimal totalActiveDiscountAmount;
    @ApiModelProperty("总福利金额")
    private BigDecimal totalDiscountAmount;
    @ApiModelProperty("总存款优惠")
    private BigDecimal totalDepositDiscountAmount;
    @ApiModelProperty("总调整")
    private BigDecimal totalOtherAdjustAmount;
}
