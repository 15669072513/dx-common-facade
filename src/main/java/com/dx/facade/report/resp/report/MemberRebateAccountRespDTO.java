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
@ApiModel("会员返水对账返回参数")
public class MemberRebateAccountRespDTO {

    @ApiModelProperty("结算时间")
    private Integer netAt;
    @ApiModelProperty(value = "注单号")
    private String betNo;
    @ApiModelProperty(value = "注单时间")
    private String betTime;
    @ApiModelProperty("场馆类型")
    private String venueType;
    @ApiModelProperty("场馆名称")
    private String venueName;
    @ApiModelProperty("游戏名称")
    private String gameName;
    @ApiModelProperty("游戏账号")
    private String gameAccount;
    @ApiModelProperty("会员账号")
    private String memberAccount;
    @ApiModelProperty("上级代理")
    private String parentProxyName;
    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty("所属商户")
    private String merchantName;
    @ApiModelProperty("注单类型:1俱乐部游戏;2保险")
    private Integer betType;
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;
    @ApiModelProperty("有效投注/抽水贡献")
    private BigDecimal validBetAmount;
    @ApiModelProperty("会员输赢")
    private BigDecimal memberNetAmount;
    @ApiModelProperty("平台发放返水比例")
    private BigDecimal platformRebateRatio;
    @ApiModelProperty("代理发放返水比例")
    private BigDecimal proxyRebateRatio;
    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty("(实际）平台发放返水比例")
    private BigDecimal realPlatformRebateRatio;
    @ApiModelProperty("(实际）代理发放返水比例")
    private BigDecimal realProxyRebateRatio;
    @ApiModelProperty("(实际）返水金额")
    private BigDecimal realRebateAmount;

}
