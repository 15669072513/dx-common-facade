package com.dx.facade.account.param;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import com.dx.facade.account.req.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.NotNull;

@Data
public class UserVipActivityInfoParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 场馆编号
     */
    @ApiModelProperty(value = "场馆编号")
    private String gameCode;

    /**
     * VIP等级
     */
    @ApiModelProperty(value = "VIP等级", required = true)
    @NotNull(message = "VIP等级不允许为空")
    private Integer vipLevel;

    @Override
    public void check() {
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(vipLevel, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("vipLevel"));
    }
}
