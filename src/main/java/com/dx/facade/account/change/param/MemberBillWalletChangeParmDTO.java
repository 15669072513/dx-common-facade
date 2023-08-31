package com.dx.facade.account.change.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.change.TransType;
import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;

@Slf4j
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="OBQJ会员账变且计算流水", description="OBQJ会员账变且计算流水")
public class MemberBillWalletChangeParmDTO extends MemberWalletChangeParmDTO implements IBillParm {

    @ApiModelProperty(value="流水倍数")
    private BigDecimal validMultiple;

    @ApiModelProperty(value="流水总金额")
    private BigDecimal validAmount;

    @ApiModelProperty(value="类名")
    @Builder.Default
    private String name = Constant.MEMBERBILL;

    @Override
    public void check() {
        super.check();
        Assert.notNull(validMultiple, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("validMultiple"));
        Assert.notNull(validAmount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("validAmount"));
        Assert.isTrue(validMultiple.compareTo(BigDecimal.ZERO) >= 0, ErrorCode.PARAM_EXCEPTION.messageAfter("validMultiple 不应为负数"));
        Assert.isTrue(validAmount.compareTo(BigDecimal.ZERO) >= 0, ErrorCode.PARAM_EXCEPTION.messageAfter("validAmount 不应为负数"));
//        Assert.isTrue(super.getAmount().multiply(validMultiple).compareTo(validAmount) == 0, ErrorCode.PARAM_EXCEPTION.messageAfter("会员流水总金额计算错误"));

        if(super.getWalletChange().transType().equals(TransType.out)) {
            throw new IllegalArgumentException(ErrorCode.PARAM_EXCEPTION.messageAfter("支出不应该使用这个账变对象"));
        }
    }
}
