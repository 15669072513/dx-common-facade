package com.dx.facade.report.param.proxynetamountmonth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

import com.dx.facade.common.PageRequest;

/**
 * 代理月盈亏查询参数
 *
 * @author focus
 * @version 1.0.0
 * @since 2022年4月13日 下午4:05:57
 */
@Data
@ApiModel(value = "ProxyMonthNetAmountReqDTO", description = "代理月盈亏查询参数对象")
public class ProxyMonthNetAmountReqDTO extends PageRequest {

    /**
     * proxyId
     */
    @ApiModelProperty("代理账号")
    private Long proxyId;

    @ApiModelProperty("商户id")
    private Long merchantId;

    /**
     * currentProxyID
     */
    @ApiModelProperty("当前用户代理账号ID")
    private Long currentProxyId;

    /**
     * currentProxyName
     */
    @ApiModelProperty("当前用户代理账号名")
    private String currentProxyName;

    @ApiModelProperty(value = "上级代理名称")
    private String parentProxyName;

    @ApiModelProperty("当前用户代理账号名")
    private String selfProxyName;

    /**
     * parentProxyId
     */
    @ApiModelProperty("上级代理ID")
    private Long parentProxyId;

    /** staticMonth*/
    @ApiModelProperty(value = "月份", required = true, example = "202106")
    @NotNull(message = "月份参数不能为空")
    private Integer staticMonth;

    /**
     * proxyName
     */
    @ApiModelProperty("代理账号")
    private String proxyName;

    /**
     * orderKey
     */
    @ApiModelProperty(value = "排序列: 1-总投注,2-总有效投注,3-游戏盈亏,4-会员返水,5-会员优惠,6-会员调整", example = "1")
    private Integer orderKey;

    /**
     * orderType
     */
    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "asc";
}
