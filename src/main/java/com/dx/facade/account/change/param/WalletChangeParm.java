package com.dx.facade.account.change.param;

import com.dx.facade.account.change.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Slf4j
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "账变基础对象", description = "账变基础对象")
public abstract class WalletChangeParm implements IWalletChangeParm {

    @ApiModelProperty(value = "账变订单号，幂等性。传递订单号，确保一笔交易不会重复执行")
    private String eventId;

    @ApiModelProperty(value = "账变事件发生时间")
    private LocalDateTime eventTime;

    @ApiModelProperty(value = "账变总金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "账变备注")
    private String remark;

    @ApiModelProperty(value = "账变业务")
    private IWalletChange walletChange;

    @ApiModelProperty("通用扩展字段A")
    private String extensionA;

    @ApiModelProperty("通用扩展字段B")
    private String extensionB;

    @ApiModelProperty("通用扩展字段C")
    private BigDecimal extensionC;

    @Override
    public void check() {
        //公共参数简单校验
        Assert.hasText(eventId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));
        Assert.notNull(eventTime, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventTime"));
        Assert.notNull(amount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("amount"));

        //只有代理流水返点允许amount为负的情况
        if (!(walletChange instanceof ProxyWalletChange && walletChange.changeType().code().equals(ProxyChangeType.v2_cash_rebate.code()))) {
            Assert.isTrue(amount.compareTo(BigDecimal.ZERO) > 0, ErrorCode.PARAM_EXCEPTION.messageAfter("amount 应大于0"));
        }

        Assert.hasText(remark, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("remark"));
        Assert.notNull(walletChange, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("walletChange"));
    }
}
