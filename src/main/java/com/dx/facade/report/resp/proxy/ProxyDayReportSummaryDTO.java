package com.dx.facade.report.resp.proxy;

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


    @ApiModelProperty(value = "存款总额(CNY)", required = true, example = "2343")
    private BigDecimal depositAmountInCNY;

    @ApiModelProperty(value = "存款总额(VND)", required = true, example = "2343")
    private BigDecimal depositAmountInVND;

    @ApiModelProperty(value = "存款总额(THB)", required = true, example = "2343")
    private BigDecimal depositAmountInTHB;

    @ApiModelProperty(value = "存款次数")
    private Integer depositTimes;

    @ApiModelProperty(value = "取款总额(CNY)", required = true, example = "2343")
    private BigDecimal withdrawAmountInCNY;

    @ApiModelProperty(value = "取款总额(VND)", required = true, example = "2343")
    private BigDecimal withdrawAmountInVND;

    @ApiModelProperty(value = "取款总额(THB)", required = true, example = "2343")
    private BigDecimal withdrawAmountInTHB;

    @ApiModelProperty(value = "取款次数")
    private Integer withdrawTimes;

    @ApiModelProperty(value = "存取差(CNY)", required = true, example = "2343")
    private BigDecimal depositWithdrawDifferAmountInCNY;

    @ApiModelProperty(value = "存取差(VND)", required = true, example = "2343")
    private BigDecimal depositWithdrawDifferAmountInVND;

    @ApiModelProperty(value = "存取差(THB)", required = true, example = "2343")
    private BigDecimal depositWithdrawDifferAmountInTHB;

    @ApiModelProperty(value = "累计返佣(CNY)", required = true, example = "2343")
    private BigDecimal totalReceivePersonBrokerageInCNY;

    @ApiModelProperty(value = "累计返佣(VND)", required = true, example = "2343")
    private BigDecimal totalReceivePersonBrokerageInVND;

    @ApiModelProperty(value = "累计返佣(THB)", required = true, example = "2343")
    private BigDecimal totalReceivePersonBrokerageInTHB;

    @ApiModelProperty(value = "累计返点(CNY)", required = true, example = "2343")
    private BigDecimal totalReceiveRebateInCNY;

    @ApiModelProperty(value = "累计返点(VND)", required = true, example = "2343")
    private BigDecimal totalReceiveRebateInVND;

    @ApiModelProperty(value = "累计返点(THB)", required = true, example = "2343")
    private BigDecimal totalReceiveRebateInTHB;

    @ApiModelProperty(value = "代存会员总额(CNY)", required = true, example = "2343")
    private BigDecimal insteadPlayerDepositAmountInCNY;

    @ApiModelProperty(value = "代存会员总额(VND)", required = true, example = "2343")
    private BigDecimal insteadPlayerDepositAmountInVND;

    @ApiModelProperty(value = "代存会员总额(THB)", required = true, example = "2343")
    private BigDecimal insteadPlayerDepositAmountInTHB;

    @ApiModelProperty(value = "代存会员人数")
    private Integer insteadPlayerDepositNum;

    @ApiModelProperty(value = "代存会员次数")
    private Integer insteadPlayerDepositTimes;

    @ApiModelProperty(value = "转入中心钱包总额(CNY)", required = true, example = "2343")
    private BigDecimal transferCenterWalletAmountInCNY;

    @ApiModelProperty(value = "转入中心钱包总额(VND)", required = true, example = "2343")
    private BigDecimal transferCenterWalletAmountInVND;

    @ApiModelProperty(value = "转入中心钱包总额(THB)", required = true, example = "2343")
    private BigDecimal transferCenterWalletAmountInTHB;

    @ApiModelProperty(value = "转入中心钱包次数")
    private Integer transferCenterWalletTimes;

    @ApiModelProperty(value = "上级转账金额(CNY)", required = true, example = "2343")
    private BigDecimal proxyTransferInAmountInCNY;

    @ApiModelProperty(value = "上级转账金额(VND)", required = true, example = "2343")
    private BigDecimal proxyTransferInAmountInVND;

    @ApiModelProperty(value = "上级转账金额(THB)", required = true, example = "2343")
    private BigDecimal proxyTransferInAmountInTHB;

    @ApiModelProperty(value = "上级转账次数")
    private Integer proxyTransferInTimes;

    @ApiModelProperty(value = "转账下级金额(CNY)", required = true, example = "2343")
    private BigDecimal proxyTransferOutAmountInCNY;

    @ApiModelProperty(value = "转账下级金额(VND)", required = true, example = "2343")
    private BigDecimal proxyTransferOutAmountInVND;

    @ApiModelProperty(value = "转账下级金额(THB)", required = true, example = "2343")
    private BigDecimal proxyTransferOutAmountInTHB;

    @ApiModelProperty(value = "转账下级次数")
    private Integer proxyTransferOutTimes;

    @ApiModelProperty(value = "优惠总额(CNY)", required = true, example = "2343")
    private BigDecimal discountAmountInCNY;

    @ApiModelProperty(value = "优惠总额(VND)", required = true, example = "2343")
    private BigDecimal discountAmountInVND;

    @ApiModelProperty(value = "优惠总额(THB)", required = true, example = "2343")
    private BigDecimal discountAmountInTHB;

    @ApiModelProperty(value = "其他调整(CNY)", required = true, example = "2343")
    private BigDecimal otherAdjustAmountInCNY;

    @ApiModelProperty(value = "其他调整(VND)", required = true, example = "2343")
    private BigDecimal otherAdjustAmountInVND;

    @ApiModelProperty(value = "其他调整(THB)", required = true, example = "2343")
    private BigDecimal otherAdjustAmountInTHB;

    @ApiModelProperty(value = "会员首存总额(CNY)", required = true, example = "2343")
    private BigDecimal memberFirstDepositAmountInCNY;

    @ApiModelProperty(value = "会员首存总额(VND)", required = true, example = "2343")
    private BigDecimal memberFirstDepositAmountInVND;

    @ApiModelProperty(value = "会员首存总额(THB)", required = true, example = "2343")
    private BigDecimal memberFirstDepositAmountInTHB;

    @ApiModelProperty(value = "会员注册首存人数")
    private Integer memberRegisterAndFirstDepositNum;

//    @ApiModelProperty(value = "会员存款总额(CNY)", required = true, example = "2343")
//    private BigDecimal memberDepositAmountInCNY;
//
//    @ApiModelProperty(value = "会员存款总额(VND)", required = true, example = "2343")
//    private BigDecimal memberDepositAmountInVND;
//
//    @ApiModelProperty(value = "会员存款总额(THB)", required = true, example = "2343")
//    private BigDecimal memberDepositAmountInTHB;
//
//    @ApiModelProperty(value = "会员取款总额(CNY)", required = true, example = "2343")
//    private BigDecimal memberWithdrawAmountInCNY;
//
//    @ApiModelProperty(value = "会员取款总额(VND)", required = true, example = "2343")
//    private BigDecimal memberWithdrawAmountInVND;
//
//    @ApiModelProperty(value = "会员取款总额(THB)", required = true, example = "2343")
//    private BigDecimal memberWithdrawAmountInTHB;
//
//    @ApiModelProperty(value = "会员存取款差(CNY)", required = true, example = "2343")
//    private BigDecimal memberDepositWithdrawDifferAmountInCNY;
//
//    @ApiModelProperty(value = "会员存取款差(VND)", required = true, example = "2343")
//    private BigDecimal memberDepositWithdrawDifferAmountInVND;
//
//    @ApiModelProperty(value = "会员存取款差(THB)", required = true, example = "2343")
//    private BigDecimal memberDepositWithdrawDifferAmountInTHB;

    @ApiModelProperty(value = "会员投注盈亏(CNY)", required = true, example = "2343")
    private BigDecimal memberNetAmountInCNY;

    @ApiModelProperty(value = "会员投注盈亏(VND)", required = true, example = "2343")
    private BigDecimal memberNetAmountInVND;

    @ApiModelProperty(value = "会员投注盈亏(THB)", required = true, example = "2343")
    private BigDecimal memberNetAmountInTHB;

}
