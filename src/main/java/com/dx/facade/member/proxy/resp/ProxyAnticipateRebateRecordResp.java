package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.math.BigDecimal;

/**
 * @author PC
 */
@Data
@ApiModel(value="中控代理预期返水列表", description="中控代理预期返水列表")
public class ProxyAnticipateRebateRecordResp {

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    /**
     * 周期名称
     */
    @ApiModelProperty(value = "周期名称")
    private String cycleName;

    /**
     * 周期起始日期
     */
    @ApiModelProperty(value = "周期起始日期yyyyMMdd")
    private String cycleStartDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty(value = "周期结束日期yyyyMMdd")
    private String cycleEndDate;

    /**
     * 代理账号
     */
    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    /**
     * 总代账号
     */
    @ApiModelProperty(value = "总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "所属商户")
    private String merchantName;


    /**
     * 个人返点金额
     */
    @ApiModelProperty(value = "个人返点")
    private BigDecimal personRebateAmount;

    /**
     * 下级返点金额
     */
    @ApiModelProperty(value = "下级返点")
    private BigDecimal childRebateAmount;

    /**
     * 团队返点金额
     */
    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount;


    @ApiModelProperty(value = "币种")
    private String currency;

    /**
     * 德州-俱乐部团队返点
     */
    @ApiModelProperty(value = "德州-俱乐部团队返点")
    private BigDecimal clubRebateAmount;

    /**
     * 德州-保险团队分成
     */
    @ApiModelProperty(value = "德州-保险团队分成")
    private BigDecimal insuranceRebateAmount;

    /**
     * 真人团队返点
     */
    @ApiModelProperty(value = "真人团队返点")
    private BigDecimal liveRebateAmount;

    /**
     * 体育团队返点
     */
    @ApiModelProperty(value = "体育团队返点")
    private BigDecimal sportRebateAmount;

    /**
     * 彩票团队返点
     */
    @ApiModelProperty(value = "彩票团队返点")
    private BigDecimal lotteryRebateAmount;

    /**
     * 棋牌团队返点
     */
    @ApiModelProperty(value = "棋牌团队返点")
    private BigDecimal chessRebateAmount;

    /**
     * 电竞团队返点
     */
    @ApiModelProperty(value = "电竞团队返点")
    private BigDecimal esportsRebateAmount;







}
