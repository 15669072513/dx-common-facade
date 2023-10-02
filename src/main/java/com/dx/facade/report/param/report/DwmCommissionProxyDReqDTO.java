package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 返佣结算详情
 * @author
 */
@Data
@ApiModel("返佣结算详情-请求对象")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DwmCommissionProxyDReqDTO {

    /**
     * 报表日期
     */
    @ApiModelProperty("报表日期")
    @NotNull(message = "报表日期不能为空")
    private Integer reportDate;

    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    @NotNull(message = "代理id不能为空")
    private Long proxyId;
}
