package com.dx.facade.member.proxy.resp;

import com.dx.annotation.I18nField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProxyRebatePageRespDTO {

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "appid")
    private Integer appId;

    /**
     * 订单号
     */
    @ApiModelProperty(value = "订单号")
    private String orderNo;

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
    @ApiModelProperty(value = "周期起始日期yyyyMMdd")
    private Integer cycleStartDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty(value = "周期结束日期yyyyMMdd")
    private Integer cycleEndDate;

    /**
     * 代理账号
     */
    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    /**
     * 上级理账号
     */
    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyAccount;

    @ApiModelProperty(value = "所属商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "所属商户")
    private String merchantName;

    /**
     * 代理层级
     */
    @ApiModelProperty(value = "代理层级ID")
    private Integer proxyLevelId;


    @ApiModelProperty(value = "代理层级name")
    private String proxyLevelName;

    /**
     * 账号状态
     */
    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer  accountLockStatus;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    /**
     * 代理类型
     */
    @ApiModelProperty(value = "代理类型")
    private Integer accountType;


    /**
     * 风控层级
     */
    @ApiModelProperty(value = "风控层级")
    private String windControlName;

    /**
     * 派发状态
     */
    @ApiModelProperty(value = "'派发状态 (0-未结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)")
    private Integer payoutStatus;

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

    /**
     * 总会员游戏流水
     */
    @ApiModelProperty(value = "总流水")
    private BigDecimal totalBetAmount;

    /**
     * 总会员流水纠正金额
     */
    @ApiModelProperty(value = "流水纠正")
    private BigDecimal totalAdjustBetAmount;

    /**
     * 实际总流水金额
     */
    @ApiModelProperty(value = "实际流水")
    private BigDecimal totalRealBetAmount;

    /**
     * 流点比例
     */
    @ApiModelProperty(value = "流点比例")
    private BigDecimal rebateRate;

    /**
     * 活跃人数
     */
    @ApiModelProperty(value = "活跃人数")
    private Integer activeNum;

    /**
     * 有效活跃人数
     */
    @ApiModelProperty(value = "有效活跃人数")
    private Integer effecactiveActiveNumNew;

    /**
     * 契约id
     */
    @ApiModelProperty(value = "契约id")
    private Long contractId;

    /**
     * 契约等级
     */
    @ApiModelProperty(value = "契约等级")
    private Integer contractLevel;

    /**
     * 发放时间
     */
    @ApiModelProperty(value = "发放时间")
    private LocalDateTime payoutTime;

    /**
     * 领取时间
     */
    @ApiModelProperty(value = "领取时间")
    private LocalDateTime reciveDate;

    @ApiModelProperty(value = "审核备注1")
    @I18nField
    private String audit1Desc;

    @ApiModelProperty(value = "审核备注2")
    @I18nField
    private String audit2Desc;

    /**
     * 二审状态
     */
    @ApiModelProperty(value = "二审状态")
    private Integer audit2Result;

    @ApiModelProperty(value = "币种")
    private String currency;

}