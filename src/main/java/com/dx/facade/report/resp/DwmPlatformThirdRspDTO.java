package com.dx.facade.report.resp;


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
@ApiModel(value = "DwmPlatformThirdRspDTO", description = "活动优惠报表详情对象")
public class DwmPlatformThirdRspDTO implements Serializable {

    @ApiModelProperty(value = "日期，比如20210727")
    private Integer staticsDate;
    @ApiModelProperty("新增用户")
    private Integer newMemberNum = 0 ;
    @ApiModelProperty("有效新增用户")
    private Integer validUserCount = 0;
    @ApiModelProperty("日活跃用户")
    private Integer activeMemberNum = 0 ;
    @ApiModelProperty("投注额")
    private BigDecimal betAmount;
    @ApiModelProperty("有效投注额")
    private BigDecimal validBetAmount;
    @ApiModelProperty("会员输赢")
    private BigDecimal netAmount;
    @ApiModelProperty("平台输赢")
    private BigDecimal platformNetAmount;
    @ApiModelProperty("总代理占成模式输赢")
    private BigDecimal commissionNetAmount;
    @ApiModelProperty("平台返水金额")
    private BigDecimal platformRebateAmount;
    @ApiModelProperty("代理占成返水金额")
    private BigDecimal commissionRebateAmount;
    @ApiModelProperty("占成比例-返回数字,前端需要加上%")
    private BigDecimal commissionRebate;
    @ApiModelProperty(value = "账户调整")
    private BigDecimal totalAcctadjustAmount;
    @ApiModelProperty(value = "平台收入")
    private BigDecimal platformIncomeAmount;
    @ApiModelProperty("盈余比例")
    private BigDecimal netRate;


}
