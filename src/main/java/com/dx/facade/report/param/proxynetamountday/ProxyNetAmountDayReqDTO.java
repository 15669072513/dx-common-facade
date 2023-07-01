package com.dx.facade.report.param.proxynetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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

    /**
     * proxyId
     */
    @ApiModelProperty(value = "代理ID", example = "100001", required = true)
    private Long proxyId;

    /**
     * proxyId
     */
    @ApiModelProperty(value = "上级代理ID", example = "100001", required = true)
    private Long parentProxyId;

    /**
     * String
     */
    @ApiModelProperty(value = "代理名称", example = "test", required = true)
    private String proxyName;

    /**
     * startDate
     */
    @ApiModelProperty(value = "开始日期", required = true, example = "20210601")
    private Integer startDate;

    /**
     * endDate
     */
    @ApiModelProperty(value = "结束日期", required = true, example = "20210631")
    private Integer endDate;

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @Min(value = 1, message = "当前页最小值不能小于1")
    @Max(value = 2147483647, message = "当前页最大值不能大于2147483647")
    @NotNull(message = "当前页不能为空")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @Min(value = 1, message = "每页条数最小值不能小于1")
    @Max(value = 10000, message = "当前页最大值不能大于10000")
    @NotNull(message = "每页条数不能为空")
    private Long pageSize = 20L;

}
