package com.dx.facade.report.resp.memberreward;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/** The type Member vip reward record rpc page resp summary dto. */
@ApiModel(value = "MemberVipRewardRecordRpcPageRespSummaryDto", description = "会员vip奖励发放记录总计 返回参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVipRewardRecordRpcPageRespSummaryDto implements Serializable {

    @ApiModelProperty(value = "奖励金额")
    private BigDecimal provideAmount;
}
