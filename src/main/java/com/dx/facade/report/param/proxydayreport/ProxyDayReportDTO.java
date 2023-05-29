package com.dx.facade.report.param.proxydayreport;

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
public class ProxyDayReportDTO implements Serializable {

    @ApiModelProperty(value = "日期，比如20210727")
    private Integer staticsDate;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "0-ob,1-美播")
    private Integer appId;

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

}
