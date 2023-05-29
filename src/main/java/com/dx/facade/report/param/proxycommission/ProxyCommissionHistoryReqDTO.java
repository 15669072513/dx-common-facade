package com.dx.facade.report.param.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ProxyCommissionHistoryReqDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午2:06:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyCommissionHistoryReqDTO {

    /** proxyId */
    @ApiModelProperty(value = "代理ID", required = true, example = "0")
    private Long proxyId;

    @ApiModelProperty(value = "统计月份", required = true, example = "202107")
    private Integer statisticsMonth;

    /** payoutStatus */
    @ApiModelProperty(value = "查询的状态(0-未结清 1-已结清 2-无佣金)，不传查全部", required = true, example = "0")
    private Integer payoutStatus;

    @ApiModelProperty(value = "历史佣金查询时,排序方式(1-团队佣金 2-游戏盈亏)")
    private Integer orderKey;

    @ApiModelProperty(value = "历史佣金查询时,排序方式(asc-正序 desc-逆序)")
    private String orderType;
}
