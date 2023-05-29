package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateActivityOnlyFlagParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long userId;

    @ApiModelProperty(value="首存活动每会员一次参加标识，0未参加，1已参加")
    private Integer activityOnlyFlag;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(activityOnlyFlag, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("activityOnlyFlag"));
    }
}
