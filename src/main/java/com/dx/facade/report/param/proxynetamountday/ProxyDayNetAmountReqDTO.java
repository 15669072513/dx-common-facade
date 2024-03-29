package com.dx.facade.report.param.proxynetamountday;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

import com.dx.facade.common.PageRequest;

/**
 * 代理日盈亏查询参数
 *
 * @author focus
 * @version 1.0.0
 * @since 2022年4月12日 下午7:05:57
 */
@Data
@ApiModel(value = "ProxyDayNetAmountReqDTO", description = "代理日盈亏查询参数对象")
public class ProxyDayNetAmountReqDTO extends PageRequest {

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

    @ApiModelProperty(value = "开始日期", required = true, example = "20210601")
    @NotNull(message = "开始月份参数不能为空")
    private Integer startDate;

    @ApiModelProperty(value = "结束日期", required = true, example = "20210602")
    @NotNull(message = "结束月份参数不能为空")
    private Integer endDate;

    @ApiModelProperty(value = "结束日期", required = true, example = "20210602")
    @NotNull(message = "结束月份参数不能为空")
    private Integer staticDate;
    /**
     * proxyName
     */
    @ApiModelProperty("代理账号")
    private String proxyName;

    /**
     * orderKey
     */
    @ApiModelProperty(value = "排序列: 1-总投注,2-总有效投注,3-游戏盈亏,4-会员返水,5-会员优惠,6-会员调整", example = "1")
    private String orderKey;

    /**
     * orderType
     */
    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "asc";
}
