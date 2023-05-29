package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import com.dx.facade.report.param.base.MultiplyMerchantAble;

/**
 * TODO 不知是否可以理解为待收
 * @desc 其实与ReportProxyDebtsReqDTO一样，但考虑到以后会有不一样儿的请求参数，所以分为2个
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 下午16:43:33
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("未收完明细下钻接口请求数据传输对象")
public class ReportProxyReceivableReqDTO implements Serializable, MultiplyMerchantAble {

    /***
     * 商户Id，每个业务都要传，从上层传入
     */
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private int dataAreaType;

    /**
     * 查询开始月份，从上层传入
     */
    @ApiModelProperty(value = "开始月份", required = true, example = "202109")
    private Integer startMonth;

    /**
     * 查询结束月份，从上层传入
     */
    @ApiModelProperty(value = "结束月份", required = true, example = "202109")
    private Integer endMonth;

    /**
     * 代理Id
     */
    @ApiModelProperty(value = "代理Id")
    private Long proxyId;
}