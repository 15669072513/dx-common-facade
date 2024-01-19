package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "ProxyRebateDataResDTO", description = "代理返点数据返回参数")
public class ProxyRebateDataResDTO {
    private Long id;
    @ApiModelProperty("结算周期")
    private String reportDate;
    @ApiModelProperty(value = "代理账号", example = "string0001")
    private String proxyName;
    @ApiModelProperty(value = "代理层级", example = "1")
    private Integer proxyLevel;
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;
    @ApiModelProperty("总代账号")
    private String topProxyName;
    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;
    @ApiModelProperty(value = "下级返点金额")
    private BigDecimal childRebateAmount;
    @ApiModelProperty(value = "团队返点金额")
    private BigDecimal rebateAmount;
    @ApiModelProperty("德州俱乐部返点")
    private BigDecimal texasAmount;
    @ApiModelProperty("德州保险返点")
    private BigDecimal texasInsuranceAmount;
    @ApiModelProperty(value = "真人团队返点")
    private BigDecimal liveRebateAmount;
    @ApiModelProperty(value = "体育团队返点")
    private BigDecimal sportRebateAmount;
    @ApiModelProperty(value = "彩票团队返点")
    private BigDecimal lotteryRebateAmount;
    @ApiModelProperty(value = "棋牌团队返点")
    private BigDecimal chessRebateAmount;
    @ApiModelProperty(value = "电竞团队返点")
    private BigDecimal esportsRebateAmount;

    public ProxyRebateDataResDTO(BigDecimal personRebateAmount, BigDecimal childRebateAmount, BigDecimal rebateAmount, BigDecimal texasAmount, BigDecimal texasInsuranceAmount, BigDecimal liveRebateAmount, BigDecimal sportRebateAmount, BigDecimal lotteryRebateAmount, BigDecimal chessRebateAmount, BigDecimal esportsRebateAmount) {
        this.personRebateAmount = personRebateAmount;
        this.childRebateAmount = childRebateAmount;
        this.rebateAmount = rebateAmount;
        this.texasAmount = texasAmount;
        this.texasInsuranceAmount = texasInsuranceAmount;
        this.liveRebateAmount = liveRebateAmount;
        this.sportRebateAmount = sportRebateAmount;
        this.lotteryRebateAmount = lotteryRebateAmount;
        this.chessRebateAmount = chessRebateAmount;
        this.esportsRebateAmount = esportsRebateAmount;
    }
}
