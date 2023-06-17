package com.dx.facade.account.req;

import java.io.Serializable;
import java.math.BigDecimal;


import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

@Data
public class WalletBalanceDTO implements BaseParmDTO {

	private static final long serialVersionUID = -2464195843194814131L;


	@ApiModelProperty("三方唯一请求流水号")
    private String serialNo;

    @ApiModelProperty("发生金额")
    private BigDecimal amount;

    /**
     * @see com.dx.facade.account.enums.Subject
     */
    @ApiModelProperty("发生科目")
    private String subject;

    @ApiModelProperty("用户id")
    private Long userId;

    /**
     * @see com.dx.enums.ConstantEnums.UserType
     */
    @ApiModelProperty("用户类型")
    private Integer userType;

    @Override
    public void check() {
        Assert.notNull(this.serialNo, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("serialNo"));
        Assert.notNull(this.amount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("amount"));
        Assert.notNull(this.userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(this.userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
    }
}
