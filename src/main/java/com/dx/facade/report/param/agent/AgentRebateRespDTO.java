package com.dx.facade.report.param.agent;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 代理web 代理返点 AgentRebateRespDTO
 *
 * @author kygo
 * @version 1.0.0
 * @since 2022.04.22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgentRebateRespDTO {
    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "代理id")
    private String proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月")
    private Integer cycleType;

    @ApiModelProperty(value = "周期名称")
    private String cycleName;

    @ApiModelProperty(value = "报表日期")
    private Integer reportDate;

    @ApiModelProperty(value = "团队总流水")
    private BigDecimal totalBetAmount;

    @ApiModelProperty(value = "团队有效流水")
    private BigDecimal totalValidBetAmount;

    @ApiModelProperty(value = "团队游戏注单量")
    private Integer totalBetNum;

    @ApiModelProperty(value = "团队游戏人数")
    private Integer totalBetMemberNum;

    @ApiModelProperty(value = "团队总盈亏")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "流水纠正")
    private BigDecimal totalAdjustBetAmount;

    @ApiModelProperty(value = "实际流水")
    private BigDecimal totalRealBetAmount;

    @ApiModelProperty(value = "活跃人数")
    private Integer activeNum;

    @ApiModelProperty(value = "有效活跃人数")
    private Integer effecactiveActiveNumNew;

    @ApiModelProperty(value = "返点比例")
    private BigDecimal rebateRate;

    @ApiModelProperty(value = "团队总返点")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "返点调整金额")
    private BigDecimal rebateAdjustAmount;

    @ApiModelProperty(value = "个人总返点/个人返点")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "下级总返点")
    private BigDecimal childRebateAmount;

    @ApiModelProperty(value = "返点状态/派发状态 (1-待发放 2=待领取 3-已发放 4-已过期 5-无返点 6-已取消)")
    private Integer payoutStatus;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "契约ID")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long contractId;

    @ApiModelProperty(value = "契约等级序号")
    private Integer contractLevel;

    @ApiModelProperty(value = "true有下级,false无下级")
    private Boolean isAllsub;
}
