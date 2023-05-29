package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 资金->资金调整->非总代佣金操作
 *
 * @author kygo
 * @version 1.0.0
 * @since 2021.9.23
 */
@Data
public class ProxyCommissionNonGeneralRecordOpReqDTO implements Serializable {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "商户号")
    private Long merchantId;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "操作人ID")
    private Long operatorID;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "月份")
    private String reportYm;

    @ApiModelProperty(value = "操作类型.1-代发佣金,2-取消佣金")
    private Integer operateType;

    @ApiModelProperty(value = "转出代理")
    private Long transoutProyId;

    @ApiModelProperty(value = "转入代理")
    private Long transinProxyId;

    @ApiModelProperty(value = "转出额度")
    private BigDecimal transAmount;


}
