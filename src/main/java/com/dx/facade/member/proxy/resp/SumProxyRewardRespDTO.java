package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 统计总优惠聚合信息
 *
 * @author laway
 */
@Data
@Builder
public class SumProxyRewardRespDTO {

    @ApiModelProperty(value = "优惠类型名称")
    private String provideName;

    @ApiModelProperty(value = "人数")
    private Long userCount;

    @ApiModelProperty(value = "优惠金额")
    private BigDecimal amount;

}
