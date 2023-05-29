package com.dx.facade.report.param.proxynetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ProxyNetAmountDayReqDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:46:05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountDayReqDTO {

    /** proxyId */
    @ApiModelProperty(value = "代理ID", example = "100001", required = true)
    private Long proxyId;

    /** String */
    @ApiModelProperty(value = "代理名称", example = "test", required = true)
    private String proxyName;

    /** startDate */
    @ApiModelProperty(value = "开始日期", required = true, example = "20210601")
    private Integer startDate;

    /** endDate */
    @ApiModelProperty(value = "结束日期", required = true, example = "20210631")
    private Integer endDate;
}
