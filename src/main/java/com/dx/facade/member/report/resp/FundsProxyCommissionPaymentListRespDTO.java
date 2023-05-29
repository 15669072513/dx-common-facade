package com.dx.facade.member.report.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 @title 佣金收付分页接口响应数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月27日 22:45:52
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("佣金收付分页接口响应数据传输对象")
public class FundsProxyCommissionPaymentListRespDTO implements Serializable {

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "所属商户ID")
    private String merchantId;

    @ApiModelProperty(value = "所属商户")
    private String merchantName;

    @ApiModelProperty(value = "佣金月份:yyyy-MM,不能为空")
    private String transMonth;

    @ApiModelProperty(value = "付款代理（转出代理名称）")
    private String transOutProxyName;

    @ApiModelProperty(value = "代理层级（转出代理层级Id ）")
    private Long transOutProxyLevelId;

    @ApiModelProperty(value = "支付佣金（交易金额）")
    private BigDecimal transAmount;

    @ApiModelProperty(value = "付款时间（交易时间）")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime transDate;

    @ApiModelProperty(value = "收款代理 (转入代理层级名称)")
    private String transInProxyName;

    @ApiModelProperty("币种")
    private String currency;


}
