package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Objects;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLastLoginLogParamDTO implements BaseParmDTO{


    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty("用户类型 （0-会员 1-代理）")
    private Integer userType;

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty(value = "会员/代理账号")
    private String userName;

    @Override
    public void check() {
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
        if(Objects.isNull(userId)){
            Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
            Assert.hasLength(userName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userName"));
        }
    }
}
