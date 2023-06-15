//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.dx.facade.report.param.report.business;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@ApiModel("返点报表查询接口响应数据传输对象")
public class ReportRebateRespDTO {
    @ApiModelProperty("代理id")
    private String proxyId;
    @ApiModelProperty("代理账号")
    private String proxyName;
    @ApiModelProperty("代理层级name")
    private String proxyLevel;
    @ApiModelProperty("账号类型")
    private Integer accountType;
    @ApiModelProperty("账号类型名称")
    private String accountTypeName;
    @ApiModelProperty("直属上级")
    private String parentProxyName;
    @ApiModelProperty("顶级代理")
    private String topProxyName;
    @ApiModelProperty("所属商户名称")
    private String merchantName;
    @ApiModelProperty("顶级商户名称")
    private String topMerchantName;
    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;
    @ApiModelProperty("账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;
    @ApiModelProperty("当前币种")
    private String currency;
    @ApiModelProperty(
        value = "周期起始日期",
        example = "2021-09-06"
    )
    private String cycleStartDate;
    @ApiModelProperty(
        value = "周期结束日期",
        example = "2021-09-12"
    )
    private String cycleEndDate;
    @ApiModelProperty(
        value = "返点金额",
        example = "1100.00"
    )
    private BigDecimal personRebateAmount;

}
