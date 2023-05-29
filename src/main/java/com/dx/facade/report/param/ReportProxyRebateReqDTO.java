package com.dx.facade.report.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.io.Serializable;

/**
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 上午09:45:59
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("统计源代理明细下钻接口请求数据传输对象")
public class ReportProxyRebateReqDTO implements Serializable {

    /***
     * 商户Id，每个业务都要传，从上层传入
     */
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    /**
     * 周期类型: 1-天 2-周 3-月
     */
    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月", required = true, example = "1")
    private Integer cycleType;

    /**
     * 查询开始日期，从上层传入
     */
    @ApiModelProperty(value = "开始日期", required = true, example = "20210918")
    private Integer startDate;

    /**
     * 查询结束日期，从上层传入
     */
    @ApiModelProperty(value = "结束日期", required = true, example = "20210918")
    private Integer endDate;

    /**
     * 代理Id
     */
    @ApiModelProperty(value = "代理Id")
    private Long proxyId;

    /**
     * 代理层级Id
     * TODO 可能不需要此条件
     */
    @ApiModelProperty(value = "代理层级Id")
    private Integer proxyLevelId;

    @ApiModelProperty(value = "排序列: 1-代理层级, 2-返点发放, 3-返点调整, 4-实际返点", example = "1")
    @Range(min = 1, max = 4, message = "排序列必须 ≥ 1 并且 ≤ 4")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "desc";
}
