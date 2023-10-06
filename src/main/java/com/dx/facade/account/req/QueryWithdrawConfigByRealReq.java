package com.dx.facade.account.req;

import org.springframework.util.Assert;

import com.dx.enums.ConstantEnums;
import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryWithdrawConfigByRealReq implements BaseParmDTO {

    @ApiModelProperty("用户类型")
    private Integer userType;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("代理用户id")
    private Long proxyId;

    @Override
    public void check() {
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        if(ConstantEnums.UserType.member.code().equals(userType)){
            Assert.notNull(vipLevel, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("vipLevel"));
            Assert.isTrue(vipLevel >= 0 && vipLevel <= 10 , ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("vipLevel"));
        }
//        if(ConstantEnums.UserType.agent.code().equals(userType)){
//            Assert.notNull(proxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyId"));
//        }
    }
}
