package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProxyRebateRecordRespDTO {

    /**
     * 周期类型: 1-天 2-周 3-月
     */
    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月")
    private Integer cycleType;

    /**
     * 周期名称
     */
    @ApiModelProperty(value = "周期名称")
    private String cycleName;

    /**
     * 周期起始日期
     */
    @ApiModelProperty(value = "周期起始日期")
    private Integer cycleStatrtDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty(value = "周期结束日期")
    private Integer cycleEndDate;

    /**
     * 总会员游戏流水
     */
    @ApiModelProperty(value = "总投注流水")
    private BigDecimal totalBetAmount;

    /**
     * 总会员有效游戏流水
     */
    @ApiModelProperty(value = "总有效游戏流水")
    private BigDecimal totalValidBetAmount;

    /**
     * 会员游戏注单量
     */
    @ApiModelProperty(value = "总注单量")
    private Integer totalBetNum;

    /**
     * 会员游戏人数
     */
    @ApiModelProperty(value = "总投注人数")
    private Integer totalBetMemberNum;

    /**
     * 会员总盈亏
     */
    @ApiModelProperty(value = "总盈亏")
    private BigDecimal totalNetAmount;

    /**
     * 总会员流水纠正金额
     */
    @ApiModelProperty(value = "总会员流水纠正金额")
    private BigDecimal totalAdjustBetAmount;

    /**
     * 实际总流水金额
     */
    @ApiModelProperty(value = "实际总流水金额")
    private BigDecimal totalRealBetAmount;

    /**
     * 团队返点金额
     */
    @ApiModelProperty(value = "团队返点金额")
    private BigDecimal rebateAmount;

    /**
     * 个人返点金额
     */
    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;

    /**
     * 下级返点金额
     */
    @ApiModelProperty(value = "下级返点金额")
    private BigDecimal childRebateAmount;

    /**
     * 返点调整金额
     */
    @ApiModelProperty(value = "返点调整金额")
    private BigDecimal rebateAdjustAmount;





}