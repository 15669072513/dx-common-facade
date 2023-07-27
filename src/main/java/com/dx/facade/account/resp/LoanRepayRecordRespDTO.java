package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanRepayRecordRespDTO {

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operateTime;

    @ApiModelProperty(value = "借还款id")
    private Long recordId;

    @ApiModelProperty(value = "借还款记录类型：1借款记录,2还款记录")
    private Integer recordType;

    @ApiModelProperty(value = "操作金额")
    private BigDecimal amount;
}
