package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @ApiModelProperty("操作时间")
    @TableField("operate_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime operateTime;

    @ApiModelProperty(value = "借还款id")
    private String recordId;

    @ApiModelProperty(value = "借还款记录类型：1借款记录,2还款记录")
    private Integer recordType;

    @ApiModelProperty(value = "操作金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "货币")
    private String currency;
}
