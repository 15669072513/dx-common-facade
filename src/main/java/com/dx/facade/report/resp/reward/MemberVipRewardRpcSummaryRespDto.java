package com.dx.facade.report.resp.reward;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/** The type Member vip reward record rpc page resp summary dto. */
@ApiModel(value = "MemberVipRewardRpcSummaryRespDto", description = "会员vip奖励发放记录总计 返回参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVipRewardRpcSummaryRespDto implements Serializable {

    @ApiModelProperty(value = "奖励金额合计(CNY)", required = true, example = "2343")
    private BigDecimal provideAmountInCNY;

    @ApiModelProperty(value = "奖励金额合计(VND)", required = true, example = "2343")
    private BigDecimal provideAmountInVND;

    @ApiModelProperty(value = "奖励金额合计(THB)", required = true, example = "2343")
    private BigDecimal provideAmountInTHB;

}
