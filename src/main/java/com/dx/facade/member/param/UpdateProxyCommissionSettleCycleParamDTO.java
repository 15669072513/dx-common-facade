package com.dx.facade.member.param;

import java.util.List;

import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

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
public class UpdateProxyCommissionSettleCycleParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id (20)")
    private Long merchantId;
	
    @ApiModelProperty(value = "代理id (20)")
    private List<Long> proxyIds;
    
    @ApiModelProperty("佣金结算周期 1：半月结 2：月结")
    private Integer commissionSettleCycle;
    
    @Override
    public void check() {
        Assert.notNull(commissionSettleCycle, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("commissionSettleCycle"));
    }

}
