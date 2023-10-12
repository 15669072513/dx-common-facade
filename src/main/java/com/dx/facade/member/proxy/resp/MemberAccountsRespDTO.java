package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class MemberAccountsRespDTO {

    // 会员账号信息
    /**
     * 会员账号
     */
    @ApiModelProperty(value = "会员账号")
    private String userName;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long memberId;

    /**
     * 会员姓名
     */
    @ApiModelProperty(value = "会员姓名")
    private String realName;

    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyAccount;

    @ApiModelProperty(value = "代理账号类型")
    private Integer accountType;


    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;


    /**
     * 账户状态
     */
    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    /**
     * 会员标签
     */
    @ApiModelProperty(value = "会员标签")
    private String labelId;

    /**
     * 风控等级
     */
    @ApiModelProperty(value = "风控等级")
    private String riskLevel;


    @ApiModelProperty(value = "注册日期")
    private String registerDate;

    @ApiModelProperty(value = "非总代佣金取消标志 0-未取消 1-已取消")
    private Integer cancelFlag;

    @ApiModelProperty(value = "(左边代理树)点击的当前代理佣金记录的id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long commRecordId;

    //************************************************************************ 佣金财务

    @ApiModelProperty(value="累计佣金期数")
    private BigDecimal totalBrokerageTimes;

    /**
     * 累计佣金实收支和
     */
    @ApiModelProperty(value="实际已收个人佣金(累计佣金实收支和)")
    private BigDecimal totalReceiveBrokerage;

    /**
     * 实收佣金-实付佣金= 累计所得佣金
     * ===>
     * 已得佣金=平台转入+佣金调整/上级转入+佣金调整  (20220210)
     */
    @ApiModelProperty(value="实际已得个人佣金")
    private BigDecimal totalReceivePersonBrokerage;

    /**
     * 累计应付佣金(欠款)
     */
    @ApiModelProperty(value="累计应付佣金(欠款)")
    private BigDecimal totalPayableBrokerage;

    //************************************************************************ 返点财务
    /**
     * 累计个人已收返点金额
     */
    @ApiModelProperty(value="累计个人已收返点金额")
    private BigDecimal totalReceiveRebate;

    /**
     * 累计返点期数
     */
    @ApiModelProperty(value="累计返点期数")
    private BigDecimal totalRebateTimes;

    /**
     * 代理VIP等级专享层级ID
     */
    @ApiModelProperty(value="代理VIP等级专享层级ID")
    private Integer proxyVipLevel;

    /**
     * 代理VIP等级专享层级名称
     */
    @ApiModelProperty(value="代理VIP等级专享层级名称")
    private String proxyVipLevelName;


    //************************************************************************ 返点审核记录点击进入

    @ApiModelProperty(value="游戏流水")
    private BigDecimal totalBetAmount;

    @ApiModelProperty(value="活跃人数")
    private Integer  activeNum;

    @ApiModelProperty(value="有效活跃人数")
    private Integer effecactiveActiveNumNew;

    @ApiModelProperty(value="契约id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long contractId;

    @ApiModelProperty(value = "返点比例")
    private BigDecimal rebateRate;

    @ApiModelProperty(value = "佣金契约等级序号")
    private Integer contractLevel;

    @ApiModelProperty(value = "流水纠正")
    private BigDecimal totalAdjustBetAmount;

    @ApiModelProperty(value = "实际总流水")
    private BigDecimal totalRealBetAmount;

    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "最终收益")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "下级返点金额")
    private BigDecimal childRebateAmount;

}
