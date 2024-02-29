package com.dx.facade.report.resp.report.profitandloss;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 运营状况-德州数据 返回DTO
 *
 * @author Adu
 * @date 2024/2/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("运营状况-德州数据返回对象")
public class ProfitPlatformDzRespDTO implements Serializable {

    /**
     * 报表日期
     */
    @ApiModelProperty("报表日期")
    private String reportDate;

    /**
     * 投注额
     */
    @ApiModelProperty("投注额")
    private BigDecimal betAmount;

    /**
     * 有效投注额
     */
    @ApiModelProperty("有效投注额")
    private BigDecimal validBetAmount;

    /**
     * 抽水总额
     */
    @ApiModelProperty("抽水总额")
    private BigDecimal pumpAmount;

    /**
     * 代理抽水额
     */
    @ApiModelProperty("代理抽水额")
    private BigDecimal proxyPumpAmount;

    /**
     * 代理抽水比例
     */
    @ApiModelProperty("代理抽水比例")
    private BigDecimal proxyPumpRatio;

    /**
     * 保险投注额
     */
    @ApiModelProperty("保险投注额")
    private BigDecimal insureAmount;

    /**
     * 保险有效投注额
     */
    @ApiModelProperty("保险有效投注额")
    private BigDecimal insureValidBetAmount;

    /**
     * 保险会员输赢
     */
    @ApiModelProperty("保险会员输赢")
    private BigDecimal insureMemberNetAmount;

    /**
     * 保险平台输赢
     */
    @ApiModelProperty("保险平台输赢")
    private BigDecimal insurePlatformNetAmount;

    /**
     * 保险代理占成输赢
     */
    @ApiModelProperty("保险代理占成输赢")
    private BigDecimal insureProxyProportion;

    /**
     * 保险盈余比例
     */
    @ApiModelProperty("保险盈余比例")
    private BigDecimal insureWinRatio;

    /**
     * 德州账户调整
     */
    @ApiModelProperty("德州账户调整")
    private BigDecimal adjustAmount;

    /**
     * 德州场馆平台收入
     */
    @ApiModelProperty("德州场馆平台收入")
    private BigDecimal platformIncomeAmount;

}
