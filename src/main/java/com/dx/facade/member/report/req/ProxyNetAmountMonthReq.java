package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ProxyNetAmountMonthReq
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月16日 下午9:32:29
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("代理盈亏月请求参数")
public class ProxyNetAmountMonthReq extends MonthPageRequest {


    @ApiModelProperty(value = "所属商户id", example = "1111")
    private String merchantId;

    /** proxyName */
    @ApiModelProperty("代理账号")
    private String proxyName;

    /** parentProxyName */
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;

    /** accountTypeList */
    @ApiModelProperty("代理类型")
    private List<Integer> accountTypeList;

    /** accountLevelList */
    @ApiModelProperty("代理层级")
    private List<String> accountLevelList;

}
