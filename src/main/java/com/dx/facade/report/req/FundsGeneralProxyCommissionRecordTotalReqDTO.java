package com.dx.facade.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 @title 总代佣金记录总计接口请求数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月27日 23:15:56
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("总代佣金记录总计接口请求数据传输对象")
public class FundsGeneralProxyCommissionRecordTotalReqDTO {

    @ApiModelProperty(value = "代理ID")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty(value = "开始月份:yyyyMM,不能为空")
    private String startMonth;

    @ApiModelProperty(value = "结束月份:yyyyMM,不能为空")
    private String endMonth;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "是否总代理账号(0-总代理 1-非总代)")
    private String isMainProxy;

    @ApiModelProperty(value = "客户端状态 (0-未结清 1-已结清 2-无佣金)")
    private Integer payoutStatus;

    @ApiModelProperty(value = "代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换 ）")
    private List<Integer> accountType;

    @ApiModelProperty(value = "账号状态")
    private Integer accountStatus;

    @ApiModelProperty(value = "风控层级")
    private Integer windControlLevel;

    @ApiModelProperty(value = "最小个人佣金")
    private BigDecimal totalPersonCommissionAmountMin;

    @ApiModelProperty(value = "最大个人佣金")
    private BigDecimal totalPersonCommissionAmountMax;

    @ApiModelProperty(value = "最小下级总佣金")
    private BigDecimal totalChildCommissionAmountMin;

    @ApiModelProperty(value = "最大下级总佣金")
    private BigDecimal totalChildCommissionAmountMax;

    @ApiModelProperty(value = "最小团队总拥金")
    private BigDecimal commissionAmountMin;

    @ApiModelProperty(value = "最大团队总拥金")
    private BigDecimal commissionAmountMax;
}
