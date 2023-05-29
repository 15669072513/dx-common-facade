package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 资金->资金调整->非总代佣金操作
 *
 * @author kygo
 * @version 1.0.0
 * @since 2021.9.23
 */
@Data
public class ProxyCommissionNonGeneralRecordReqDTO implements Serializable {

    @ApiModelProperty(value = "结算yyyyMM")
    private Long reportYm;

    @ApiModelProperty(value = "商户号")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private Integer dataAreaType;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyAccount;

    @ApiModelProperty(value = "代理层级(2,3,4,5,...)")
    private List<Integer> proxyLevelId;

    @ApiModelProperty(value = "代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private List<Integer> accountType;

    @ApiModelProperty(value = "剩余欠款最小")
    private BigDecimal notPayAmountMin;

    @ApiModelProperty(value = "剩余欠款最大")
    private BigDecimal notPayAmountMax;

    @ApiModelProperty(value = "剩余未收最小")
    private BigDecimal notRecviedAmountMin;

    @ApiModelProperty(value = "剩余未收最大")
    private BigDecimal notRecviedAmountMax;

    @ApiModelProperty(value = "排序方式(1-实际收益 2-应付佣金 3-实付佣金 4.剩余欠款 5-应收佣金 6-实收佣金 7-剩余未收")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式(asc-正序 desc-逆序)")
    private String orderType;
}
