package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

@Data
public class UserRemarkListParamDTO implements BaseParmDTO{

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("用户类型 （0-会员 1-代理）")
    private Integer userType;

    @Override
    public void check() {
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
    }
}
