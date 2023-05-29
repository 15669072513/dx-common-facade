package com.dx.facade.report.param.proxycommission;

import com.dx.facade.report.param.base.LocalDateRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ProxyCommissionMonthBudgetReqDto
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午2:06:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyCommissionBudgetReqDTO extends LocalDateRequest {

    /** proxyId */
    @ApiModelProperty(value = "代理ID", required = true, example = "0")
    private Long proxyId;
}
