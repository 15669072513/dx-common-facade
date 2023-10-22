package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;

/**
 * <p>
 * 虚拟币汇率配置表
 * </p>
 *
 * @author Jackma
 * @since 2022-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateVirtualRateConfigReq implements BaseParmDTO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("汇率")
    private BigDecimal rate;

    @ApiModelProperty("浮动汇率")
    private BigDecimal floatRate;

    @ApiModelProperty("操作人")
    private String operator;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(rate, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("rate"));
        Assert.notNull(floatRate, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("floatRate"));
        Assert.hasText(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
    }
}
