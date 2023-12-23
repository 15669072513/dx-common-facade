package com.dx.facade.report.resp.proxy;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-ProxyReturnLoanRespDTO", description = "代理报表对象")
public class ProxyReturnLoanRespDTO implements Serializable {

    @ApiModelProperty(value = "应还账款金额")
    private BigDecimal returnLoanAmount;

    @ApiModelProperty(value = "本期返点金额")
    private BigDecimal rebateAmount;




}
