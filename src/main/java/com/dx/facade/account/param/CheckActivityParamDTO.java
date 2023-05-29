package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import com.dx.facade.account.req.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class CheckActivityParamDTO implements BaseParmDTO {

    /**
     * 商户ID
     */
    @ApiModelProperty(value = "商户编号 (20)", required = true, hidden = true)
    private Long merchantId;

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID (20)", required = true, hidden = true)
    private Long userId;

    /**
     * 活动ID
     */
    @ApiModelProperty(value = "活动ID")
    private Long activityId;

    /**
     * 场馆编号
     */
    @ApiModelProperty(value = "场馆编号", required = true)
    @NotBlank(message = "场馆编号不允许为空")
    private String gameCode;

    @ApiModelProperty("终端[0:IOS_H5,1:IOS_APP,2:PC,3:Android_H5,5:Android_APP]")
    private String clientType;

    @ApiModelProperty(value = "金额", example = "10")
    private BigDecimal amount;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(activityId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("activityId"));
        Assert.notNull(gameCode, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("gameCode"));
        Assert.notNull(clientType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clientType"));
    }
}
