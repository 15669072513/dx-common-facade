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
 * @author gollum
 * @version 1.0.0
 * @title 返点报表查询接口响应数据传输对象
 * @desc
 * @dbType mysql
 * @dbTable ob_player.ob_proxy_rebate_d
 * @since 2021年09月25日 09:29:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("返点报表查询合计接口响应数据传输对象")
public class ReportRebateTotalRespDTO implements Serializable {

    @ApiModelProperty(value = "返点金额(CNY)", required = true, example = "2343")
    protected BigDecimal personRebateAmountInCNY;

    @ApiModelProperty(value = "返点金额(VND)", required = true, example = "2343")
    protected BigDecimal personRebateAmountInVND;

    @ApiModelProperty(value = "返点金额(THB)", required = true, example = "2343")
    protected BigDecimal personRebateAmountInTHB;

    /**
     * 返点人数
     * person_rebate_amount
     */
    @ApiModelProperty(value = "返点人数", example = "1100.00")
    protected Integer rebateNumber = 0;

    /**
     * 实际返点
     * person_rebate_amount
     */
    @ApiModelProperty(value = "返点金额", example = "1100.00")
    protected BigDecimal personRebateAmount = BigDecimal.ZERO;

    /**
     * 返点发放，表中无对应字段，需计算，依据payout_status
     */
    @ApiModelProperty(value = "返点发放", example = "100.00")
    protected BigDecimal distributeOfRebate = BigDecimal.ZERO;

    /**
     * 返点调整，表中无对应字段，需计算
     */
    @ApiModelProperty(value = "返点调整", example = "500")
    protected BigDecimal adjustOfRebate = BigDecimal.ZERO;

}
