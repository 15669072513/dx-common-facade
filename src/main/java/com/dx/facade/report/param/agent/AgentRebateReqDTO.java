package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ProxyRebateReqDto
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月19日 下午1:39:22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgentRebateReqDTO {

    /** 代理ID */
    @ApiModelProperty(value = "代理ID", required = true, example = "1")
    private String proxyId;

    @ApiModelProperty(value = "代理name", required = true, example = "1")
    private String proxyName;

    @ApiModelProperty(value = "商户ID",hidden = true)
    private Long merchantId;

    /**
     * 周期类型: 1-天 2-周 3-月
     * 目前只哟偶 1-天
     */
    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月",example = "1")
    private Integer cycleType;

    /** 周期名称开始 */
    @ApiModelProperty(value = "周期名称开始",example = "20220301")
    private String cycleNameStart;

    /** 周期名称结束 */
    @ApiModelProperty(value = "周期名称结束",example = "20220301")
    private String cycleNameEnd;

    /** 返点状态 */
    @ApiModelProperty(value = "返点状态",example = "20220301")
    private Integer payoutStatus;

}
