package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.util.Assert;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddPaymentChannelConfigReq implements BaseParmDTO {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("操作人")
    private String operator;

    @ApiModelProperty("支付通道id")
    private Long paymentChannelId;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(paymentChannelId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("paymentChannelId"));
    }
}
