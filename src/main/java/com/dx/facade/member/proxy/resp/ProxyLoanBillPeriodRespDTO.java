package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ProxyLoanBillPeriodRespDTO {
    @ApiModelProperty("账单开始日期 格式yyyyMMdd")
    private Integer periodStDate;

    @ApiModelProperty("账单结束日期 格式yyyyMMdd")
    private Integer periodEnDate;
}