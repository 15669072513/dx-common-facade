package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.exception.ErrorCode;
import com.dx.facade.account.req.BaseParmDTO;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckActivityConfigMemberParmDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "活动id", required = true)
    private Long activityId;

    @ApiModelProperty(value = "用户类型", required = true)
    private Integer userType;

    @ApiModelProperty(value = "用户id", required = true)
    private Long userId;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(activityId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("activityId"));
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
    }
}
