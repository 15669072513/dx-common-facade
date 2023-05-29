package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.NotNull;

@Data
public class UpdMemberAuditDetailParamDTO  implements BaseParmDTO{

    @ApiModelProperty(value = "审核单ID(18)", required = true,example = "1454654635464")
    @NotNull(message = "id不能为空")
    private Long id;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
    }
}
