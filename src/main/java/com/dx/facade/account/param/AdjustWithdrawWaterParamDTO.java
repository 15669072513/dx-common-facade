package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import com.dx.facade.account.req.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;
import java.util.Objects;

@Data
public class AdjustWithdrawWaterParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "会员id(18)", required = true)
    private Long userId;

    @ApiModelProperty(value = "调整类型：0-增加 1-扣除", required = true, example = "1")
    private Integer adjustType;

    @ApiModelProperty(value = "调整数量", required = true, example = "100")
    private BigDecimal adjustAmount;

    @ApiModelProperty(value = "备注", required = true, example = "备注")
    private String remark;

    @Override
    public void check() {
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(adjustType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("adjustType"));
        Assert.isTrue(Objects.nonNull(adjustAmount) && adjustAmount.compareTo(BigDecimal.ZERO) > 0,
                ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("adjustAmount"));
        Assert.hasLength(remark, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("remark"));
    }
}
