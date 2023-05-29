package com.dx.facade.report.resp.accessamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessAmountDayRespDTO {


    @ApiModelProperty("日期，比如20210531")
    private String staticsDate;

    @ApiModelProperty("用户类型(0=会员 1=代理) 枚举ConstantEnums.UserType")
    private Integer userType;

    @ApiModelProperty("三方入款CNY")
    private BigDecimal depositAmountCNY;
    @ApiModelProperty("三方入款VND")
    private BigDecimal depositAmountVND;
    @ApiModelProperty("三方入款THB")
    private BigDecimal depositAmountTHB;

    @ApiModelProperty("人工入款CNY")
    private BigDecimal backDepositAmountCNY;
    @ApiModelProperty("人工入款VND")
    private BigDecimal backDepositAmountVND;
    @ApiModelProperty("人工入款THB")
    private BigDecimal backDepositAmountTHB;

    @ApiModelProperty("三方出款CNY")
    private BigDecimal withdrawalAmountCNY;
    @ApiModelProperty("三方出款VND")
    private BigDecimal withdrawalAmountVND;
    @ApiModelProperty("三方出款THB")
    private BigDecimal withdrawalAmountTHB;

    @ApiModelProperty("人工出款CNY")
    private BigDecimal backWithdrawalAmountCNY;
    @ApiModelProperty("人工出款VND")
    private BigDecimal backWithdrawalAmountVND;
    @ApiModelProperty("人工出款THB")
    private BigDecimal backWithdrawalAmountTHB;

    @ApiModelProperty("总入款CNY")
    private BigDecimal depositAmountTotalCNY;
    @ApiModelProperty("总入款VND")
    private BigDecimal depositAmountTotalVND;
    @ApiModelProperty("总入款THB")
    private BigDecimal depositAmountTotalTHB;

    @ApiModelProperty("总出款CNY")
    private BigDecimal withdrawalAmountTotalCNY;
    @ApiModelProperty("总出款VND")
    private BigDecimal withdrawalAmountTotalVND;
    @ApiModelProperty("总出款THB")
    private BigDecimal withdrawalAmountTotalTHB;

    @ApiModelProperty("存取差CNY")
    private BigDecimal accessAmountCNY;
    @ApiModelProperty("存取差VND")
    private BigDecimal accessAmountVND;
    @ApiModelProperty("存取差THB")
    private BigDecimal accessAmountTHB;


}
