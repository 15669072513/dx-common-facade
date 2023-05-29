package com.dx.facade.member.report.req;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import com.dx.facade.report.param.base.MultiplyMerchantAble;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 下午16:45:08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("佣金收付报表分页查询接口请求数据传输对象")
public class ReportCommissionReqDTO implements Serializable, MultiplyMerchantAble {

    /***
     * 商户Id，每个业务都要传，从上层传入
     */
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private int dataAreaType;

    /**
     * 代理Id，应该前端需要带入
     */
    @ApiModelProperty(value = "代理Id")
    private Long proxyId;

    /**
     * 查询开始月份
     */
    @ApiModelProperty(value = "开始月份", example = "202109")
    private Integer startMonth;

    /**
     * 查询结束月份
     */
    @ApiModelProperty(value = "结束月份", example = "202109")
    private Integer endMonth;

    /**
     * 代理帐号名称，由proxyName改名
     */
    @ApiModelProperty(value = "代理帐号名称", example = "zale11")
    private String proxyCaption;

    /**
     * 直属上级代理帐号名称，由proxyAccount改名
     */
    @ApiModelProperty(value = "直属上级代理帐号名称")
    private String parentProxyAccount;

    /**
     * 代理类型唯一标识
     */
    @ApiModelProperty(value = "代理类型唯一标识")
    private List<Integer> proxyTypeId;

    /**
     * 代理层级唯一标识
     */
    @ApiModelProperty(value = "代理层级唯一标识")
    private List<Long> proxyLevelId;

    /**
     * 剩余欠款-最小数值
     */
    @ApiModelProperty(value = "剩余欠款-最小数值")
    private BigDecimal debtsMinValue;

    /**
     * 剩余欠款-最大数值
     */
    @ApiModelProperty(value = "剩余欠款-最大数值")
    private BigDecimal debtsMaxValue;

    /**
     * 剩余未收-最小数值
     */
    @ApiModelProperty(value = "剩余未收-最小数值")
    private BigDecimal balanceMinValue;

    /**
     * 剩余未收-最大数值
     */
    @ApiModelProperty(value = "剩余未收-最大数值")
    private BigDecimal balanceMaxValue;

    @ApiModelProperty(value = "排序列: 1-实际收益, 2-应付佣金, 3-实付佣金, 4-剩余欠款, 5-应收佣金, 6-实收佣金, 7-剩余未收", example = "1")
    @Range(min = 1, max = 7, message = "排序列必须 ≥ 1 并且 ≤ 7")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "desc";
}