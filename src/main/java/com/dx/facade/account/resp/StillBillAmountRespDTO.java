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
@NoArgsConstructor
@AllArgsConstructor
public class StillBillAmountRespDTO {

    @ApiModelProperty("是否允许提款")
    private Boolean allowWithdraw;

    @ApiModelProperty("流水要求")
    private BigDecimal validAmount;

    @ApiModelProperty("剩余流水额")
    private BigDecimal differentAmount;

    @ApiModelProperty("已完成流水")
    private BigDecimal completeAmount;

    @ApiModelProperty("计算时间")
    private LocalDateTime calTime;
}
