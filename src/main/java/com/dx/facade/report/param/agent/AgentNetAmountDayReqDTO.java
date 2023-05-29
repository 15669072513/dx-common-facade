package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ProxyNetAmountDayReqDTO
 *
 * @author kygo
 * @version 1.0.0
 * @since 20220412
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentNetAmountDayReqDTO {
    @ApiModelProperty(value = "代理账号",example = "abc123")
    private String proxyName;

    @ApiModelProperty(value = "代理ID",example = "100001")
    private String proxyId;

    @ApiModelProperty(value = "开始时间",example = "2021-06-01")
    private String startDate;

    @ApiModelProperty(value = "结束时间",example = "2021-07-01")
    private String endDate;
}
