package com.dx.facade.member.proxy.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import com.dx.facade.report.param.base.MultiplyMerchantAble;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemberRebateAuditedRecordReqDTO extends LocalDatePageRequest implements MultiplyMerchantAble {

    @ApiModelProperty(value = "会员账号")
    private String memberName;

    @ApiModelProperty(value = "总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private int dataAreaType;

    @ApiModelProperty(value = "单号")
    private String orderNo;

    @ApiModelProperty(value = "订单状态(1-一审拒绝,3-二审拒绝,4-审核通过.空值查询全部状态)")
    private String orderStatus;

    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月, 默认1")
    private Integer cycleType=1;

    @ApiModelProperty(value = "返点金额最小值")
    private BigDecimal rebateAmountMin;

    @ApiModelProperty(value = "返点金额最大值")
    private BigDecimal  rebateAmountMax;

}
