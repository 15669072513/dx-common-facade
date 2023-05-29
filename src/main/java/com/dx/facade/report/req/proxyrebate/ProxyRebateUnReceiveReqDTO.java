package com.dx.facade.report.req.proxyrebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyRebateUnReceiveReqDTO {

    /** proxyId */
    @ApiModelProperty(value = "代理ID", required = true, example = "1")
    private Long proxyId;

    @ApiModelProperty(value = "商户ID", required = true, example = "1")
    private List<Long> merchantId;

    /** startDate */
    @ApiModelProperty(value = "查询开始日期", required = true, example = "20210909")
    private Integer startDate;

    /** endDate */
    @ApiModelProperty(value = "查询结束日期", required = true, example = "20210909")
    private Integer endDate;
}
