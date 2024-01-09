package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author REBUY
 */
@Setter
@Getter
@ApiModel(value="德信数据日报-财务通道数据", description="德信日报-财务通道数据")
public class DxDFinancialDataDTO {
    @ApiModelProperty("类别")
    private String dataType;
    @ApiModelProperty("通道名称")
    private String channelName;
    @ApiModelProperty("下单人数")
    private BigDecimal placedOrders;
    @ApiModelProperty("总单量")
    private BigDecimal totalOrders;
    @ApiModelProperty("成功单数")
    private BigDecimal successfulOrders;
    @ApiModelProperty("成功率")
    private String successfulRate;
    @ApiModelProperty("金额")
    private BigDecimal amount;
    @ApiModelProperty("出入金参数：payIn-充值，payOut-提现")
    private String payType;
}
