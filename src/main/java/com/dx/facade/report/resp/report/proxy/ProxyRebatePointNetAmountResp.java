package com.dx.facade.report.resp.report.proxy;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ProxyRebatePointNetAmountResp 代理返点日明细记录
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
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
    @ApiModelProperty("是否有下级代理 ture:有，false:无")
    private Boolean isAllSub;

    @ApiModelProperty(value = "代理层级")
    private Integer proxyLevel;

    @ApiModelProperty("直属上级代理")
    private String parentProxyName;
}
