package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyCommissionLockReqDTO {
    @ApiModelProperty(value = "代理账号",example = "132325346545")
    private List<String> proxyId;

    @ApiModelProperty(value = "月份",example = "2022-04")
    @NotNull(message = "月份不能为空")
    private String reportYm;

    @ApiModelProperty(value = "结算状态(0-已取消,1-未结清,2-已结清,3-无佣金,4-已发放)",example = "1")
    private Integer payoutStatus;
}
