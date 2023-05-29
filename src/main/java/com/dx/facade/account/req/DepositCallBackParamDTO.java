package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.exception.ErrorCode;

import java.math.BigDecimal;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepositCallBackParamDTO {

    @ApiModelProperty("我方订单号")
    private String eventId;

    @ApiModelProperty("三方商户订单号")
    private String thirdOrderNo;

    @ApiModelProperty("支付状态：成功1，失败2")
    private int status;

    @ApiModelProperty("订单⾦额")
    private BigDecimal amount;

    public void check() {
        Assert.notNull(amount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("amount"));
        Assert.hasText(eventId,ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));
    }

}
