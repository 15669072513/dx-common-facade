package com.dx.facade.report.param.proxycommission;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

import com.dx.facade.member.proxy.req.SelectPagingQueryReqDTO;

/**
 * 佣金审核下钻接口(统计活跃人数)s
 *
 * @author kygo
 * @version 1.0.0
 * @since 2021.9.22
 */
@Data
@Builder
@ApiModel(value = "佣金审核-请求聚合信息详情", description = "请求聚合信息详情封装")
public class SumProxyCommissionAuditReqDTO extends SelectPagingQueryReqDTO {

    @ApiModelProperty(value = "商户ID")
    @NotNull(message = "商户ID不能为空")
    private Long merchantId;

    @ApiModelProperty(value = "代理ID")
    @NotNull(message = "代理ID不能为空")
    private Long proxyId;

    @ApiModelProperty(value = "查询月份,格式: yyyyMM")
    @NotNull(message = "查询月份不能为空")
    private String reportMonth;

}
