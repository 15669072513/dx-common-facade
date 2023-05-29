package com.dx.facade.report.param.proxydayreport;

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


    @ApiModelProperty(value = "存款总额")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "存款次数")
    private Integer depositTimes;

    @ApiModelProperty(value = "取款总额")
    private BigDecimal withdrawAmount;

    @ApiModelProperty(value = "取款次数")
    private Integer withdrawTimes;

    @ApiModelProperty(value = "大额取款次数")
    private Integer bigWithdrawTimes;

    @ApiModelProperty(value = "存取差")
    private BigDecimal depositWithdrawDifferAmount;

    @ApiModelProperty(value = "累计实际已得个人佣金")
    private BigDecimal totalReceivePersonBrokerage;

    @ApiModelProperty(value = "累计个人已收返点金额")
    private BigDecimal totalReceiveRebate;

    @ApiModelProperty(value = "代存会员总额")
    private BigDecimal insteadPlayerDepositAmount;

    @ApiModelProperty(value = "代存会员人数")
    private Integer insteadPlayerDepositNum;

    @ApiModelProperty(value = "代存会员次数")
    private Integer insteadPlayerDepositTimes;

    @ApiModelProperty(value = "代理转账总额")
    private BigDecimal proxyTransferAmount;

    @ApiModelProperty(value = "代理转账人数")
    private Integer proxyTransferNum;

    @ApiModelProperty(value = "代理转账次数")
    private Integer proxyTransferTimes;

    @ApiModelProperty(value = "转入中心钱包总额")
    private BigDecimal transferCenterWalletAmount;

    @ApiModelProperty(value = "转入中心钱包次数")
    private Integer transferCenterWalletTimes;

    @ApiModelProperty(value = "优惠总额")
    private BigDecimal discountAmount;

    @ApiModelProperty(value = "佣金调整")
    private BigDecimal rebateAdjustAmount;

    @ApiModelProperty(value = "其他调整")
    private BigDecimal otherAdjustAmount;

    @ApiModelProperty(value = "返点调整")
    private BigDecimal repairRebatePoint;

    @ApiModelProperty(value = "会员首存总额")
    private BigDecimal memberFirstDepositAmount;

    @ApiModelProperty(value = "会员首存人数")
    private Integer memberFirstDepositNum;

    @ApiModelProperty(value = "会员存款总额")
    private BigDecimal memberDepositAmount;

    @ApiModelProperty(value = "会员取款总额")
    private BigDecimal memberWithdrawAmount;

    @ApiModelProperty(value = "会员存取款差")
    private BigDecimal memberDepositWithdrawDifferAmount;

    @ApiModelProperty(value = "转入会员数")
    private Integer transferInNum;

    @ApiModelProperty(value = "转出会员数")
    private Integer transferOutNum;

    @ApiModelProperty(value = "全部下级代理人数")
    private Integer underProxyNum;

    @ApiModelProperty(value = "直属下级代理人数")
    private Integer directlyUnderProxyNum;

    @ApiModelProperty(value = "全部下级会员人数")
    private Integer underMemberNum;

    @ApiModelProperty(value = "直属下级会员人数")
    private Integer directlyUnderMemberNum;

    @ApiModelProperty(value = "佣金钱包余额")
    private BigDecimal rebateBalance;

    @ApiModelProperty(value = "额度钱包余额")
    private BigDecimal availableBalance;
}
