package com.dx.facade.report.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @title 返点报表查询接口响应数据传输对象
 * @desc
 * @dbType mysql
 * @dbTable ob_player.ob_proxy_rebate_d
 * @author gollum
 * @version 1.0.0
 * @since 2021年09月25日 09:29:39
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("返点报表查询合计接口响应数据传输对象")
public class ReportRebateTotalRespDTO implements Serializable {

    @ApiModelProperty(value = "返点金额(CNY)", required = true, example = "2343")
    private BigDecimal personRebateAmountInCNY;

    @ApiModelProperty(value = "返点金额(VND)", required = true, example = "2343")
    private BigDecimal personRebateAmountInVND;

    @ApiModelProperty(value = "返点金额(THB)", required = true, example = "2343")
    private BigDecimal personRebateAmountInTHB;

}
