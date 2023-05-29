package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class ProxyCommissionRecordCommonReqDTO implements Serializable {


    @ApiModelProperty(value = "开始月份:yyyy-MM,不能为空")
    private String startMonth;

    @ApiModelProperty(value = "结束月份:yyyy-MM,不能为空")
    private String endMonth;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "商户号")
    private Integer merchantId;

    @ApiModelProperty(value = "锁定状态")
    private Integer lockStatus;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "一审核人账号")
    private String audit1Operator;

    @ApiModelProperty(value = "二审核人账号")
    private String audit2Operator;

    @ApiModelProperty(value = "是否总代理账号(0-总代理 1-非总代)")
    private String isMainProxy;

    @ApiModelProperty(value = "客户端状态 (0-未结清 1-已结清 2-无佣金)")
    private Integer payoutStatus;

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

    @ApiModelProperty(value = "佣金最小")
    private BigDecimal commissionOnlyAmountMin;

    @ApiModelProperty(value = "佣金最大")
    private BigDecimal commissionOnlyAmountMax;

    @ApiModelProperty(value = "报表创建时间(开始申请时间)")
    private Date startCreatedTime;

    @ApiModelProperty(value = "报表创建时间(结束申请时间)")
    private Date endCreatedTime;

    @ApiModelProperty(value = "")
    private List<Integer> orderStatusList;

}
