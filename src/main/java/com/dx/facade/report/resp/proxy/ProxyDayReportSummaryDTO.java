package com.dx.facade.report.resp.proxy;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-ProxyDayReportSummaryDTO", description = "会员报表总计对象")
public class ProxyDayReportSummaryDTO {


//    @ApiModelProperty(value = "存款总额(CNY)", required = true, example = "2343")
//    private BigDecimal depositAmountInCNY;
//
//    @ApiModelProperty(value = "存款总额(VND)", required = true, example = "2343")
//    private BigDecimal depositAmountInVND;
//
//    @ApiModelProperty(value = "存款总额(THB)", required = true, example = "2343")
//    private BigDecimal depositAmountInTHB;

//    @ApiModelProperty(value = "存款次数")
//    private Integer depositTimes;

//    @ApiModelProperty(value = "取款总额(CNY)", required = true, example = "2343")
//    private BigDecimal withdrawAmountInCNY;
//
//    @ApiModelProperty(value = "取款总额(VND)", required = true, example = "2343")
//    private BigDecimal withdrawAmountInVND;
//
//    @ApiModelProperty(value = "取款总额(THB)", required = true, example = "2343")
//    private BigDecimal withdrawAmountInTHB;

//    @ApiModelProperty(value = "取款次数")
//    private Integer withdrawTimes;

//    @ApiModelProperty(value = "存取差(CNY)", required = true, example = "2343")
//    private BigDecimal depositWithdrawDifferAmountInCNY;
//
//    @ApiModelProperty(value = "存取差(VND)", required = true, example = "2343")
//    private BigDecimal depositWithdrawDifferAmountInVND;
//
//    @ApiModelProperty(value = "存取差(THB)", required = true, example = "2343")
//    private BigDecimal depositWithdrawDifferAmountInTHB;
//
//    @ApiModelProperty(value = "累计返佣(CNY)", required = true, example = "2343")
//    private BigDecimal totalReceivePersonBrokerageInCNY;
//
//    @ApiModelProperty(value = "累计返佣(VND)", required = true, example = "2343")
//    private BigDecimal totalReceivePersonBrokerageInVND;
//
//    @ApiModelProperty(value = "累计返佣(THB)", required = true, example = "2343")
//    private BigDecimal totalReceivePersonBrokerageInTHB;
//
//    @ApiModelProperty(value = "累计返点(CNY)", required = true, example = "2343")
//    private BigDecimal totalReceiveRebateInCNY;
//
//    @ApiModelProperty(value = "累计返点(VND)", required = true, example = "2343")
//    private BigDecimal totalReceiveRebateInVND;
//
//    @ApiModelProperty(value = "累计返点(THB)", required = true, example = "2343")
//    private BigDecimal totalReceiveRebateInTHB;
//
//    @ApiModelProperty(value = "代存会员总额(CNY)", required = true, example = "2343")
//    private BigDecimal insteadPlayerDepositAmountInCNY;
//
//    @ApiModelProperty(value = "代存会员总额(VND)", required = true, example = "2343")
//    private BigDecimal insteadPlayerDepositAmountInVND;
//
//    @ApiModelProperty(value = "代存会员总额(THB)", required = true, example = "2343")
//    private BigDecimal insteadPlayerDepositAmountInTHB;

//    @ApiModelProperty(value = "代存会员人数")
//    private Integer insteadPlayerDepositNum;
//
//    @ApiModelProperty(value = "代存会员次数")
//    private Integer insteadPlayerDepositTimes;

//    @ApiModelProperty(value = "转入中心钱包总额(CNY)", required = true, example = "2343")
//    private BigDecimal transferCenterWalletAmountInCNY;
//
//    @ApiModelProperty(value = "转入中心钱包总额(VND)", required = true, example = "2343")
//    private BigDecimal transferCenterWalletAmountInVND;
//
//    @ApiModelProperty(value = "转入中心钱包总额(THB)", required = true, example = "2343")
//    private BigDecimal transferCenterWalletAmountInTHB;



//    @ApiModelProperty(value = "上级转账金额(CNY)", required = true, example = "2343")
//    private BigDecimal proxyTransferInAmountInCNY;
//
//    @ApiModelProperty(value = "上级转账金额(VND)", required = true, example = "2343")
//    private BigDecimal proxyTransferInAmountInVND;
//
//    @ApiModelProperty(value = "上级转账金额(THB)", required = true, example = "2343")
//    private BigDecimal proxyTransferInAmountInTHB;

//    @ApiModelProperty(value = "上级转账次数")
//    private Integer proxyTransferInTimes;

//    @ApiModelProperty(value = "转账下级金额(CNY)", required = true, example = "2343")
//    private BigDecimal proxyTransferOutAmountInCNY;
//
//    @ApiModelProperty(value = "转账下级金额(VND)", required = true, example = "2343")
//    private BigDecimal proxyTransferOutAmountInVND;
//
//    @ApiModelProperty(value = "转账下级金额(THB)", required = true, example = "2343")
//    private BigDecimal proxyTransferOutAmountInTHB;

//    @ApiModelProperty(value = "转账下级次数")
//    private Integer proxyTransferOutTimes;

//    @ApiModelProperty(value = "优惠总额(CNY)", required = true, example = "2343")
//    private BigDecimal discountAmountInCNY;
//
//    @ApiModelProperty(value = "优惠总额(VND)", required = true, example = "2343")
//    private BigDecimal discountAmountInVND;
//
//    @ApiModelProperty(value = "优惠总额(THB)", required = true, example = "2343")
//    private BigDecimal discountAmountInTHB;
//
//    @ApiModelProperty(value = "其他调整(CNY)", required = true, example = "2343")
//    private BigDecimal otherAdjustAmountInCNY;
//
//    @ApiModelProperty(value = "其他调整(VND)", required = true, example = "2343")
//    private BigDecimal otherAdjustAmountInVND;
//
//    @ApiModelProperty(value = "其他调整(THB)", required = true, example = "2343")
//    private BigDecimal otherAdjustAmountInTHB;
//
//    @ApiModelProperty(value = "会员首存总额(CNY)", required = true, example = "2343")
//    private BigDecimal memberFirstDepositAmountInCNY;
//
//    @ApiModelProperty(value = "会员首存总额(VND)", required = true, example = "2343")
//    private BigDecimal memberFirstDepositAmountInVND;
//
//    @ApiModelProperty(value = "会员首存总额(THB)", required = true, example = "2343")
//    private BigDecimal memberFirstDepositAmountInTHB;
//
//    @ApiModelProperty(value = "会员注册首存人数")
//    private Integer memberRegisterAndFirstDepositNum;
//
//    @ApiModelProperty(value = "会员投注盈亏(CNY)", required = true, example = "2343")
//    private BigDecimal memberNetAmountInCNY;
//
//    @ApiModelProperty(value = "会员投注盈亏(VND)", required = true, example = "2343")
//    private BigDecimal memberNetAmountInVND;
//
//    @ApiModelProperty(value = "会员投注盈亏(THB)", required = true, example = "2343")
//    private BigDecimal memberNetAmountInTHB;


    //
    @ApiModelProperty(value = "累计个人已收返点金额(累计返点)")
    private BigDecimal totalReceiveRebate;


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
    @TableField("proxy_to_child_times")
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


    @ApiModelProperty(value = "转入中心钱包次数")
    private Integer transferCenterWalletTimes;

    @ApiModelProperty(value = "转入中心钱包总额", required = true, example = "2343")
    private BigDecimal transferCenterWalletAmount;

    @ApiModelProperty(value = "佣金转额度钱包总额")
    private BigDecimal transferQuotaWalletAmount ;
    @ApiModelProperty(value = "转入中心钱包次数")
    private Integer transferQuotaWalletTimes;



    // TODO dwm_proxy_report_d
    @ApiModelProperty(value = "返点调整")
    private BigDecimal rebateAdjustAmount;



    @ApiModelProperty(value = "佣金钱包余额")
    private BigDecimal rebateBalance;

    @ApiModelProperty(value = "额度钱包余额")
    private BigDecimal availableBalance;


    @ApiModelProperty(value = "全部代理人数")
    private Integer underProxyNum;

    @ApiModelProperty(value = "直属代理人数")
    private Integer directlyUnderProxyNum;

    @ApiModelProperty(value = "全部会员人数")
    private Integer underMemberNum;

    @ApiModelProperty(value = "直属会员人数")
    private Integer directlyUnderMemberNum;

    @ApiModelProperty(value = "转入会员数")
    private Integer transferInNum;

    @ApiModelProperty(value = "转出会员数")
    private Integer transferOutNum;

}
