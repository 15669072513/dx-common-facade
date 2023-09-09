package com.dx.facade.report.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import com.dx.facade.report.param.base.MultiplyMerchantAble;

/**
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 上午00:30:29
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返点报表查询接口请求数据传输对象")
public class ReportRebateReqDTO implements Serializable, MultiplyMerchantAble {

    /***
     * 商户Id，每个业务都要传，从上层传入
     */
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private int dataAreaType;

    /**
     * 周期类型: 1-天 2-周 3-月
     */
    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月", required = true, example = "1")
    private Integer cycleType;

    /**
     * 查询开始日期
     */
    @ApiModelProperty(value = "开始日期", required = true, example = "20210918")
    private Integer startDate;

    /**
     * 查询结束日期
     */
    @ApiModelProperty(value = "结束日期", required = true, example = "20210918")
    private Integer endDate;

    @ApiModelProperty(value = "代理名称", required = true, example = "20210918")
    private String proxyName;

    @ApiModelProperty(value = "代理名称", required = true, example = "20210918")
    private String topProxyName;
    
    @ApiModelProperty(value = "返点状态",example = "20220301")
    private Integer payoutStatus;
}
