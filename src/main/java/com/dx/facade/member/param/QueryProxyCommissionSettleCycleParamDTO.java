package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 更新代理佣金结算周期
 * 
 * @Author: fitz
 * @Date 2023/6/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新代理佣金结算周期", description = "更新代理佣金结算周期")
public class QueryProxyCommissionSettleCycleParamDTO{

    @ApiModelProperty(value = "商户id (20)")
    private Long merchantId;
	
    @ApiModelProperty(value = "代理id (20)")
    private Long proxyId;
    
}
