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
     * 周期起始日期
     */
    @ApiModelProperty("周期起始日期")
    private Integer cycleStartDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty("周期结束日期")
    private Integer cycleEndDate;

    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    @NotNull(message = "代理id不能为空")
    private Long proxyId;
}
