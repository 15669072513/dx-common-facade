package com.dx.facade.report.param.report.profitandloss;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
//@TableName("dwm_member_net_amount_day")
@ApiModel(value = "ProxyProfitDay", description = "代理盈亏报表")
public class ProxyProfitDay   {

    @ApiModelProperty("游戏名称")
    private String gameName;


}