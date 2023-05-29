package com.dx.facade.report.resp.proxycommission;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 佣金审核下钻接口(统计活跃人数)
 *
 * @author kygo
 * @version 1.0.0
 * @since 2021.9.22
 */
@Data
@Builder
public class SumActivityMemberRespDTO {

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long playerId;

    /**
     * 会员名称
     */
    @ApiModelProperty(value = "会员名称")
    private String playerName;


    /**
     * 会员姓名
     */
    @ApiModelProperty(value = "会员姓名")
    private String realName;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;

    /**
     * 上级代理账号
     */
    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyAccount;

    /**
     * 风控层级
     */
    @ApiModelProperty(value = "风控层级")
    private String riskLevel;

    /**
     * 存款金额（包含人工）
     */
    @ApiModelProperty(value = "存款金额（包含人工）")
    private BigDecimal depositAmount;
    /**
     * 有效投注
     */
    @ApiModelProperty(value = "有效投注额度")
    private BigDecimal validBetAmount;

    /**
     * 投注量
     */
    @ApiModelProperty(value = "投注总额")
    private BigDecimal betAmount;

    /**
     * 投注注单量
     */
    @ApiModelProperty(value = "投注注单量")
    private Integer betCount;

    /**
     * 注册IP
     */
    @ApiModelProperty(value = "注册IP")
    private String registerIp;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    private String registerDate;

    /**
     * 注册终端
     */
    @ApiModelProperty(value = "注册终端")
    private String registerDevice;
}