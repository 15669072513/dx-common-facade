package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

/**
 * 个人设置(开启免转自动 / 手动)参数封装
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTransferInfoParamDTO implements BaseParmDTO{

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员id")
    private Long userId;

    /**
     * 开启免转模式 0-手动，1-免转
     */
    @ApiModelProperty(value = "开启免转模式 0-手动，1-免转")
    private Integer noTransfer;

    @Override
    public void check() {
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(noTransfer, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("noTransfer"));
    }
}
