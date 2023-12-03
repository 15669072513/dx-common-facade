package com.dx.facade.report.resp.report.proxy;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyRebatePointNetAmountResp 代理返点日明细记录
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyRebatePointNetAmountResp extends ProxyRebatePointNetAmountSummaryResp {

    /**
     * staticsDate
     */
    @ApiModelProperty(value = "日期", example = "20210901")
    private String staticsDate;
    @ApiModelProperty(value = "商户id")
    private Long merchantId;
    @ApiModelProperty(value = "代理iid")
    private Long proxyId;
    /**
     * proxyName
     */
    @ApiModelProperty(value = "代理账号", example = "zw9z_string0001")
    private String proxyName;

    @ApiModelProperty("代理层级路径（代理账号）/我得团队/aaa/bbb")
    private String proxyPathUsername;
}
