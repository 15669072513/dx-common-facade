package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionReqDTO {
    @ApiModelProperty(value = "代理账号",example = "132325346545")
    private String proxyId;

    @ApiModelProperty(value = "月份",example = "202204")
    private String reportYm;

    @ApiModelProperty(value = "结算状态(0-已取消,1-未结清,2-已结清,3-无佣金,4-已发放)",example = "1")
    private Integer payoutStatus;

    @ApiModelProperty(value = "历史佣金查询时,排序方式(1-团队佣金 2-游戏盈亏)")
    private Integer orderKey;

    @ApiModelProperty(value = "历史佣金查询时,排序方式(asc-正序 desc-逆序)")
    private String orderType;
}
