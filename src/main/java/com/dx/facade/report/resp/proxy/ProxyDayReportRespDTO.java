package com.dx.facade.report.resp.proxy;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-ProxyDayReportDTO", description = "代理报表对象")
public class ProxyDayReportRespDTO implements Serializable {

    @ApiModelProperty(value = "代理id")
    private String proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "代理层级name")
    private String proxyLevel;

    @ApiModelProperty(value = "账号类型")
    private Integer accountType;

    @ApiModelProperty(value = "直属上级")
    private String parentProxyAccount;

    @ApiModelProperty(value = "顶级代理")
    private String topProxyAccount;

    @ApiModelProperty(value = "所属商户名称")
    private String merchantName;

    @ApiModelProperty(value = "顶级商户名称")
    private String topMerchantName;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    @ApiModelProperty(value = "代理标签")
    private String labelName;

    @ApiModelProperty(value = "注册时间")
    private String registerAt;

    @ApiModelProperty(value = "总存款/会员总存款")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "存款次数/会员存款次数")
    private Integer depositTimes;

    @ApiModelProperty(value = "总取款/会员总取款")
    private BigDecimal withdrawAmount;

    @ApiModelProperty(value = "取款次数/会员取款次数")
    private Integer withdrawTimes;

    @ApiModelProperty(value = "大额取款次数")
    private Integer bigWithdrawTimes;

    @ApiModelProperty(value = "存取差/会员存取差")
    private BigDecimal depositWithdrawDifferAmount;

    @ApiModelProperty(value = "累计实际已得个人佣金(累计返佣)")
    private BigDecimal totalReceivePersonBrokerage;

    @ApiModelProperty(value = "累计个人已收返点金额(累计返点)")
    private BigDecimal totalReceiveRebate;

    @ApiModelProperty(value = "代理代存")
    private BigDecimal insteadPlayerDepositAmount;

    @ApiModelProperty(value = "代存会员人数")
    private Integer insteadPlayerDepositNum;

    @ApiModelProperty(value = "代存次数")
    private Integer insteadPlayerDepositTimes;

    @ApiModelProperty(value = "转入中心钱包总额(佣金转回)")
    private BigDecimal transferCenterWalletAmount;

    @ApiModelProperty(value = "转入中心钱包次数(转回次数)")
    private Integer transferCenterWalletTimes;

    @ApiModelProperty(value = "上级转账金额")
    private BigDecimal proxyTransferInAmount;

    @ApiModelProperty(value = "上级转账次数")
    private Integer proxyTransferInTimes;

    @ApiModelProperty(value = "转账下级金额")
    private BigDecimal proxyTransferOutAmount;

    @ApiModelProperty(value = "转账下级次数")
    private Integer proxyTransferOutTimes;

    @ApiModelProperty(value = "优惠总额")
    private BigDecimal discountAmount;

    @ApiModelProperty(value = "其他调整")
    private BigDecimal otherAdjustAmount;

    @ApiModelProperty(value = "佣金钱包余额")
    private BigDecimal rebateBalance;

    @ApiModelProperty(value = "额度钱包余额")
    private BigDecimal availableBalance;

    @ApiModelProperty(value = "欠款标记 0:无, 1有")
    private Integer debtStatus;

    @ApiModelProperty(value = "会员首存总额")
    private BigDecimal memberFirstDepositAmount;

    @ApiModelProperty(value = "会员首存人数")
    private Integer memberFirstDepositNum;

    @ApiModelProperty(value = "会员注册首存人数")
    private Integer memberRegisterAndFirstDepositNum;

//    @ApiModelProperty(value = "会员存款总额")
//    private BigDecimal memberDepositAmount;
//
//    @ApiModelProperty(value = "会员存款次数")
//    private BigDecimal memberDepositTimes;
//
//    @ApiModelProperty(value = "会员取款总额")
//    private BigDecimal memberWithdrawAmount;
//
//    @ApiModelProperty(value = "会员取款次数")
//    private BigDecimal memberWithdrawTimes;
//
//    @ApiModelProperty(value = "会员存取款差")
//    private BigDecimal memberDepositWithdrawDifferAmount;

    @ApiModelProperty(value = "会员投注盈亏")
    private BigDecimal memberNetAmount;

    @ApiModelProperty(value = "全部下级代理人数")
    private Integer underProxyNum;

    @ApiModelProperty(value = "直属下级代理人数")
    private Integer directlyUnderProxyNum;

    @ApiModelProperty(value = "全部下级会员人数")
    private Integer underMemberNum;

    @ApiModelProperty(value = "直属下级会员人数")
    private Integer directlyUnderMemberNum;

    @ApiModelProperty(value = "转入会员数")
    private Integer transferInNum;

    @ApiModelProperty(value = "转出会员数")
    private Integer transferOutNum;

    @ApiModelProperty(value = "当前币种")
    private String currency;

    //  上下分

    @ApiModelProperty("给会员上下分差值")
    @TableField("proxy_to_mem_differ_amount")
    private Long proxyToMemDifferAmount;

    @ApiModelProperty("给会员上下分次数")
    @TableField("proxy_to_mem_times")
    private Long proxyToMemTimes;

    @ApiModelProperty("给会员上下分人数")
    @TableField("proxy_to_mem_num")
    private Long proxyToMemNum;

    @ApiModelProperty("给代理上下分差值")
    @TableField("proxy_to_child_differ_amount")
    private Long proxyToChildDifferAmount;

    @ApiModelProperty("给代理上下分次数")
    @TableField("proxy_be_down_times")
    private Long proxyToChildTimes;

    @ApiModelProperty("给代理上下分人数")
    @TableField("proxy_to_child_num")
    private Long proxyToChildNum;

    @ApiModelProperty("被代理上下分差值")
    @TableField("proxy_be_differ_amount")
    private Long proxyBeDifferAmount;

    @ApiModelProperty("被代理上下分差次数")
    @TableField("proxy_be_differ_times")
    private Long proxyBeDifferTimes;


    @ApiModelProperty(value = "佣金转额度钱包总额")
    private BigDecimal transferAvailableWalletAmount ;

    @ApiModelProperty(value = "返点调整")
    private BigDecimal repairRebatePoint;



}
