package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(value="中控代理预期返水列表汇总", description="中控代理预期返水列表")
public class ProxyAnticipateRebateRecordTotalResp {

    /**
     * 个人返点金额
     */
    @ApiModelProperty(value = "个人返点")
    private BigDecimal personRebateAmount = BigDecimal.ZERO;

    /**
     * 下级返点金额
     */
    @ApiModelProperty(value = "下级返点")
    private BigDecimal childRebateAmount = BigDecimal.ZERO;

    /**
     * 团队返点金额
     */
    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount = BigDecimal.ZERO;

    /**
     * 德州-俱乐部团队返点
     */
    @ApiModelProperty(value = "德州-俱乐部团队返点")
    private BigDecimal clubRebateAmount = BigDecimal.ZERO;

    /**
     * 德州-保险团队分成
     */
    @ApiModelProperty(value = "德州-保险团队分成")
    private BigDecimal insuranceRebateAmount = BigDecimal.ZERO;

    /**
     * 真人团队返点
     */
    @ApiModelProperty(value = "真人团队返点")
    private BigDecimal liveRebateAmount = BigDecimal.ZERO;

    /**
     * 体育团队返点
     */
    @ApiModelProperty(value = "体育团队返点")
    private BigDecimal sportRebateAmount = BigDecimal.ZERO;

    /**
     * 彩票团队返点
     */
    @ApiModelProperty(value = "彩票团队返点")
    private BigDecimal lotteryRebateAmount = BigDecimal.ZERO;

    /**
     * 棋牌团队返点
     */
    @ApiModelProperty(value = "棋牌团队返点")
    private BigDecimal chessRebateAmount = BigDecimal.ZERO;

    /**
     * 电竞团队返点
     */
    @ApiModelProperty(value = "电竞团队返点")
    private BigDecimal esportsRebateAmount;







}
