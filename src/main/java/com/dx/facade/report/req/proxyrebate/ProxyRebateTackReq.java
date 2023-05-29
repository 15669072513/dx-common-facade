package com.dx.facade.report.req.proxyrebate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返点管理 - 返点领取
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProxyRebateTackReq", description = "返点领取")
public class ProxyRebateTackReq {

    @ApiModelProperty(value = "代理ID", example = "1")
    private Long proxyId;

    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月 此版本只传1-天", required = true, example = "1")
    private Integer cycleType;

    @ApiModelProperty(value = "周期名称", required = true, example = "20210909")
    private String cycleName;
}
