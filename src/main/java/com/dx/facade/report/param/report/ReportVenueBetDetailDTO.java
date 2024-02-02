package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 代理日盈亏查询返回
 *
 * @author flash
 * @since 2024年1月6日 下午18:00:05
 */
@Data
@ApiModel(value = "ReportVenueBetDetailDTO", description = "中控后台-场馆盈亏-注单详情")
public class ReportVenueBetDetailDTO {
    @ApiModelProperty(value = "会员账号")
    private String userName;
    @ApiModelProperty(value = "会员昵称")
    private String nickName;
    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;
    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;
    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;
    @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;

    @ApiModelProperty("注单量")
    private Long betCount;
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;
    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;

    public ReportVenueBetDetailDTO(Long betCount, BigDecimal betAmount, BigDecimal validBetAmount, BigDecimal netAmount) {
        this.betCount = betCount;
        this.betAmount = betAmount;
        this.validBetAmount = validBetAmount;
        this.netAmount = netAmount;
    }

    public ReportVenueBetDetailDTO() {

    }
}
